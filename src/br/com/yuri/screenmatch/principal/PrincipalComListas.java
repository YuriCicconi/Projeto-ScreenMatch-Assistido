package br.com.yuri.screenmatch.principal;

import br.com.yuri.screenmatch.modelos.Filme;
import br.com.yuri.screenmatch.modelos.Serie;
import br.com.yuri.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

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

        ArrayList<String> buscaPorArtista = new ArrayList<>();

        buscaPorArtista.add("Yuri");
        buscaPorArtista.add("Amanda");
        buscaPorArtista.add("Laura");

        Collections.sort(buscaPorArtista);
        System.out.println(buscaPorArtista);

        //Para a lista de titulos conseguir ser organizada por ordem alfabética, é preciso que a classe Titulo implemente
        //a interace Comparable.
        Collections.sort(lista);
        System.out.println(lista);

        //Para ordenar a lista por ordem de ano de lançamento, é ncessário chamar o método sort, que utiliza a interface Comparator
        //e o método comparing para ordenar do mais antigo para o mais recente.
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println(lista);
        
    }
}
