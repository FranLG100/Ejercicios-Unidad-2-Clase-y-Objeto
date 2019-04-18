package IE351;

import java.awt.Point;

public class Ejercicio03 extends javax.swing.JFrame {
    Point posini;

    public Ejercicio03() {
        initComponents();
        posini = etiAzul.getLocation();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        etiAzul = new javax.swing.JLabel();
        etiSombra = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        etiAzul.setBackground(new java.awt.Color(153, 204, 255));
        etiAzul.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiAzul.setText("Etiqueta");
        etiAzul.setOpaque(true);
        etiAzul.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                etiAzulMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                etiAzulMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                etiAzulMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                etiAzulMouseReleased(evt);
            }
        });

        etiSombra.setBackground(new java.awt.Color(0, 0, 0));
        etiSombra.setText("jLabel1");
        etiSombra.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etiAzul, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(etiSombra, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etiAzul, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(etiSombra, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void etiAzulMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etiAzulMouseEntered
        etiAzul.setText("PULSAME!");
    }//GEN-LAST:event_etiAzulMouseEntered

    private void etiAzulMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etiAzulMouseExited
        etiAzul.setText("Etiqueta");
    }//GEN-LAST:event_etiAzulMouseExited

    private void etiAzulMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etiAzulMousePressed

        etiAzul.setLocation(etiSombra.getLocation());
        etiAzul.setLocation(etiSombra.getLocation());
        
    }//GEN-LAST:event_etiAzulMousePressed

    private void etiAzulMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_etiAzulMouseReleased
         etiAzul.setLocation(posini);
         etiAzul.setText("Pulsado");
    }//GEN-LAST:event_etiAzulMouseReleased

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Ejercicio03.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ejercicio03.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ejercicio03.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ejercicio03.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ejercicio03().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel etiAzul;
    private javax.swing.JLabel etiSombra;
    // End of variables declaration//GEN-END:variables
}
