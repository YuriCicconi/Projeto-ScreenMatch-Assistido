package br.com.yuri.screenmatch.calculos;

public class FiltroRecomendacao {

    public void filtrar(Classificavel classificavel) {

        if (classificavel.getClassificacao() >= 4) {
            System.out.println("Está entre os preferidos da galera");
        } else if (classificavel.getClassificacao() >= 3) {
            System.out.println("Está em alta");
        } else {
            System.out.println("Adicione para assistir mais tarde");
        }
    }
}
