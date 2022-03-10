 

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Base_de_Datos  {
    
    Connection con;
    
    public Connection conexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/objetivos","root","root");
            System.out.println("si jale jaja");
        } catch (Exception e) {
            System.err.println("Error:" +e);
        }
        return con;
    }
    
    public void GuardarObjetivo(Base_de_Datos cc, Objetivo objetivo) {
        
        Connection cn = cc.conexion();        
        String sql="";
        
        int secuencia = 1;
        
        for (int i=0;i<secuencia;i++)
        {
            sql="INSERT INTO objetivos (region, campus, area, descripcion, noMetas) VALUES (?,?,?,?) ;";
            try {
                PreparedStatement pst = cn.prepareStatement(sql);

                pst.setString(1, objetivo.getRegion());
                pst.setString(2, objetivo.getCampus());
                pst.setString(3, objetivo.getArea());
                pst.setString(4, objetivo.getDescripcion());
                pst.setInt(5, objetivo.getNoMetas());
                
                
                int auxi = pst.executeUpdate();
                if (auxi>0) {
                    System.out.println("Evento creado con éxito");
                }
            } catch (SQLException ex) {
                //Logger.getLogger(EventoWindow.class.getName()).log(Level.SEVERE, null, ex);
                //JOptionPane.showMessageDialog(null,"Uno o más campos están vacíos. Revisa de nuevo");
            }   
        }
        JOptionPane.showMessageDialog(null,"Evento creado con éxito");
    }
    
    public ArrayList ConsultarObjetivos(Base_de_Datos cc, String region, String campus, String area)
    {
        Connection cn = cc.conexion();    
        Statement st;
        ResultSet rs;
        
        ArrayList objetivos = new ArrayList();
        try {
                st=cn.createStatement();
                rs=st.executeQuery("SELECT * FROM objetivos WHERE region='"+region+"' AND campus='"+campus+"' AND area='"+area+"';");
                
                while (rs.next()) {   
                    Objetivo aux = new Objetivo();
                    aux.setObjetivo(Integer.parseInt(rs.getString("idObjetivo")));
                    aux.setRegion(rs.getString("region"));
                    aux.setCampus(rs.getString("campus"));
                    aux.setArea(rs.getString("area"));
                    aux.setDescripcion(rs.getString("descripcion"));
                    aux.setNoMetas(Integer.parseInt(rs.getString("noMetas")));                 
                    objetivos.add(aux);               
                }
                cn.close();
        } catch (NumberFormatException | SQLException e) {
                System.out.println("errors: "+e);
        }       
        return objetivos;
    } 
     public ArrayList ConsultarMetas(Base_de_Datos cc, String objetivo)
    {
        Connection cn = cc.conexion();    
        Statement st;
        ResultSet rs;
        
        ArrayList metas = new ArrayList();
        try {
                st=cn.createStatement();
                rs=st.executeQuery("SELECT * FROM metas WHERE idObjetivo='"+objetivo+"';");
                
                while (rs.next()) {   
                    Meta aux = new Meta();
                    aux.setMeta(Integer.parseInt(rs.getString("idMeta")));
                    aux.setDescripcion(rs.getString("descripcion"));
                    aux.setMedidor(Integer.parseInt(rs.getString("medidor")));
                    aux.setIndicadores(rs.getString("indicadores"));
                    aux.setPrioridad(Integer.parseInt(rs.getString("prioridad")));
                    aux.setAvance(Integer.parseInt(rs.getString("avance")));
                    metas.add(aux);                
                }
                cn.close();
        } catch (NumberFormatException | SQLException e) {
                System.out.println("errorsss: "+e);
        }       
        return metas;
    }
}
