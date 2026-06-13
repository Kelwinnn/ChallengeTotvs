package br.com.totvschallenge.entities;

import br.com.totvschallenge.entities.enums.NivelRisco;

import java.time.LocalDate;

public class AnaliseRetencao extends AnaliseBase{
    private NivelRisco nivelRisco;
    private String padraoDetectado;
    private String concorrente;

    public AnaliseRetencao(NivelRisco nivelRisco, String padraoDetectado, String concorrente) {
        this.nivelRisco = nivelRisco;
        this.padraoDetectado = padraoDetectado;
        this.concorrente = concorrente;
    }

    public AnaliseRetencao(String trechoDetectado, double confianca, LocalDate dataAnalise, String nomeAnalista, NivelRisco nivelRisco, String padraoDetectado, String concorrente) {
        super(trechoDetectado, confianca, dataAnalise, nomeAnalista);
        this.nivelRisco = nivelRisco;
        this.padraoDetectado = padraoDetectado;
        this.concorrente = concorrente;
    }

    public NivelRisco getNivelRisco() {
        return nivelRisco;
    }

    public void setNivelRisco(NivelRisco nivelRisco) {
        this.nivelRisco = nivelRisco;
    }

    public String getPadraoDetectado() {
        return padraoDetectado;
    }

    public void setPadraoDetectado(String padraoDetectado) {
        this.padraoDetectado = padraoDetectado;
    }

    public String getConcorrente() {
        return concorrente;
    }

    public void setConcorrente(String concorrente) {
        this.concorrente = concorrente;
    }

    @Override
    public NivelRisco classificar(){
        return NivelRisco.CRITICO;
    }
    public String gerarDescricao(){
        return "Teste";
    }
}
