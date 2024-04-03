package controller;

import javax.swing.JOptionPane;
import model.UsuarioDAO;

public class UsuarioController {

    private UsuarioDAO usuarioDAO;

    public UsuarioController() {
        usuarioDAO = new UsuarioDAO();

    }

    public boolean autenticar(String email, String senha) {
        if (usuarioDAO.autenticar(email, senha)) {
            return true;

        } else {
            JOptionPane.showMessageDialog(null, "Usuário ou senha incorreto");
            return false;
        }
    }
}
