/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;
import herefam.controller.IndiceController;
import herefam.controller.NarioController;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class herefam_01 extends javax.swing.JFrame {
    
    /**
     * Creates new form herefam_interface
     */
    public herefam_01() {
        initComponents();
        IndiceController.load();
        NarioController.load();
        
        this.setLocationRelativeTo(null);
        this.setResizable(false);   
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txfBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txfBuscar1 = new javax.swing.JTextField();
        txfBuscar2 = new javax.swing.JTextField();
        btnBuscar1 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txfBuscar3 = new javax.swing.JTextField();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel13 = new javax.swing.JLabel();
        btnBuscar2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        jLabel10.setText("jLabel10");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(570, 490));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Constantia", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("3. Buscar niveles ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 310, 160, 23);

        jLabel2.setFont(new java.awt.Font("Constantia", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Muestra B:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 230, 110, 28);

        txfBuscar.setToolTipText("Ingrese la cedula");
        txfBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(txfBuscar);
        txfBuscar.setBounds(140, 100, 100, 28);

        btnBuscar.setBackground(new java.awt.Color(51, 204, 255));
        btnBuscar.setFont(new java.awt.Font("Constantia", 1, 14)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar);
        btnBuscar.setBounds(30, 130, 220, 28);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(280, 100, 250, 260);

        jLabel3.setFont(new java.awt.Font("Constantia", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Resultados:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(280, 70, 140, 21);

        jButton1.setBackground(new java.awt.Color(51, 204, 255));
        jButton1.setFont(new java.awt.Font("Constantia", 1, 14)); // NOI18N
        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(350, 380, 110, 28);

        jLabel6.setFont(new java.awt.Font("Constantia", 1, 25)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("HEREFAM ");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(200, 20, 150, 31);

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(20, 300, 240, 20);

        jLabel7.setFont(new java.awt.Font("Constantia", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("1. Muestras");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(30, 70, 150, 23);

        jLabel8.setFont(new java.awt.Font("Constantia", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Ingrese el nivel : ");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(30, 360, 120, 28);

        jLabel9.setFont(new java.awt.Font("Constantia", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Muestra A:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(30, 200, 110, 28);

        txfBuscar1.setToolTipText("Ingrese cedula muestra A");
        txfBuscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfBuscar1ActionPerformed(evt);
            }
        });
        getContentPane().add(txfBuscar1);
        txfBuscar1.setBounds(110, 200, 100, 30);

        txfBuscar2.setToolTipText("Ingrese cedula muestra B");
        txfBuscar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfBuscar2ActionPerformed(evt);
            }
        });
        getContentPane().add(txfBuscar2);
        txfBuscar2.setBounds(110, 230, 100, 28);

        btnBuscar1.setBackground(new java.awt.Color(51, 204, 255));
        btnBuscar1.setFont(new java.awt.Font("Constantia", 1, 14)); // NOI18N
        btnBuscar1.setText("Comparar");
        btnBuscar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscar1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar1);
        btnBuscar1.setBounds(30, 260, 220, 28);

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(20, 170, 240, 20);

        jLabel11.setFont(new java.awt.Font("Constantia", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("2. Parentezco");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(30, 180, 150, 23);

        jLabel12.setFont(new java.awt.Font("Constantia", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Buscar muestra: ");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(30, 100, 110, 28);

        txfBuscar3.setToolTipText("Ingrese la cedula");
        txfBuscar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfBuscar3ActionPerformed(evt);
            }
        });
        getContentPane().add(txfBuscar3);
        txfBuscar3.setBounds(150, 330, 100, 28);

        jSpinner1.setFont(new java.awt.Font("Constantia", 1, 14)); // NOI18N
        jSpinner1.setToolTipText("Seleccione el nivel de la muestra a buscar");
        getContentPane().add(jSpinner1);
        jSpinner1.setBounds(150, 360, 50, 30);

        jLabel13.setFont(new java.awt.Font("Constantia", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Ingrese muestra: ");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(30, 330, 120, 28);

        btnBuscar2.setBackground(new java.awt.Color(51, 204, 255));
        btnBuscar2.setFont(new java.awt.Font("Constantia", 1, 14)); // NOI18N
        btnBuscar2.setText("Buscar");
        btnBuscar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscar2ActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar2);
        btnBuscar2.setBounds(30, 400, 220, 28);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/5D5.jpg"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 580, 480);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txfBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfBuscarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        try{
            IndiceController.printMuestraById(Integer.parseInt(txfBuscar.getText()));
            jTextArea1.setText(IndiceController.printMuestraByIdInterface(Integer.parseInt(txfBuscar.getText())));    
        }catch(Exception e){
            jTextArea1.setText("Registro no encontrado");
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txfBuscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfBuscar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfBuscar1ActionPerformed

    private void txfBuscar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfBuscar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfBuscar2ActionPerformed

    private void btnBuscar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscar1ActionPerformed
        try{
            int registroA = Integer.parseInt(txfBuscar1.getText());
            int registroB = Integer.parseInt(txfBuscar2.getText());
            int grado = NarioController.getGradoParentesco(registroA, registroB);
            
            if(grado == 0){
                jTextArea1.setText("Entre los registros "+txfBuscar1.getText()+" y "+txfBuscar2.getText() + 
                                   "\nNo existe grado de parentesco");
            }else{
                jTextArea1.setText("Entre los registros "+txfBuscar1.getText()+" y "+txfBuscar2.getText() + 
                                   "\nEl grado de parentesco es: " + grado);
            }
            
        }catch(Exception e){
            jTextArea1.setText("Registro no encontrado");
        }
    }//GEN-LAST:event_btnBuscar1ActionPerformed

    private void txfBuscar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfBuscar3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfBuscar3ActionPerformed

    private void btnBuscar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscar2ActionPerformed
        int spinner = Integer.parseInt(jSpinner1.getValue().toString());
        String resultado = NarioController.mostrarByLevelToInterface(Integer.parseInt(txfBuscar3.getText()), spinner);
        jTextArea1.setText(resultado);
            
        
    }//GEN-LAST:event_btnBuscar2ActionPerformed

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
            java.util.logging.Logger.getLogger(herefam_01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(herefam_01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(herefam_01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(herefam_01.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new herefam_01().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnBuscar1;
    private javax.swing.JButton btnBuscar2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField txfBuscar;
    private javax.swing.JTextField txfBuscar1;
    private javax.swing.JTextField txfBuscar2;
    private javax.swing.JTextField txfBuscar3;
    // End of variables declaration//GEN-END:variables
}
