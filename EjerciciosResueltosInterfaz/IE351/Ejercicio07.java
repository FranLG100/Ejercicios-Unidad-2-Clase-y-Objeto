package IE351;

import javax.swing.JOptionPane;

public class Ejercicio07 extends javax.swing.JFrame {
    Rectangulo pNorte = new Rectangulo();
    Rectangulo pSur = new Rectangulo();
    Rectangulo pEste = new Rectangulo();
    Rectangulo pOeste = new Rectangulo();

    public Ejercicio07() {
        initComponents();
        radNorte.setSelected(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoRadParedes = new javax.swing.ButtonGroup();
        panelParedes = new javax.swing.JPanel();
        radNorte = new javax.swing.JRadioButton();
        radSur = new javax.swing.JRadioButton();
        radEste = new javax.swing.JRadioButton();
        radOeste = new javax.swing.JRadioButton();
        panelTam = new javax.swing.JPanel();
        etiAncho = new javax.swing.JLabel();
        txtAncho = new javax.swing.JTextField();
        etiAlto = new javax.swing.JLabel();
        txtAlto = new javax.swing.JTextField();
        btnAsignar = new javax.swing.JButton();
        btnArea = new javax.swing.JButton();
        btnPerimetro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelParedes.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Paredes"));

        grupoRadParedes.add(radNorte);
        radNorte.setText("Pared Norte");
        radNorte.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                radNorteStateChanged(evt);
            }
        });
        radNorte.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                radNorteFocusGained(evt);
            }
        });

        grupoRadParedes.add(radSur);
        radSur.setText("Pared Sur");
        radSur.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                radSurStateChanged(evt);
            }
        });
        radSur.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                radSurFocusGained(evt);
            }
        });
        radSur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radSurActionPerformed(evt);
            }
        });

        grupoRadParedes.add(radEste);
        radEste.setText("Pared Este");
        radEste.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                radEsteStateChanged(evt);
            }
        });
        radEste.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                radEsteFocusGained(evt);
            }
        });
        radEste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radEsteActionPerformed(evt);
            }
        });

        grupoRadParedes.add(radOeste);
        radOeste.setText("Pared Oeste");
        radOeste.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                radOesteStateChanged(evt);
            }
        });
        radOeste.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                radOesteFocusGained(evt);
            }
        });

        javax.swing.GroupLayout panelParedesLayout = new javax.swing.GroupLayout(panelParedes);
        panelParedes.setLayout(panelParedesLayout);
        panelParedesLayout.setHorizontalGroup(
            panelParedesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelParedesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelParedesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(radOeste, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(radEste, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(radSur, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(radNorte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        panelParedesLayout.setVerticalGroup(
            panelParedesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelParedesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(radNorte)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radSur)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radEste)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radOeste)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelTam.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Tamaño"));

        etiAncho.setText("Ancho:");

        etiAlto.setText("Alto:");

        btnAsignar.setText("Asignar");
        btnAsignar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsignarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelTamLayout = new javax.swing.GroupLayout(panelTam);
        panelTam.setLayout(panelTamLayout);
        panelTamLayout.setHorizontalGroup(
            panelTamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTamLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAsignar, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                    .addGroup(panelTamLayout.createSequentialGroup()
                        .addGroup(panelTamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(etiAlto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(etiAncho, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(panelTamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAncho)
                            .addComponent(txtAlto))))
                .addContainerGap())
        );
        panelTamLayout.setVerticalGroup(
            panelTamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTamLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiAncho)
                    .addComponent(txtAncho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelTamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiAlto)
                    .addComponent(txtAlto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnAsignar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnArea.setText("Área");
        btnArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAreaActionPerformed(evt);
            }
        });

        btnPerimetro.setText("Perímetro");
        btnPerimetro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPerimetroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnArea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelParedes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panelTam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnPerimetro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelTam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelParedes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnArea)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPerimetro)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAsignarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsignarActionPerformed
        if(radNorte.isSelected()){
            pNorte.setBase(Double.parseDouble(txtAncho.getText()));
            pNorte.setAltura(Double.parseDouble(txtAlto.getText()));
        }else if(radSur.isSelected()){
            pSur.setBase(Double.parseDouble(txtAncho.getText()));
            pSur.setAltura(Double.parseDouble(txtAlto.getText()));
        }else if(radEste.isSelected()){
            pEste.setBase(Double.parseDouble(txtAncho.getText()));
            pEste.setAltura(Double.parseDouble(txtAlto.getText()));
        }else if(radOeste.isSelected()){
            pOeste.setBase(Double.parseDouble(txtAncho.getText()));
            pOeste.setAltura(Double.parseDouble(txtAlto.getText()));
        }
    }//GEN-LAST:event_btnAsignarActionPerformed

    private void radNorteStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_radNorteStateChanged
        
    }//GEN-LAST:event_radNorteStateChanged

    private void radSurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radSurActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radSurActionPerformed

    private void radSurStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_radSurStateChanged
        
    }//GEN-LAST:event_radSurStateChanged

    private void radEsteStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_radEsteStateChanged
        
    }//GEN-LAST:event_radEsteStateChanged

    private void radOesteStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_radOesteStateChanged
        
    }//GEN-LAST:event_radOesteStateChanged

    private void radNorteFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_radNorteFocusGained
        txtAncho.setText(pNorte.getBase()+"");
        txtAlto.setText(pNorte.getAltura()+"");
    }//GEN-LAST:event_radNorteFocusGained

    private void radSurFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_radSurFocusGained
        txtAncho.setText(pSur.getBase()+"");
        txtAlto.setText(pSur.getAltura()+"");
    }//GEN-LAST:event_radSurFocusGained

    private void radEsteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radEsteActionPerformed
        
    }//GEN-LAST:event_radEsteActionPerformed

    private void radEsteFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_radEsteFocusGained
        txtAncho.setText(pEste.getBase()+"");
        txtAlto.setText(pEste.getAltura()+"");
    }//GEN-LAST:event_radEsteFocusGained

    private void radOesteFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_radOesteFocusGained
        txtAncho.setText(pOeste.getBase()+"");
        txtAlto.setText(pOeste.getAltura()+"");
    }//GEN-LAST:event_radOesteFocusGained

    private void btnAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAreaActionPerformed
         if(radNorte.isSelected()){
             JOptionPane.showMessageDialog(null,pNorte.getArea()); 
        }else if(radSur.isSelected()){
             JOptionPane.showMessageDialog(null,pSur.getArea());
        }else if(radEste.isSelected()){
             JOptionPane.showMessageDialog(null,pEste.getArea());
        }else if(radOeste.isSelected()){
             JOptionPane.showMessageDialog(null,pOeste.getArea());
        }
    }//GEN-LAST:event_btnAreaActionPerformed

    private void btnPerimetroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPerimetroActionPerformed
        if(radNorte.isSelected()){
             JOptionPane.showMessageDialog(null,pNorte.getPerimetro()); 
        }else if(radSur.isSelected()){
             JOptionPane.showMessageDialog(null,pSur.getPerimetro());
        }else if(radEste.isSelected()){
             JOptionPane.showMessageDialog(null,pEste.getPerimetro());
        }else if(radOeste.isSelected()){
             JOptionPane.showMessageDialog(null,pOeste.getPerimetro());
        }
    }//GEN-LAST:event_btnPerimetroActionPerformed

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
            java.util.logging.Logger.getLogger(Ejercicio07.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ejercicio07.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ejercicio07.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ejercicio07.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ejercicio07().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnArea;
    private javax.swing.JButton btnAsignar;
    private javax.swing.JButton btnPerimetro;
    private javax.swing.JLabel etiAlto;
    private javax.swing.JLabel etiAncho;
    private javax.swing.ButtonGroup grupoRadParedes;
    private javax.swing.JPanel panelParedes;
    private javax.swing.JPanel panelTam;
    private javax.swing.JRadioButton radEste;
    private javax.swing.JRadioButton radNorte;
    private javax.swing.JRadioButton radOeste;
    private javax.swing.JRadioButton radSur;
    private javax.swing.JTextField txtAlto;
    private javax.swing.JTextField txtAncho;
    // End of variables declaration//GEN-END:variables
}
