package model;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import utils.Utils;

public class UsuarioDAO {

    public boolean autenticar(String email, String senha) {
        String sql = "SELECT * from TBUSUARIO WHERE email = ? and senha = ?";

        GerenciadorConexao gerenciador = new GerenciadorConexao();
        Connection con = gerenciador.getConexao();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, email);
            stmt.setString(2, senha);
            rs = stmt.executeQuery();
            if (rs.next()) {
                return true;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());

        } finally {
            gerenciador.closeConnection(stmt, rs);
        }
        return false;
    }

    public boolean adicionarUsuario(Usuario u) {
        String sql = "INSERT into TBUSUARIO(nome, email, senha, dataNasc) VALUES (?,?,?,?,?,?)";

        GerenciadorConexao gerenciador = new GerenciadorConexao();
        Connection con = gerenciador.getConexao();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, u.getNome());
            stmt.setString(2, u.getEmail());
            stmt.setString(3, u.getSenha());
            stmt.setDate(4, new java.sql.Date(u.getDataNasc().getTime()));
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Usuario " + u.getNome() + " inserido com sucesso!");
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        } finally {
            gerenciador.closeConnection(stmt);
        }
        return false;
    }

    //Listar usuários
    public List<Usuario> readForDesc(int tipo, String desc) {
        String sql = "SELECT * FROM tbusuario";
        if (!desc.equals("")) {
            if (tipo == 0 || tipo == 1) {
                sql = sql + " WHERE nome LIKE ?";
            } else {
                sql = sql + " WHERE email LIKE ?";
            }
        }
        GerenciadorConexao gerenciador = new GerenciadorConexao();
        Connection con = gerenciador.getConexao();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Usuario> usuarios = new ArrayList<>();

        try {
            stmt = con.prepareStatement(sql);
            if (!desc.equals("")) {
                if (tipo == 0 || tipo == 2) {
                    stmt.setString(1, desc + "%");
                } else {
                    stmt.setString(1, "%" + desc + "%");
                }
            }
            rs = stmt.executeQuery();
            while (rs.next()) {
                Usuario usuario = new Usuario();

                usuario.setPkUsuario(rs.getLong("pkusuario"));
                usuario.setNome(rs.getString("nome"));
                usuario.setEmail(rs.getString("email"));
                usuario.setDataNasc(rs.getDate("datanasc"));
                usuarios.add(usuario);
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);

        } finally {
            gerenciador.closeConnection(stmt, rs);
        }
        return usuarios;

    }

    public Usuario readForPk(long pk) {
        String sql = "SELECT * FROM tbusuario WHERE pkusuario =?";

        GerenciadorConexao gerenciador = new GerenciadorConexao();
        Connection con = gerenciador.getConexao();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Usuario usuario = new Usuario();

        try {
            stmt = con.prepareStatement(sql);
            stmt.setLong(1, pk);

            rs = stmt.executeQuery();
            if (rs.next()) {
                usuario.setPkUsuario(rs.getLong("pkusuario"));
                usuario.setNome(rs.getString("nome"));
                usuario.setEmail(rs.getString("email"));
                usuario.setSenha(rs.getString("senha"));
                usuario.setDataNasc(rs.getDate("datanasc"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);

        } finally {
            gerenciador.closeConnection(stmt, rs);
        }
        return usuario;

    }

    public boolean alterarFuncionario(Funcionario func) {
        String sql = "UPDATE tbfuncionario SET nome = ?, email = ?, senha = ?, datanasc = ?, imagem = ? WHERE pkusuario = ?";

        GerenciadorConexao gerenciador = new GerenciadorConexao();
        Connection con = gerenciador.getConexao();
        PreparedStatement stmt = null;

        try {
            byte[] iconBytes = Utils.iconToBytes(func.getImagem());

            stmt = con.prepareStatement(sql);
            stmt.setString(1, func.getNomeF());
            stmt.setString(2, func.getEmailF());
            stmt.setString(3, func.getSenhaF());
            stmt.setDate(4, new java.sql.Date(func.getDataNascF().getTime()));
            stmt.setBytes(5, iconBytes);
            stmt.setLong(6, func.getPkFunc());

            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Usuario atualizado com sucesso!");
            return true;
        } catch (SQLException | IOException e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + e.getMessage());
        } finally {
            gerenciador.closeConnection(stmt);
        }
        return false;
    }

    public boolean excluirUsuario(int pkUsuario) {
        String sql = "DELETE FROM tbusuario WHERE pkusuario = ?";

        GerenciadorConexao gerenciador = new GerenciadorConexao();
        Connection con = gerenciador.getConexao();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, pkUsuario);

            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Usuario excluído com sucesso!");
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir: " + e.getMessage());
        } finally {
            gerenciador.closeConnection(stmt);
        }
        return false;
    }

    public boolean adicionarFuncionario(Funcionario func) {
        String sql = "INSERT into TBUSUARIO(nomeF, emailF, senhaF, dataNascF, imagem) VALUES (?,?,?,?,?,?)";

        GerenciadorConexao gerenciador = new GerenciadorConexao();
        Connection con = gerenciador.getConexao();
        PreparedStatement stmt = null;

        try {
            byte[] iconBytes = Utils.iconToBytes(func.getImagem());

            stmt = con.prepareStatement(sql);
            stmt.setString(1, func.getNomeF());
            stmt.setString(2, func.getEmailF());
            stmt.setString(3, func.getSenhaF());
            stmt.setDate(4, new java.sql.Date(func.getDataNascF().getTime()));
            stmt.setBytes(5, iconBytes);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Usuario " + func.getNomeF() + " inserido com sucesso!");
            return true;
        } catch (SQLException | IOException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        } finally {
            gerenciador.closeConnection(stmt);
        }
        return false;
    }
}
