package model;

import java.util.Date;
import javax.swing.Icon;

public class Funcionario {

    private long pkFunc;
    private String nomeF;
    private String emailF;
    private String senhaF;
    private Date dataNascF;
    private Icon imagem;

    public Funcionario() {
    }

    public Funcionario(long pkFunc, String nomeF, String emailF, String senhaF, Date dataNascF) {
        this.pkFunc = pkFunc;
        this.nomeF = nomeF;
        this.emailF = emailF;
        this.senhaF = senhaF;
        this.dataNascF = dataNascF;
    }

    public long getPkFunc() {
        return pkFunc;
    }

    public void setPkFunc(long pkFunc) {
        this.pkFunc = pkFunc;
    }

    public String getNomeF() {
        return nomeF;
    }

    public void setNomeF(String nomeF) {
        this.nomeF = nomeF;
    }

    public String getEmailF() {
        return emailF;
    }

    public void setEmailF(String emailF) {
        this.emailF = emailF;
    }

    public String getSenhaF() {
        return senhaF;
    }

    public void setSenhaF(String senhaF) {
        this.senhaF = senhaF;
    }

    public Date getDataNascF() {
        return dataNascF;
    }

    public void setDataNascF(Date dataNascF) {
        this.dataNascF = dataNascF;
    }

    public Icon getImagem() {
        return imagem;
    }

    public void setImagem(Icon imagem) {
        this.imagem = imagem;
    }

}
