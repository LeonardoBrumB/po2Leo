/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author aluno.saolucas
 */
public class FRMenu extends javax.swing.JFrame {

    /**
     * Creates new form FRMenu
     */
    public FRMenu() {
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
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        miCad = new javax.swing.JMenu();
        miCadUsuario = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        miCadSair = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        miConUsuario = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("menu");

        jPanel1.setBackground(new java.awt.Color(204, 51, 255));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/3792030_magic_pentagram_rite_satanism_icon.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(231, 231, 231)
                .addComponent(jLabel2)
                .addContainerGap(231, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(jLabel2)
                .addContainerGap(109, Short.MAX_VALUE))
        );

        miCad.setText("Cadastro");
        miCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCadActionPerformed(evt);
            }
        });

        miCadUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/1564534_customer_man_user_account_profile_icon (1).png"))); // NOI18N
        miCadUsuario.setText("Usuário");
        miCadUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCadUsuarioActionPerformed(evt);
            }
        });
        miCad.add(miCadUsuario);

        jMenuItem2.setText("????");
        miCad.add(jMenuItem2);

        miCadSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/7853741_logout_kashifarif_exit_out_close_icon.png"))); // NOI18N
        miCadSair.setText("Sair");
        miCadSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCadSairActionPerformed(evt);
            }
        });
        miCad.add(miCadSair);

        jMenuBar1.add(miCad);

        jMenu2.setText("Conexão");

        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/1564534_customer_man_user_account_profile_icon (1).png"))); // NOI18N
        jMenuItem4.setText("Usuário");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        miConUsuario.setText("???");
        miConUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miConUsuarioActionPerformed(evt);
            }
        });
        jMenu2.add(miConUsuario);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miCadSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCadSairActionPerformed
     this.dispose();
    }//GEN-LAST:event_miCadSairActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void miConUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miConUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_miConUsuarioActionPerformed

    private void miCadUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCadUsuarioActionPerformed
        new FRCadUsuario(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_miCadUsuarioActionPerformed

    private void miCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miCadActionPerformed
        
    }//GEN-LAST:event_miCadActionPerformed

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
            java.util.logging.Logger.getLogger(FRMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FRMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FRMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FRMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FRMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu miCad;
    private javax.swing.JMenuItem miCadSair;
    private javax.swing.JMenuItem miCadUsuario;
    private javax.swing.JMenuItem miConUsuario;
    // End of variables declaration//GEN-END:variables
}
