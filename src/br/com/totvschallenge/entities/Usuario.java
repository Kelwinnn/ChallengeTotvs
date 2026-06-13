package br.com.totvschallenge.entities;

public class Usuario {
    private String nome;
    private String emailComercial;
    private String senha;

    public Usuario(String nome, String emailComercial, String senha) {
        this.nome = nome;
        this.emailComercial = emailComercial;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmailComercial() {
        return emailComercial;
    }

    public void setEmailComercial(String emailComercial) {
        this.emailComercial = emailComercial;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}
