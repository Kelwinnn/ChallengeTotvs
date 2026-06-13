package br.com.totvschallenge.service;

import br.com.totvschallenge.entities.*;

import java.util.*;

public class AnalisadorDeTranscricao {
    private Transcricao workload;
    //private PoliticaAnalise politica;
    private List<AnaliseBase> resultados;

    public Transcricao getWorkload() {
        return workload;
    }

    public void setWorkload(Transcricao workload) {
        this.workload = workload;
    }

    public List<AnaliseBase> getResultados() {
        return resultados;
    }

    public void setResultados(List<AnaliseBase> resultados) {
        this.resultados = resultados;
    }
}
