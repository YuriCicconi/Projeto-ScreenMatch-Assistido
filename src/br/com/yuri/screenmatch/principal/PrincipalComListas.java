package br.com.yuri.screenmatch.principal;

import br.com.yuri.screenmatch.modelos.Filme;
import br.com.yuri.screenmatch.modelos.Serie;
import br.com.yuri.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalComListas {
    public static void main(String[] args) {

        Filme meuFilme = new Filme("Dogville", 2003);
        meuFilme.avalia(7);
        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.avalia(8);
        Filme maisUmFilme = new Filme("Top Gun", 2022);
        maisUmFilme.avalia(9);

        Serie minhaSerie = new Serie("Breaking Bad", 2005);
        minhaSerie.avalia(10);

        ArrayList<Titulo> lista = new ArrayList<>();

        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(maisUmFilme);
        lista.add(minhaSerie);

        for (Titulo item: lista) {
            if (item instanceof Filme filme) {
                System.out.println(filme.getNome() + " " + filme.getClassificacao());
            } else if (item instanceof Serie serie) {
                System.out.println(serie.getNome() + " " + serie.getClassificacao());
            }
        }
        
    }
}
