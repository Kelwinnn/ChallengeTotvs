package br.com.totvschallenge.entities;

import br.com.totvschallenge.entities.enums.ProdutoTOTVS;
import br.com.totvschallenge.entities.enums.SentimentoCliente;

import java.util.List;

public class Relatorio {
    public ProdutoTOTVS produtoIndentif;
    public SentimentoCliente sentimento;
    public double budget;
    public List oportunidades;
    public List retencoes;

    public ProdutoTOTVS getProdutoIndentif() {
        return produtoIndentif;
    }

    public void setProdutoIndentif(ProdutoTOTVS produtoIndentif) {
        this.produtoIndentif = produtoIndentif;
    }

    public SentimentoCliente getSentimento() {
        return sentimento;
    }

    public void setSentimento(SentimentoCliente sentimento) {
        this.sentimento = sentimento;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public List getOportunidades() {
        return oportunidades;
    }

    public void setOportunidades(List oportunidades) {
        this.oportunidades = oportunidades;
    }

    public List getRetencoes() {
        return retencoes;
    }

    public void setRetencoes(List retencoes) {
        this.retencoes = retencoes;
    }

    public void exibirResumo(){}

    public String exportarJSON(){
        return "";
    }
}
