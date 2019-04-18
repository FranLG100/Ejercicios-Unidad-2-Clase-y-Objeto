
package IE351;

public class Ejercicio08 extends javax.swing.JFrame {
    Pedido ped = new Pedido();

    public Ejercicio08() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        etiSolicitud = new javax.swing.JLabel();
        panelDatosPedido = new javax.swing.JPanel();
        etiDArticulo = new javax.swing.JLabel();
        etiDUnidades = new javax.swing.JLabel();
        etiDPrecio = new javax.swing.JLabel();
        etiDGastoEnvio = new javax.swing.JLabel();
        etiDDescuento = new javax.swing.JLabel();
        txtDArticulo = new javax.swing.JTextField();
        txtDUnidades = new javax.swing.JTextField();
        txtDPrecio = new javax.swing.JTextField();
        txtDGastosEnvio = new javax.swing.JTextField();
        txtDDescuento = new javax.swing.JTextField();
        panelFichaPedido = new javax.swing.JPanel();
        etiFArticulo = new javax.swing.JLabel();
        etiFUnidades = new javax.swing.JLabel();
        etiFPrecio = new javax.swing.JLabel();
        etiFGastosEnvio = new javax.swing.JLabel();
        etiTotalSinIva = new javax.swing.JLabel();
        etiIva = new javax.swing.JLabel();
        etiTotalMasIva = new javax.swing.JLabel();
        etiFDescuento = new javax.swing.JLabel();
        etiTotalPedido = new javax.swing.JLabel();
        txtFArticulo = new javax.swing.JTextField();
        txtFUnidades = new javax.swing.JTextField();
        txtFPrecio = new javax.swing.JTextField();
        txtFGastosEnvio = new javax.swing.JTextField();
        txtFTotalSinIva = new javax.swing.JTextField();
        txtFIva = new javax.swing.JTextField();
        txtFTotalMasIva = new javax.swing.JTextField();
        txtFDescuento = new javax.swing.JTextField();
        txtFTotalPedido = new javax.swing.JTextField();
        btnDesglose = new javax.swing.JButton();
        btnAceptar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        etiSolicitud.setText("SOLUCITUD DE PEDIDO");

        panelDatosPedido.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Datos del Pedido"));
        panelDatosPedido.setToolTipText("");
        panelDatosPedido.setFocusTraversalPolicyProvider(true);
        panelDatosPedido.setName(""); // NOI18N
        panelDatosPedido.setOpaque(false);

        etiDArticulo.setText("Articulo:");

        etiDUnidades.setText("Unidades:");

        etiDPrecio.setText("Precio:");

        etiDGastoEnvio.setText("Gastos de Envío:");

        etiDDescuento.setText("% Descuento:");

