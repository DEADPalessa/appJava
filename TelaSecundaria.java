/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

/**
 *
 * @author 2º Ano Info
 */
public class TelaSecundaria extends javax.swing.JFrame {

    /**
     * Creates new form TelaSecundaria
     */
    public TelaSecundaria() {
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

        jLabel1 = new javax.swing.JLabel();
        fundo = new javax.swing.JLabel();
        tela = new javax.swing.JLabel();
        tela1p2 = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/5.png"))); // NOI18N
        fundo.setText("jLabel4");
        getContentPane().add(fundo);
        fundo.setBounds(10, 50, 380, 450);

        tela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/IMG_1056.PNG"))); // NOI18N
        getContentPane().add(tela);
        tela.setBounds(0, -20, 400, 700);

        tela1p2.setText("t3");
        tela1p2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tela1p2ActionPerformed(evt);
            }
        });
        getContentPane().add(tela1p2);
        tela1p2.setBounds(32, 580, 60, 50);

        setSize(new java.awt.Dimension(414, 681));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tela1p2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tela1p2ActionPerformed
        new TelaTerciaria().setVisible(true); 
        



// TODO add your handling code here:
    }//GEN-LAST:event_tela1p2ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaSecundaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaSecundaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaSecundaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaSecundaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaSecundaria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fundo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel tela;
    private javax.swing.JButton tela1p2;
    // End of variables declaration//GEN-END:variables
}
