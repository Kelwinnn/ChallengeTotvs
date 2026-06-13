package br.com.totvschallenge.entities;

import br.com.totvschallenge.entities.enums.NivelRisco;
import br.com.totvschallenge.entities.enums.ProdutoTOTVS;
import br.com.totvschallenge.entities.enums.TipoOportunidade;

import java.time.LocalDate;

public class AnaliseOportunidade extends AnaliseBase{
    private TipoOportunidade tipoOportunidade;
    private ProdutoTOTVS produtoSugerido;
    private double valorEstimado;

    public AnaliseOportunidade(TipoOportunidade tipoOportunidade, ProdutoTOTVS produtoSugerido, double valorEstimado) {
        this.tipoOportunidade = tipoOportunidade;
        this.produtoSugerido = produtoSugerido;
        this.valorEstimado = valorEstimado;
    }

    public AnaliseOportunidade(String trechoDetectado, double confianca, LocalDate dataAnalise, String nomeAnalista, TipoOportunidade tipoOportunidade, ProdutoTOTVS produtoSugerido, double valorEstimado) {
        super(trechoDetectado, confianca, dataAnalise, nomeAnalista);
        this.tipoOportunidade = tipoOportunidade;
        this.produtoSugerido = produtoSugerido;
        this.valorEstimado = valorEstimado;
    }

    public TipoOportunidade getTipoOportunidade() {
        return tipoOportunidade;
    }

    public void setTipoOportunidade(TipoOportunidade tipoOportunidade) {
        this.tipoOportunidade = tipoOportunidade;
    }

    public ProdutoTOTVS getProdutoSugerido() {
        return produtoSugerido;
    }

    public void setProdutoSugerido(ProdutoTOTVS produtoSugerido) {
        this.produtoSugerido = produtoSugerido;
    }

    public double getValorEstimado() {
        return valorEstimado;
    }

    public void setValorEstimado(double valorEstimado) {
        this.valorEstimado = valorEstimado;
    }

    @Override
    public NivelRisco classificar(){
        return NivelRisco.CRITICO;
    }
    public String gerarDescricao(){
        return "Teste";
    }
}
