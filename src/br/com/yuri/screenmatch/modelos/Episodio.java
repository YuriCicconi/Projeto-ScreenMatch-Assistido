package br.com.yuri.screenmatch.modelos;

import br.com.yuri.screenmatch.calculos.Classificavel;

public class Episodio implements Classificavel {

    private int visualizacoes;
    private int numero;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    Serie serie;
    private int duracao;
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    public int getVisualizacoes() {
        return visualizacoes;
    }

    public void setVisualizacoes(int visualizacoes) {
        this.visualizacoes = visualizacoes;
    }

    @Override
    public int getClassificacao() {
        if (this.visualizacoes > 1000) {
            return 5;
        } else if (this.visualizacoes >= 500) {
            return 3;
        } else {
            return 2;
        }
    }
}
