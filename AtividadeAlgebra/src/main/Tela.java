/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author aliss
 */
public class Tela extends javax.swing.JFrame {

    /**
     * Creates new form Tela
     */
    public Tela() {
        initComponents();
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        SAIR = new javax.swing.JButton();
        LIMPAR = new javax.swing.JButton();
        Calcular = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        campo3 = new javax.swing.JTextField();
        campo2 = new javax.swing.JTextField();
        campo1 = new javax.swing.JTextField();
        campo6 = new javax.swing.JTextField();
        campo5 = new javax.swing.JTextField();
        campo4 = new javax.swing.JTextField();
        campo9 = new javax.swing.JTextField();
        campo8 = new javax.swing.JTextField();
        campo7 = new javax.swing.JTextField();
        result = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 255, 51));
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel1.setText("CALCULO MATRIZ 3X3");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(100, 10, 263, 32);

        SAIR.setText("SAIR");
        SAIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SAIRActionPerformed(evt);
            }
        });
        jPanel1.add(SAIR);
        SAIR.setBounds(340, 330, 80, 23);

        LIMPAR.setText("LIMPAR");
        LIMPAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LIMPARActionPerformed(evt);
            }
        });
        jPanel1.add(LIMPAR);
        LIMPAR.setBounds(20, 330, 90, 23);

        Calcular.setText("CALCULAR");
        Calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalcularActionPerformed(evt);
            }
        });
        jPanel1.add(Calcular);
        Calcular.setBounds(150, 220, 110, 23);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("O valor determinante é:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 290, 150, 14);
        jPanel1.add(campo3);
        campo3.setBounds(280, 60, 42, 20);
        jPanel1.add(campo2);
        campo2.setBounds(190, 60, 42, 20);
        jPanel1.add(campo1);
        campo1.setBounds(100, 60, 42, 20);
        jPanel1.add(campo6);
        campo6.setBounds(280, 110, 42, 20);
        jPanel1.add(campo5);
        campo5.setBounds(190, 110, 42, 20);
        jPanel1.add(campo4);
        campo4.setBounds(100, 110, 42, 20);
        jPanel1.add(campo9);
        campo9.setBounds(280, 160, 42, 20);
        jPanel1.add(campo8);
        campo8.setBounds(190, 160, 42, 20);
        jPanel1.add(campo7);
        campo7.setBounds(100, 160, 42, 20);
        jPanel1.add(result);
        result.setBounds(150, 290, 114, 14);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 430, 370);

        setSize(new java.awt.Dimension(431, 367));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalcularActionPerformed
 String Li1co1 = campo1.getText();
  String Li1co2 = campo2.getText();
  String Li1co3 = campo3.getText();
  String Li2co1 = campo4.getText();
  String Li2co2 = campo5.getText();
  String Li2co3 = campo6.getText();
  String Li3co1 = campo7.getText();
  String Li3co2 = campo8.getText();
  String Li3co3 = campo9.getText();
  int l1c1 = Integer.parseInt(Li1co1);
  int l1c2 = Integer.parseInt(Li1co2);
  int l1c3 = Integer.parseInt(Li1co3);
  int l2c1 = Integer.parseInt(Li2co1);
  int l2c2 = Integer.parseInt(Li2co2);
  int l2c3 = Integer.parseInt(Li2co3);
  int l3c1 = Integer.parseInt(Li3co1);
  int l3c2 = Integer.parseInt(Li3co2);
  int l3c3 = Integer.parseInt(Li3co3);

  
  double diagposi1,diagposi2,diagposi3,diagneg1,diagneg2,diagneg3,diagposi,diagneg,det;
  
  int matriz [][] = new int[3][3];
  
  matriz[0][0] = l1c1;
  matriz[0][1] = l1c2;
  matriz[0][2] = l1c3;
  matriz[1][0] = l2c1;
  matriz[1][1] = l2c2;
  matriz[1][2] = l2c3;
  matriz[2][0] = l3c1;
  matriz[2][1] = l3c2;
  matriz[2][2] = l3c3;
  
  diagposi1 = matriz[0][0]*matriz[1][1]*matriz[2][2];
  diagposi2 = matriz[0][1]*matriz[1][2]*matriz[2][0];
  diagposi3 = matriz[0][2]*matriz[1][0]*matriz[2][1];
  diagposi = diagposi1+diagposi2+diagposi3;

  diagneg1 = matriz[0][1]*matriz[1][0]*matriz[2][2];
  diagneg2 = matriz[0][0]*matriz[1][2]*matriz[2][1];
  diagneg3 = matriz[0][2]*matriz[1][1]*matriz[2][0];
  diagneg = diagneg1+diagneg2+diagneg3;
  
  det = diagposi-diagneg;
  
String x = Double.toString(det);
result.setText(x);


    }//GEN-LAST:event_CalcularActionPerformed

    private void LIMPARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LIMPARActionPerformed
campo1.setText("");
campo2.setText("");
campo3.setText("");
campo4.setText("");
campo5.setText("");
campo6.setText("");
campo7.setText("");
campo8.setText("");
campo9.setText("");
result.setText("");

    }//GEN-LAST:event_LIMPARActionPerformed

    private void SAIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SAIRActionPerformed
System.exit(0);
    }//GEN-LAST:event_SAIRActionPerformed

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
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Calcular;
    private javax.swing.JButton LIMPAR;
    private javax.swing.JButton SAIR;
    private javax.swing.JTextField campo1;
    private javax.swing.JTextField campo2;
    private javax.swing.JTextField campo3;
    private javax.swing.JTextField campo4;
    private javax.swing.JTextField campo5;
    private javax.swing.JTextField campo6;
    private javax.swing.JTextField campo7;
    private javax.swing.JTextField campo8;
    private javax.swing.JTextField campo9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel result;
    // End of variables declaration//GEN-END:variables
}
