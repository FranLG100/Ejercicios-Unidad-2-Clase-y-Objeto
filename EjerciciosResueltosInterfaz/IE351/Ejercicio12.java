
package IE351;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Ejercicio12 extends javax.swing.JFrame {

    File archivo = null;
    FileReader fr = null;
    BufferedReader br = null;
    ArrayList <String> lineas =  new ArrayList <>();
    
    public Ejercicio12() {
        initComponents();
        try{
        archivo = new File ("src/IE351_Jessica_Benito_Madrigal/diccionario.txt");
        fr = new FileReader (archivo);
        br = new BufferedReader(fr);
        
        String linea;
         while((linea=br.readLine())!=null){
             lineas.add(linea);
         }
           
        }catch(Exception e){
            e.printStackTrace();
        }finally{
         try{                    
            if( null != fr ){   
               fr.close();     
            }                  
         }catch (Exception e2){ 
            e2.printStackTrace();
         }
      }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtIngles = new javax.swing.JTextField();
        txtEspanol = new javax.swing.JTextField();
        btnAEspanol = new javax.swing.JButton();
        btnAIngles = new javax.swing.JButton();
        etiIngles = new javax.swing.JLabel();
        etiEspanol = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Megatraductor");

        btnAEspanol.setText("->");
        btnAEspanol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAEspanolActionPerformed(evt);
            }
        });

        btnAIngles.setText("<-");
        btnAIngles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAInglesActionPerformed(evt);
            }
        });

        etiIngles.setText("Ingles");

        etiEspanol.setText("Español");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtIngles)
                    .addComponent(etiIngles, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAIngles)
                    .addComponent(btnAEspanol))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etiEspanol, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEspanol, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAEspanol)
                    .addComponent(etiIngles)
                    .addComponent(etiEspanol))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIngles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEspanol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAIngles)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAEspanolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAEspanolActionPerformed
        StringTokenizer st;
        int cont=0;
        String espa;
        String[] trad=new String[2];
        txtEspanol.setText("");
        if(txtIngles.getText().equals("")){
            txtEspanol.setText("");
        }else{
            for(String li:lineas){
                if(li.toUpperCase().contains(txtIngles.getText().toUpperCase())){
                    st=new StringTokenizer(li,"-");
                    while (st.hasMoreTokens()){
                        espa = st.nextToken();
                        if(cont<2){
                            trad[cont]=espa.toLowerCase();
                        cont++;
                        }
                    }
                    if(trad[0].equals(txtIngles.getText().toLowerCase())){
                        txtEspanol.setText(trad[1]);
                    }else{
                        txtEspanol.setText("*Not found*");
                    }
                }
            }
        }
    }//GEN-LAST:event_btnAEspanolActionPerformed

    private void btnAInglesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAInglesActionPerformed
        StringTokenizer st;
        int cont=0;
        String ingl;
        String[] trad=new String[2];
        txtIngles.setText("");
        if(txtEspanol.getText().equals("")){
            txtIngles.setText("");
        }else{
            for(String li:lineas){
                if(li.toUpperCase().contains(txtEspanol.getText().toUpperCase())){
                    st=new StringTokenizer(li,"-");
                    while (st.hasMoreTokens()){
                        ingl = st.nextToken();
                        if(cont<2){
                            trad[cont]=ingl.toLowerCase();
                        cont++;
                        }
                    }
                    if(trad[1].equals(txtEspanol.getText().toLowerCase())){
                        txtIngles.setText(trad[0]);
                    }
                }
            }
        }
    }//GEN-LAST:event_btnAInglesActionPerformed

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
            java.util.logging.Logger.getLogger(Ejercicio12.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ejercicio12.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ejercicio12.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ejercicio12.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ejercicio12().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAEspanol;
    private javax.swing.JButton btnAIngles;
    private javax.swing.JLabel etiEspanol;
    private javax.swing.JLabel etiIngles;
    private javax.swing.JTextField txtEspanol;
    private javax.swing.JTextField txtIngles;
    // End of variables declaration//GEN-END:variables
}
