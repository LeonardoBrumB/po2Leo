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
public class FRSuporte extends javax.swing.JDialog {

    /**
     * Creates new form FRSuporte
     */
    public FRSuporte(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        jPanel1 = new javax.swing.JPanel();
        lbSuporte = new javax.swing.JLabel();
        lbNome = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        lbNome1 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lbProblema = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaProblema = new javax.swing.JTextArea();
        btEnviar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        mMenu = new javax.swing.JMenu();
        miMenuInicial = new javax.swing.JMenuItem();
        miConsultas = new javax.swing.JMenuItem();
        miAgendamento = new javax.swing.JMenuItem();
        miSair = new javax.swing.JMenuItem();
        mAjuda = new javax.swing.JMenu();
        miSobre = new javax.swing.JMenuItem();
        miAreaFuncionario = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Suporte");

        jPanel1.setBackground(new java.awt.Color(0, 235, 239));

        lbSuporte.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        lbSuporte.setText("Suporte");

        lbNome.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbNome.setText("Nome:");

        lbNome1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbNome1.setText("Email:");

        lbProblema.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        lbProblema.setText("Qual o problema?");

        txtaProblema.setColumns(20);
        txtaProblema.setRows(5);
        jScrollPane1.setViewportView(txtaProblema);

        btEnviar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btEnviar.setText("Enviar");

        btCancelar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btCancelar.setText("Cancelar");
        btCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btCancelarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(288, 288, 288)
                        .addComponent(lbSuporte))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lbNome1)
                                        .addComponent(lbNome))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtNome)
                                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(3, 3, 3)
                                    .addComponent(lbProblema)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(btCancelar)
                        .addGap(147, 147, 147)
                        .addComponent(btEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(115, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lbSuporte)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNome)
                    .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNome1)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(lbProblema)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCancelar)
                    .addComponent(btEnviar))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        mMenu.setText("Menu");

        miMenuInicial.setText("Menu Inicial");
        miMenuInicial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                miMenuInicialMouseClicked(evt);
            }
        });
        miMenuInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miMenuInicialActionPerformed(evt);
            }
        });
        mMenu.add(miMenuInicial);

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

        miSair.setText("Sair");
        miSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                miSairMouseClicked(evt);
            }
        });
        miSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miSairActionPerformed(evt);
            }
        });
        mMenu.add(miSair);

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

        miAreaFuncionario.setText("Área do funcionário");
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void miMenuInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miMenuInicialActionPerformed
        this.dispose();
        new FRMenu().setVisible(true);
    }//GEN-LAST:event_miMenuInicialActionPerformed

    private void miMenuInicialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miMenuInicialMouseClicked
        this.dispose();
        new FRMenu().setVisible(true);
    }//GEN-LAST:event_miMenuInicialMouseClicked

    private void miConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miConsultasActionPerformed
        this.dispose();
        new FRConsultas(null, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_miConsultasActionPerformed

    private void miConsultasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miConsultasMouseClicked
        this.dispose();
        new FRConsultas(null, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_miConsultasMouseClicked

    private void miAgendamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAgendamentoActionPerformed
        this.dispose();
        new FRAgendamento(null, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_miAgendamentoActionPerformed

    private void miAgendamentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miAgendamentoMouseClicked
        this.dispose();
        new FRAgendamento(null, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_miAgendamentoMouseClicked

    private void miSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSairActionPerformed
        this.dispose();
    }//GEN-LAST:event_miSairActionPerformed

    private void miSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miSairMouseClicked
        this.dispose();
    }//GEN-LAST:event_miSairMouseClicked

    private void miSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miSobreActionPerformed
        new FRSobre(null, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_miSobreActionPerformed

    private void miSobreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_miSobreMouseClicked
        new FRSobre(null, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_miSobreMouseClicked

    private void miAreaFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAreaFuncionarioActionPerformed
        this.dispose();
        new FRLoginCons(null, rootPaneCheckingEnabled).setVisible(true);
    }//GEN-LAST:event_miAreaFuncionarioActionPerformed

    private void btCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCancelarMouseClicked
        this.dispose();
    }//GEN-LAST:event_btCancelarMouseClicked

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
            java.util.logging.Logger.getLogger(FRSuporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FRSuporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FRSuporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FRSuporte.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FRSuporte dialog = new FRSuporte(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btEnviar;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbNome1;
    private javax.swing.JLabel lbProblema;
    private javax.swing.JLabel lbSuporte;
    private javax.swing.JMenu mAjuda;
    private javax.swing.JMenu mMenu;
    private javax.swing.JMenuItem miAgendamento;
    private javax.swing.JMenuItem miAreaFuncionario;
    private javax.swing.JMenuItem miConsultas;
    private javax.swing.JMenuItem miMenuInicial;
    private javax.swing.JMenuItem miSair;
    private javax.swing.JMenuItem miSobre;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextArea txtaProblema;
    // End of variables declaration//GEN-END:variables
}
