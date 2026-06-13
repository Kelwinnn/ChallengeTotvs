package br.com.totvschallenge.entities;

import br.com.totvschallenge.entities.enums.NivelRisco;

import java.time.LocalDate;

public abstract class AnaliseBase {
    private String trechoDetectado;
    private double confianca;
    private LocalDate dataAnalise;
    private String nomeAnalista;

    public AnaliseBase() {
    }

    public AnaliseBase(String trechoDetectado, double confianca, LocalDate dataAnalise, String nomeAnalista) {
        this.trechoDetectado = trechoDetectado;
        this.confianca = confianca;
        this.dataAnalise = dataAnalise;
        this.nomeAnalista = nomeAnalista;
    }

    public String getTrechoDetectado() {
        return trechoDetectado;
    }

    public void setTrechoDetectado(String trechoDetectado) {
        this.trechoDetectado = trechoDetectado;
    }

    public double getConfianca() {
        return confianca;
    }

    public void setConfianca(double confianca) {
        this.confianca = confianca;
    }

    public LocalDate getDataAnalise() {
        return dataAnalise;
    }

    public void setDataAnalise(LocalDate dataAnalise) {
        this.dataAnalise = dataAnalise;
    }

    public String getNomeAnalista() {
        return nomeAnalista;
    }

    public void setNomeAnalista(String nomeAnalista) {
        this.nomeAnalista = nomeAnalista;
    }

    public abstract NivelRisco classificar();

    public abstract String gerarDescricao();

}
