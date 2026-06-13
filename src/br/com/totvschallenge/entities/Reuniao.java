package br.com.totvschallenge.entities;

import java.util.List;

public class Reuniao {
    public int id;
    public Transcricao transcricao;
    public Relatorio relatorio;
    public List participantes;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Transcricao getTranscricao() {
        return transcricao;
    }

    public void setTranscricao(Transcricao transcricao) {
        this.transcricao = transcricao;
    }

    public Relatorio getRelatorio() {
        return relatorio;
    }

    public void setRelatorio(Relatorio relatorio) {
        this.relatorio = relatorio;
    }

    public List getParticipantes() {
        return participantes;
    }

    public void setParticipantes(List participantes) {
        this.participantes = participantes;
    }
}
