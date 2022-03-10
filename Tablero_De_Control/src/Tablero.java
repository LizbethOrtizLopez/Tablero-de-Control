
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Tablero extends javax.swing.JFrame {

    private String region;
    private String campus;
    private String area;
    
    public Tablero() {
        
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        regionLabel = new javax.swing.JLabel();
        regionBox = new javax.swing.JComboBox<>();
        campusLabel = new javax.swing.JLabel();
        campusBox = new javax.swing.JComboBox<>();
        areaLabel = new javax.swing.JLabel();
        areaBox = new javax.swing.JComboBox<>();
        buscarBoton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        regionLabel.setText("Región");

        regionBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Occidente" }));
        regionBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regionBoxActionPerformed(evt);
            }
        });

        campusLabel.setText("Campus");

        campusBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aguscalientes", "Guadalajara", "Obregón", "Sinaloa", "Sonora Norte", "Zacatecas" }));
        campusBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campusBoxActionPerformed(evt);
            }
        });

        areaLabel.setText("Área");

        areaBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                areaBoxActionPerformed(evt);
            }
        });

        buscarBoton.setText("BUSCAR");
        buscarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarBotonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(regionLabel)
                        .addGap(18, 18, 18)
                        .addComponent(regionBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campusLabel)
                            .addComponent(areaLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(areaBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campusBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(166, Short.MAX_VALUE)
                .addComponent(buscarBoton)
                .addGap(161, 161, 161))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(regionLabel)
                    .addComponent(regionBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campusLabel)
                    .addComponent(campusBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(areaLabel)
                    .addComponent(areaBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(buscarBoton)
                .addContainerGap(97, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regionBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regionBoxActionPerformed
        this.region= (String)regionBox.getSelectedItem();
    }//GEN-LAST:event_regionBoxActionPerformed

    private void campusBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campusBoxActionPerformed
         if ((String)campusBox.getSelectedItem()=="Guadalajara"){
            areaBox.addItem("EGADE");
            areaBox.addItem("Zona Ei");
            areaBox.addItem("Beca Talento Emprendedor");
        }
         this.campus = (String)campusBox.getSelectedItem();
    }//GEN-LAST:event_campusBoxActionPerformed

    private void areaBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_areaBoxActionPerformed
        this.area = (String)areaBox.getSelectedItem();
    }//GEN-LAST:event_areaBoxActionPerformed

    private void buscarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarBotonActionPerformed
        Visualizador tablero = null;
        tablero = new Visualizador(this.region, this.campus, this.area);
        tablero.show();
    }//GEN-LAST:event_buscarBotonActionPerformed

 
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tablero().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> areaBox;
    private javax.swing.JLabel areaLabel;
    private javax.swing.JButton buscarBoton;
    private javax.swing.JComboBox<String> campusBox;
    private javax.swing.JLabel campusLabel;
    private javax.swing.JComboBox<String> regionBox;
    private javax.swing.JLabel regionLabel;
    // End of variables declaration//GEN-END:variables
}
