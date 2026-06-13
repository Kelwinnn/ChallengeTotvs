package br.com.totvschallenge.entities;

import java.time.LocalDate;

public class Transcricao {
    private int id;
    private String conteudo;
    private LocalDate dataReuniao;
    private String nomeVendedor;

    public Transcricao(int id, String conteudo, LocalDate dataReuniao, String nomeVendedor) {
        this.id = id;
        this.conteudo = conteudo;
        this.dataReuniao = dataReuniao;
        this.nomeVendedor = nomeVendedor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public LocalDate getDataReuniao() {
        return dataReuniao;
    }

    public void setDataReuniao(LocalDate dataReuniao) {
        this.dataReuniao = dataReuniao;
    }

    public String getNomeVendedor() {
        return nomeVendedor;
    }

    public void setNomeVendedor(String nomeVendedor) {
        this.nomeVendedor = nomeVendedor;
    }
}