        javax.swing.GroupLayout panelDatosPedidoLayout = new javax.swing.GroupLayout(panelDatosPedido);
        panelDatosPedido.setLayout(panelDatosPedidoLayout);
        panelDatosPedidoLayout.setHorizontalGroup(
            panelDatosPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosPedidoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDatosPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(etiDGastoEnvio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(etiDDescuento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(etiDPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(etiDUnidades, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(etiDArticulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(panelDatosPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtDArticulo)
                    .addComponent(txtDUnidades)
                    .addComponent(txtDPrecio)
                    .addComponent(txtDGastosEnvio)
                    .addComponent(txtDDescuento, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        panelDatosPedidoLayout.setVerticalGroup(
            panelDatosPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosPedidoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelDatosPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiDArticulo)
                    .addComponent(txtDArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDatosPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiDUnidades)
                    .addComponent(txtDUnidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDatosPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiDPrecio)
                    .addComponent(txtDPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDatosPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiDGastoEnvio)
                    .addComponent(txtDGastosEnvio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDatosPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(etiDDescuento)
                    .addComponent(txtDDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelFichaPedido.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Ficha del Pedido"));

        etiFArticulo.setText("Articulo:");

        etiFUnidades.setText("Unidades:");

        etiFPrecio.setText("Precio:");

        etiFGastosEnvio.setText("Gastos de Envío:");

        etiTotalSinIva.setText("Total sin IVA:");

        etiIva.setText("IVA:");

        etiTotalMasIva.setText("Total mas IVA");

        etiFDescuento.setText("Descuento:");

        etiTotalPedido.setText("TOTAL PEDIDO:");

        javax.swing.GroupLayout panelFichaPedidoLayout = new javax.swing.GroupLayout(panelFichaPedido);
        panelFichaPedido.setLayout(panelFichaPedidoLayout);
        panelFichaPedidoLayout.setHorizontalGroup(
            panelFichaPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFichaPedidoLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(panelFichaPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFichaPedidoLayout.createSequentialGroup()
                        .addComponent(etiFArticulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFichaPedidoLayout.createSequentialGroup()
                        .addGroup(panelFichaPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiTotalMasIva, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(etiTotalSinIva, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(etiFGastosEnvio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(etiFUnidades, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(etiFPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(etiIva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelFichaPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelFichaPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtFGastosEnvio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtFTotalSinIva, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtFTotalMasIva, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtFUnidades, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFIva, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFichaPedidoLayout.createSequentialGroup()
                        .addGroup(panelFichaPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiTotalPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(etiFDescuento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelFichaPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFTotalPedido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFDescuento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        panelFichaPedidoLayout.setVerticalGroup(
            panelFichaPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFichaPedidoLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(panelFichaPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiFArticulo)
                    .addComponent(txtFArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelFichaPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFUnidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiFUnidades))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelFichaPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiFPrecio)
                    .addComponent(txtFPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelFichaPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiFGastosEnvio)
                    .addComponent(txtFGastosEnvio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelFichaPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiTotalSinIva)
                    .addComponent(txtFTotalSinIva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelFichaPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiIva)
                    .addComponent(txtFIva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelFichaPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiTotalMasIva)
                    .addComponent(txtFTotalMasIva, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelFichaPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiFDescuento)
                    .addComponent(txtFDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelFichaPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiTotalPedido)
                    .addComponent(txtFTotalPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3))
        );

        btnDesglose.setText("Ver desglose");
        btnDesglose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesgloseActionPerformed(evt);
            }
        });

        btnAceptar.setText("Aceptar Pedido");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(etiSolicitud)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnAceptar)
                            .addComponent(panelDatosPedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 403, Short.MAX_VALUE)
                                .addComponent(btnDesglose))
                            .addComponent(panelFichaPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(etiSolicitud)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelFichaPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelDatosPedido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDesglose)
                    .addComponent(btnAceptar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
       try{
        ped.setArticulo(txtDArticulo.getText());
        ped.setUnidades(Integer.parseInt(txtDUnidades.getText()));
        ped.setPrecio(Double.parseDouble(txtDPrecio.getText()));
        ped.setGastosEnvio(Double.parseDouble(txtDGastosEnvio.getText()));
        ped.setDescuento(Double.parseDouble(txtDDescuento.getText()));
       }catch(Exception e){}
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnDesgloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesgloseActionPerformed
        txtFArticulo.setText(ped.getArticulo());
        txtFUnidades.setText(ped.getUnidades()+"");
        txtFPrecio.setText(ped.getPrecio()+"€");
        txtFGastosEnvio.setText(ped.getGastosEnvio()+"€");
        txtFTotalSinIva.setText(ped.getTotalSinIva()+"€");
        txtFIva.setText(ped.getIva()+"€");
        txtFTotalMasIva.setText(ped.getTotalMasIva()+"€");
        txtFDescuento.setText(ped.getTotalDescuento()+"€");
        txtFTotalPedido.setText(ped.getTotalPedido()+"€");
    }//GEN-LAST:event_btnDesgloseActionPerformed

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
            java.util.logging.Logger.getLogger(Ejercicio08.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ejercicio08.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ejercicio08.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ejercicio08.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ejercicio08().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnDesglose;
    private javax.swing.JLabel etiDArticulo;
    private javax.swing.JLabel etiDDescuento;
    private javax.swing.JLabel etiDGastoEnvio;
    private javax.swing.JLabel etiDPrecio;
    private javax.swing.JLabel etiDUnidades;
    private javax.swing.JLabel etiFArticulo;
    private javax.swing.JLabel etiFDescuento;
    private javax.swing.JLabel etiFGastosEnvio;
    private javax.swing.JLabel etiFPrecio;
    private javax.swing.JLabel etiFUnidades;
    private javax.swing.JLabel etiIva;
    private javax.swing.JLabel etiSolicitud;
    private javax.swing.JLabel etiTotalMasIva;
    private javax.swing.JLabel etiTotalPedido;
    private javax.swing.JLabel etiTotalSinIva;
    private javax.swing.JPanel panelDatosPedido;
    private javax.swing.JPanel panelFichaPedido;
    private javax.swing.JTextField txtDArticulo;
    private javax.swing.JTextField txtDDescuento;
    private javax.swing.JTextField txtDGastosEnvio;
    private javax.swing.JTextField txtDPrecio;
    private javax.swing.JTextField txtDUnidades;
    private javax.swing.JTextField txtFArticulo;
    private javax.swing.JTextField txtFDescuento;
    private javax.swing.JTextField txtFGastosEnvio;
    private javax.swing.JTextField txtFIva;
    private javax.swing.JTextField txtFPrecio;
    private javax.swing.JTextField txtFTotalMasIva;
    private javax.swing.JTextField txtFTotalPedido;
    private javax.swing.JTextField txtFTotalSinIva;
    private javax.swing.JTextField txtFUnidades;
    // End of variables declaration//GEN-END:variables
}
