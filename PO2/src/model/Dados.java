package model;

import java.util.Date;
import java.util.Date;

public class Dados {

    private long pkUsuario;
    private String nome;
    private String email;
    private Date dataNasc;

    public Dados() {
    }

    public Dados(long pkUsuario, String nome, String email, Date dataNasc) {
        this.pkUsuario = pkUsuario;
        this.nome = nome;
        this.email = email;
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

    public Date getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Date datanasc) {
        this.dataNasc = datanasc;
    }

}
