/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.UsuarioController;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.Date;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import model.Usuario;
import utils.Utils;

/**
 *
 * @author aluno.saolucas
 */
public class FRUPDFuncionario extends javax.swing.JDialog {

    private int pkUsuario;
    private String senhaUsuario;

    public String getSenhaUsuario() {
        return senhaUsuario;
    }

    public void setSenhaUsuario(String senhaUsuario) {
        this.senhaUsuario = senhaUsuario;
    }

    public void setPkUsuario(int pk) {
        this.pkUsuario = pk;
    }

    /**
     * Creates new form FRUPDUsuario
     */
    public FRUPDFuncionario(java.awt.Frame parent, boolean modal) {
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
        btDeletar = new javax.swing.JButton();
        lbTitulo = new javax.swing.JLabel();
        btCancelar = new javax.swing.JButton();
        lbNome = new javax.swing.JLabel();
        lbConfSenha = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtConfSenha = new javax.swing.JPasswordField();
        lbEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lbSenha = new javax.swing.JLabel();
        lbDataNasc = new javax.swing.JLabel();
        txtSenha = new javax.swing.JPasswordField();
        ftxtDataNasc = new javax.swing.JFormattedTextField();
        btSalvar = new javax.swing.JButton();
        lbCodigo = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        btAlterarSenha = new javax.swing.JButton();
        lbFoto = new javax.swing.JLabel();
        brnAlterarFunc = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Alterar funcionário");

        jPanel1.setBackground(new java.awt.Color(0, 235, 239));

        btDeletar.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        btDeletar.setText("Deletar");
        btDeletar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btDeletarMouseClicked(evt);
            }
        });
        btDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeletarActionPerformed(evt);
            }
        });
        btDeletar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btDeletarKeyPressed(evt);
            }
        });

        lbTitulo.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        lbTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icone editar usuario.png"))); // NOI18N
        lbTitulo.setText("Alterar de funcionário");

        btCancelar.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        btCancelar.setText("Cancelar");
        btCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btCancelarMouseClicked(evt);
            }
        });
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        lbNome.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        lbNome.setText("Nome:");

        lbConfSenha.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        lbConfSenha.setText("Confirmar senha:");

        txtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNomeActionPerformed(evt);
            }
        });
        txtNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNomeKeyPressed(evt);
            }
        });

        txtConfSenha.setEditable(false);
        txtConfSenha.setBackground(new java.awt.Color(124, 124, 124));
        txtConfSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtConfSenhaKeyPressed(evt);
            }
        });

        lbEmail.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        lbEmail.setText("Email:");

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEmailKeyPressed(evt);
            }
        });

        lbSenha.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        lbSenha.setText("Senha:");

        lbDataNasc.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        lbDataNasc.setText("Data de Nascimento:");

        txtSenha.setEditable(false);
        txtSenha.setBackground(new java.awt.Color(125, 125, 125));
        txtSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSenhaKeyPressed(evt);
            }
        });

        ftxtDataNasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getDateInstance(java.text.DateFormat.MEDIUM))));
        ftxtDataNasc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ftxtDataNascKeyPressed(evt);
            }
        });

        btSalvar.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        btSalvar.setText(" Salvar");
        btSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btSalvarMouseClicked(evt);
            }
        });
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });
        btSalvar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btSalvarKeyPressed(evt);
            }
        });

        lbCodigo.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        lbCodigo.setText("Código:");

        txtCodigo.setEditable(false);
        txtCodigo.setBackground(new java.awt.Color(124, 124, 124));
        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });
        txtCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCodigoKeyPressed(evt);
            }
        });

        btAlterarSenha.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        btAlterarSenha.setText("Alterar senha");
        btAlterarSenha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btAlterarSenhaMouseClicked(evt);
            }
        });
        btAlterarSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarSenhaActionPerformed(evt);
            }
        });

        lbFoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        brnAlterarFunc.setText("Alterar imagem");
        brnAlterarFunc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                brnAlterarFuncMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(85, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(btCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(btSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(124, 124, 124))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbNome)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbCodigo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lbEmail, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbSenha, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtSenha, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbConfSenha, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtConfSenha, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(lbDataNasc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(ftxtDataNasc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtNome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btAlterarSenha)))
                        .addGap(29, 29, 29))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(192, 192, 192)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbTitulo)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(lbFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(brnAlterarFunc)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lbTitulo)
                        .addGap(28, 28, 28)
                        .addComponent(lbFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(brnAlterarFunc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbCodigo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lbNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(lbEmail)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(lbSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btAlterarSenha))
                .addGap(8, 8, 8)
                .addComponent(lbConfSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtConfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(lbDataNasc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ftxtDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(68, 68, 68))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btDeletar)
                        .addComponent(btSalvar)
                        .addComponent(btCancelar)))
                .addGap(37, 37, 37))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btDeletarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btDeletarMouseClicked
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja excluir o usuário?",
                "Confirmação", JOptionPane.YES_NO_OPTION);
        if (resposta == JOptionPane.YES_NO_OPTION) {
            UsuarioController controller = new UsuarioController();
            if (controller.excluirUsuario(pkUsuario)) {
                this.dispose();
            }
        }

    }//GEN-LAST:event_btDeletarMouseClicked

    private void btDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeletarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btDeletarActionPerformed

    private void btDeletarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btDeletarKeyPressed

    }//GEN-LAST:event_btDeletarKeyPressed

    private void btCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btCancelarMouseClicked
        this.dispose();
    }//GEN-LAST:event_btCancelarMouseClicked

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed

    }//GEN-LAST:event_btCancelarActionPerformed

    private void txtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNomeActionPerformed

    private void txtNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomeKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtNome.requestFocus();
        }
    }//GEN-LAST:event_txtNomeKeyPressed

    private void txtConfSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConfSenhaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtConfSenha.requestFocus();
        }
    }//GEN-LAST:event_txtConfSenhaKeyPressed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtEmailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtEmail.requestFocus();
        }
    }//GEN-LAST:event_txtEmailKeyPressed

    private void txtSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSenhaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtSenha.requestFocus();
        }
    }//GEN-LAST:event_txtSenhaKeyPressed

    private void ftxtDataNascKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ftxtDataNascKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            ftxtDataNasc.requestFocus();
        }
    }//GEN-LAST:event_ftxtDataNascKeyPressed

    private void btSalvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btSalvarMouseClicked
        if (verificarCampos() == false) {
            return;
        }

        Usuario usu = new Usuario();
        usu.setPkUsuario(pkUsuario);
        usu.setNome(txtNome.getText());
        usu.setEmail(txtEmail.getText());

        String senha = "";
        if (txtSenha.isEditable()) {
            senha = new String(txtSenha.getPassword());
            senha = Utils.calcularMD5(senha);
        } else {
            senha = new String(txtSenha.getPassword());

        }

        usu.setSenha(senha);

        Date data = Utils.converterStringToDate(ftxtDataNasc.getText());
        usu.setDataNasc(data);
        usu.setImagem(lbFoto.getIcon());

        UsuarioController controller = new UsuarioController();
        if (controller.alterarUsuario(usu)) {
            this.dispose();
        }
    }//GEN-LAST:event_btSalvarMouseClicked

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btSalvarActionPerformed

    private void btSalvarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btSalvarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btSalvarMouseClicked(null);
        }
    }//GEN-LAST:event_btSalvarKeyPressed

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void txtCodigoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoKeyPressed

    private void btAlterarSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btAlterarSenhaActionPerformed

    private void btAlterarSenhaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btAlterarSenhaMouseClicked
        if (btAlterarSenha.getText().equals("Alterar senha")) {
            txtSenha.setEditable(true);
            txtConfSenha.setEditable(true);
            txtSenha.setBackground(Color.white);
            txtConfSenha.setBackground(Color.white);
            btAlterarSenha.setText("Cancelar alteração");
            txtSenha.setText("");
            txtConfSenha.setText("");
        } else {
            txtSenha.setEditable(false);
            txtConfSenha.setEditable(false);
            txtSenha.setBackground(Color.gray);
            txtConfSenha.setBackground(Color.gray);
            btAlterarSenha.setText("Alterar senha");

            txtSenha.setText(getSenhaUsuario());
            txtConfSenha.setText(getSenhaUsuario());
        }
    }//GEN-LAST:event_btAlterarSenhaMouseClicked

    private void brnAlterarFuncMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_brnAlterarFuncMouseClicked
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Escolha um arquivo");
        FileNameExtensionFilter filtro = new FileNameExtensionFilter(
                "Imagens", "jpg", "jpeg", "png");
        fileChooser.setFileFilter(filtro);

        fileChooser.setMultiSelectionEnabled(false);

        int returnValue = fileChooser.showOpenDialog(null);

        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File arquivo = fileChooser.getSelectedFile();
            Icon icon = Utils.fileParaIcon(arquivo);

            ImageIcon iconRedimensionado = Utils.redimensionarIcon(icon, 140, 140);
            lbFoto.setIcon(iconRedimensionado);
        }
    }//GEN-LAST:event_brnAlterarFuncMouseClicked

    private boolean verificarCampos() {
        if (txtNome.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo 'Nome' está em branco.");
            return false;

        }
        if (!txtNome.getText().matches("^[\\p{L} ]+$")) {
            JOptionPane.showMessageDialog(null, "Campo 'Nome' possui caracteres inválidos.");
            return false;

        }
        if (txtEmail.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo 'Email' está em branco.");
            return false;

        }
        if (!txtEmail.getText().matches("^[a-zA-Z._]+@[a-zA-Z._]+.[a-zA-Z._]+$")) {
            JOptionPane.showMessageDialog(null, "Campo 'Email' Possui formato inválido.");
            return false;

        }
        if (ftxtDataNasc.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Campo 'Data de nascimento' está em branco.");
            return false;

        }
        if (!ftxtDataNasc.getText().matches("^[0-9]{2}/[0-9]{2}/[0-9]{4}$")) {
            JOptionPane.showMessageDialog(null, "Campo 'Data de nascimento' possui formato inválido." + "Ex: 01/01/2000");
            return false;

        }

        String senha = new String(txtSenha.getPassword());

        if (senha.length() < 8) {
            JOptionPane.showMessageDialog(null, "Campo 'Senha' deve ser maior que 8 caracteres.");
            return false;

        }
        if (!senha.equals(new String(txtConfSenha.getPassword()))) {
            JOptionPane.showMessageDialog(null, "As senhas não são iguais.");
            return false;

        }

        return true;

    }

    public void carregarUsuario() {
        UsuarioController controller = new UsuarioController();
        Usuario usu = controller.readForPk(pkUsuario);

        String codigo = String.valueOf(usu.getPkUsuario());

        txtCodigo.setText(codigo);
        txtNome.setText(usu.getNome());
        txtEmail.setText(usu.getEmail());
        ftxtDataNasc.setText(Utils.converterDateToString(usu.getDataNasc()));
        txtSenha.setText(usu.getSenha());
        txtConfSenha.setText(usu.getSenha());
        setSenhaUsuario(usu.getSenha());
    }

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
            java.util.logging.Logger.getLogger(FRUPDFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FRUPDFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FRUPDFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FRUPDFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FRUPDFuncionario dialog = new FRUPDFuncionario(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton brnAlterarFunc;
    private javax.swing.JButton btAlterarSenha;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btDeletar;
    private javax.swing.JButton btSalvar;
    private javax.swing.JFormattedTextField ftxtDataNasc;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbCodigo;
    private javax.swing.JLabel lbConfSenha;
    private javax.swing.JLabel lbDataNasc;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbFoto;
    private javax.swing.JLabel lbNome;
    private javax.swing.JLabel lbSenha;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JPasswordField txtConfSenha;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNome;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables
}
