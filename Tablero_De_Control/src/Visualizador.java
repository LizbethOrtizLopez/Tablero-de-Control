

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.Locale;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.util.TableOrder;


public class Visualizador extends javax.swing.JFrame {
    
    private Base_de_Datos cc; 
    private String region;
    private String campus;
    private String area;
    private ArrayList objetivos;
   

    public Visualizador() {
        initComponents();
    }
    public Visualizador(String region,String campus, String area){
        initComponents();
        this.region = region;
        this.campus = campus;
        this.area = area;
       
        this.cc = new Base_de_Datos(); 
        setObjetivos();
        setAlcanceObjetivos();
 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        objetivoLabel = new javax.swing.JLabel();
        metaLabel = new javax.swing.JLabel();
        metaBox = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        avanceLabel = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        medidorLabel = new javax.swing.JLabel();
        prioridadLabel = new javax.swing.JLabel();
        crearObjetivoBoton = new javax.swing.JButton();
        objetivoBox = new javax.swing.JComboBox<>();
        metasPanel = new javax.swing.JPanel();
        metasAvancePanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("VISUALIZADOR");

        objetivoLabel.setText("Objetivo");

        metaLabel.setText("Meta");

        metaBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                metaBoxActionPerformed(evt);
            }
        });

        jLabel4.setText("RESULTADOS");

        jLabel5.setText("Avance");

        avanceLabel.setText("jLabel6");

        jLabel8.setText("Medidor");

        jLabel9.setText("Prioridad");

        medidorLabel.setText("jLabel11");

        prioridadLabel.setText("jLabel12");

        crearObjetivoBoton.setText("Crear Objetivo");
        crearObjetivoBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearObjetivoBotonActionPerformed(evt);
            }
        });

        objetivoBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                objetivoBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout metasPanelLayout = new javax.swing.GroupLayout(metasPanel);
        metasPanel.setLayout(metasPanelLayout);
        metasPanelLayout.setHorizontalGroup(
            metasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 495, Short.MAX_VALUE)
        );
        metasPanelLayout.setVerticalGroup(
            metasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 171, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout metasAvancePanelLayout = new javax.swing.GroupLayout(metasAvancePanel);
        metasAvancePanel.setLayout(metasAvancePanelLayout);
        metasAvancePanelLayout.setHorizontalGroup(
            metasAvancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 496, Short.MAX_VALUE)
        );
        metasAvancePanelLayout.setVerticalGroup(
            metasAvancePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 157, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(objetivoLabel)
                                    .addComponent(metaLabel)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel5))
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(medidorLabel)
                                    .addComponent(avanceLabel)
                                    .addComponent(prioridadLabel)
                                    .addComponent(objetivoBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(metaBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel4)
                                .addComponent(crearObjetivoBoton)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(metasPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(metasAvancePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(77, 77, 77)))
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(objetivoLabel)
                            .addComponent(objetivoBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(metaLabel)
                            .addComponent(metaBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(crearObjetivoBoton)
                        .addGap(21, 21, 21)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(medidorLabel)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(metasAvancePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(prioridadLabel))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(avanceLabel)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(metasPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void crearObjetivoBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearObjetivoBotonActionPerformed
        Crear_Objetivos objetivo=new Crear_Objetivos();
        objetivo.show();
    }//GEN-LAST:event_crearObjetivoBotonActionPerformed

    private void objetivoBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_objetivoBoxActionPerformed
        Objetivo obj = (Objetivo) objetivoBox.getSelectedItem();
        ArrayList metas = cc.ConsultarMetas(this.cc, String.valueOf(obj.getObjetivo()));
        for (int i=0;i<metas.size();i++){
            Meta aux = (Meta) metas.get(i);
            metaBox.addItem(aux);
        } 
        setAlcanceMeta(metas);
    }//GEN-LAST:event_objetivoBoxActionPerformed

    private void metaBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_metaBoxActionPerformed
      
        Meta meta = (Meta) metaBox.getSelectedItem();        
        medidorLabel.setText(String.valueOf(meta.getMedidor()));
        prioridadLabel.setText(String.valueOf(meta.getPrioridad()));
        avanceLabel.setText(String.valueOf(meta.getAvance()));  
    }//GEN-LAST:event_metaBoxActionPerformed
    
    private void setObjetivos(){
       this.objetivos = cc.ConsultarObjetivos(this.cc, this.region, this.campus, this.area);
       for (int i=0;i<objetivos.size();i++){
            Objetivo aux = (Objetivo) objetivos.get(i);
            objetivoBox.addItem(aux);
        }
        
    }
    private void setAlcanceObjetivos(){
        /*for (int i=0;i<this.objetivos.size();i++){
            Objetivo aux = (Objetivo) this.objetivos.get(i);
            for (int j=0;j<aux.getNoMetas();j++){
                Meta metaAux = (Meta) aux.getArea()
            }
            
        }*/
        
    }
    private void setAlcanceMeta(ArrayList metas){
        DefaultCategoryDataset datosMetas = new DefaultCategoryDataset();
        DefaultPieDataset datosPromMetas = new DefaultPieDataset();
        
        ArrayList avancesMetas = new ArrayList();
        for (int i=0; i<metas.size(); i++){
            
            Meta meta = (Meta) metas.get(i);
            int medidor = meta.getMedidor(),
                avance = meta.getAvance();
            
            int avanzado = (avance * 100) / medidor;
            
            datosPromMetas.setValue(meta.getDescripcion(),avanzado);
            datosMetas.setValue(meta.getAvance(), "Avance", meta.getDescripcion());
        }
        //PieDataset data = new PieDataset();
        /*JFreeChart graficoPie = ChartFactory.createPieChart(
                "Avance de la Meta",
                datosPromMetas,
                true,
                true,
                false
        );*/
        
        JFreeChart graficoPie = ChartFactory.createRingChart(
                "Avance de la Meta",
                datosPromMetas,
                true,
                true,
                false
        );
        
       JFreeChart graficoBarra = ChartFactory.createBarChart(
                "VISUALIZADOR DE METAS",
                "Avance de metas",
                "avance",
                datosMetas,
                PlotOrientation.VERTICAL,
                true,
                true,
                false
        );
        
 
        ChartPanel panel = new ChartPanel(graficoPie);
        panel.setMouseWheelEnabled(true);
        panel.setPreferredSize(new Dimension(400,200));
        
         ChartPanel panelBar = new ChartPanel(graficoBarra);
        panel.setMouseWheelEnabled(true);
        panel.setPreferredSize(new Dimension(400,200));
        
        metasPanel.setLayout(new BorderLayout());
        metasPanel.add(panelBar,BorderLayout.NORTH);  
      
        metasAvancePanel.setLayout(new BorderLayout());
        metasAvancePanel.add(panel,BorderLayout.NORTH); 
        
        pack();
        repaint();   
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Visualizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Visualizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Visualizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Visualizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Visualizador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel avanceLabel;
    private javax.swing.JButton crearObjetivoBoton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel medidorLabel;
    private javax.swing.JComboBox<Meta> metaBox;
    private javax.swing.JLabel metaLabel;
    private javax.swing.JPanel metasAvancePanel;
    private javax.swing.JPanel metasPanel;
    private javax.swing.JComboBox<Objetivo> objetivoBox;
    private javax.swing.JLabel objetivoLabel;
    private javax.swing.JLabel prioridadLabel;
    // End of variables declaration//GEN-END:variables
}
