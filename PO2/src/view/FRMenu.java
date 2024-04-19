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
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mMenu = new javax.swing.JMenu();
        miConsultas = new javax.swing.JMenuItem();
        miAgendamento = new javax.swing.JMenuItem();
        miCadSair = new javax.swing.JMenuItem();
        mAjuda = new javax.swing.JMenu();
        miSobre = new javax.swing.JMenuItem();
        miSuporte = new javax.swing.JMenuItem();
        miAreaFuncionario = new javax.swing.JMenuItem();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("menu");
        setLocation(new java.awt.Point(0, 0));
        setSize(new java.awt.Dimension(1920, 1080));

        jPanel1.setBackground(new java.awt.Color(0, 235, 239));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/medico.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Aberto 24 horas por dia.");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Telefone: (99) 99999-9999");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(237, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(226, 226, 226))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(271, 271, 271)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 162, Short.MAX_VALUE)
                .addComponent(jLabel1))
        );

        mMenu.setText("Menu");

        miConsultas.setText("Consultas");
        miConsultas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                miConsultasMouseClicked(evt);
            }
        });
        miConsultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miConsultasActionPerformed(evt);
            }
        });
        mMenu.add(miConsultas);

        miAgendamento.setText("Agendamento");
        miAgendamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                miAgendamentoMouseClicked(evt);
            }
        });
        miAgendamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAgendamentoActionPerformed(evt);
            }
        });
        mMenu.add(miAgendamento);

        miCadSair.setText("Sair");
        miCadSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miCadSairActionPerformed(evt);
            }
        });
        mMenu.add(miCadSair);

        jMenuBar1.add(mMenu);

        mAjuda.setText("Ajuda");

        miSobre.setText("Sobre");
        miSobre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                miSobreMouseClicked(evt);
            }
        });
        miSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSobreActionPerformed(evt);
            }
        });
        mAjuda.add(miSobre);

        miSuporte.setText("Suporte");
        miSuporte.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                miSuporteMouseClicked(evt);
            }
        });
        miSuporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSuporteActionPerformed(evt);
            }
        });
        mAjuda.add(miSuporte);

        miAreaFuncionario.setText("Área do funcionário");
        miAreaFuncionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                miAreaFuncionarioMouseClicked(evt);
            }
        });
        miAreaFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAreaFuncionarioActionPerformed(evt);
            }
        });
        mAjuda.add(miAreaFuncionario);

        jMenuBar1.add(mAjuda);

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

    private void miSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSobreActionPerformed
        new FRSobre(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_miSobreActionPerformed

    private void miAreaFuncionarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miAreaFuncionarioMouseClicked
        this.dispose();
        new FRLoginCons(this, rootPaneCheckingEnabled).setVisible(true);

    }//GEN-LAST:event_miAreaFuncionarioMouseClicked

    private void miAreaFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAreaFuncionarioActionPerformed
        this.dispose();
        new FRLoginCons(this, rootPaneCheckingEnabled).setVisible(true);

    }//GEN-LAST:event_miAreaFuncionarioActionPerformed

    private void miConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miConsultasActionPerformed
        this.dispose();
        new FRConsultas(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_miConsultasActionPerformed

    private void miConsultasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miConsultasMouseClicked
        this.dispose();
        new FRConsultas(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_miConsultasMouseClicked

    private void miAgendamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAgendamentoActionPerformed
        this.dispose();
        new FRAgendamento(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_miAgendamentoActionPerformed

    private void miAgendamentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miAgendamentoMouseClicked
        this.dispose();
        new FRAgendamento(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_miAgendamentoMouseClicked

    private void miSobreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miSobreMouseClicked
        new FRSobre(this, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_miSobreMouseClicked

    private void miSuporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSuporteActionPerformed
        new FRSuporte(null, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_miSuporteActionPerformed

    private void miSuporteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miSuporteMouseClicked
        new FRSuporte(null, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_miSuporteMouseClicked

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
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu mAjuda;
    private javax.swing.JMenu mMenu;
    private javax.swing.JMenuItem miAgendamento;
    private javax.swing.JMenuItem miAreaFuncionario;
    private javax.swing.JMenuItem miCadSair;
    private javax.swing.JMenuItem miConsultas;
    private javax.swing.JMenuItem miSobre;
    private javax.swing.JMenuItem miSuporte;
    // End of variables declaration//GEN-END:variables
}
