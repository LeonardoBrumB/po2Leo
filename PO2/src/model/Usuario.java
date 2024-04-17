package model;

import java.util.Date;

public class Usuario {

    private long pkUsuario;
    private String nome;
    private String email;
    private String senha;
    private Date dataNasc;

    public Usuario() {
    }

    public Usuario(long pkUsuario, String nome, String email, String senha, Date dataNasc) {
        this.pkUsuario = pkUsuario;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.dataNasc = dataNasc;
    }

    public long getPkUsuario() {
        return pkUsuario;
    }

    public void setPkUsuario(long pkUsuario) {
        this.pkUsuario = pkUsuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Date getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Date datanasc) {
        this.dataNasc = datanasc;
    }

}
