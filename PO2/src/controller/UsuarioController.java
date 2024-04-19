package controller;

import java.util.List;
import javax.swing.JOptionPane;
import model.Usuario;
import model.UsuarioDAO;

public class UsuarioController {
    private UsuarioDAO usuarioDAO;

    public UsuarioController() {
        usuarioDAO = new UsuarioDAO();

    }

    public Usuario autenticar(String email, String senha) {
        Usuario usu = usuarioDAO.autenticar(email, senha);
        if (!usu.getEmail().equals("")) {
            JOptionPane.showMessageDialog(null, "bem-vindo " + usu.getNome() + "!");
        } else {
            JOptionPane.showMessageDialog(null, "Usuário ou senha incorreto");
        }
        return usu;
    }

    public boolean adicionarUsuario(Usuario u) {
        if (usuarioDAO.adicionarUsuario(u)) {
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Usuário não cadastrado");
            return false;
        }
    }

    public List<Usuario> readForDesc(int tipo, String desc) {
        return usuarioDAO.readForDesc(tipo, desc);
    }

    public Usuario readForPk(long pk) {
        Usuario usu = usuarioDAO.readForPk(pk);
        if (usu == null) {
            JOptionPane.showMessageDialog(null, "Usuário não cadastrado");
            return null;
        }
        return usu;
    }

    public boolean alterarUsuario(Usuario usu) {
        if (usuarioDAO.alterarUsuario(usu)) {
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Usuário não pôde ser editado");
            return false;
        }
    }

    public boolean excluirUsuario(int pkUsuario) {
        if (usuarioDAO.excluirUsuario(pkUsuario)) {
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Usuário não excluído");
            return false;
        }

    }
}
