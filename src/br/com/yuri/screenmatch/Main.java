package br.com.yuri.screenmatch;
import br.com.yuri.screenmatch.calculos.CalculadoraDeTempo;
import br.com.yuri.screenmatch.calculos.FiltroRecomendacao;
import br.com.yuri.screenmatch.modelos.Episodio;
import br.com.yuri.screenmatch.modelos.Filme;
import br.com.yuri.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Filme meuFilme = new Filme("O Senhor dos Anéis - A Sociedade do Anel", 2001);
        Filme outroFilme = new Filme("Sobre Meninos e Lobos", 2002);
        Serie minhaSerie = new Serie("Breaking Bad", 2005);
        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        Episodio ep = new Episodio();
        FiltroRecomendacao filtro = new FiltroRecomendacao();

        meuFilme.setDuracaoEmMinutos(178);
        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(10);
        meuFilme.avalia(8);
        meuFilme.avalia(5);

        outroFilme.setDuracaoEmMinutos(161);
        outroFilme.avalia(10);
        outroFilme.avalia(9);
        outroFilme.avalia(6);

        System.out.println("===========================================================");

        minhaSerie.setAtiva(false);
        minhaSerie.setTemporadas(5);
        minhaSerie.setEpisodiosPorTemporada(13);
        minhaSerie.setDuracaoPorEpisodio(45);
        minhaSerie.setIncluidoNoPlano(true);
        minhaSerie.exibeFichaTecnica();
        minhaSerie.avalia(10);
        minhaSerie.avalia(8);
        minhaSerie.avalia(9);

        System.out.println("===========================================================");

        ep.setVisualizacoes(500);
        ep.setSerie(minhaSerie);
        ep.setNumero(65);
        ep.setNome("Felina");
        ep.setDuracao(45);

        calculadora.incluiTitulo(meuFilme);
        calculadora.incluiTitulo(minhaSerie);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();

        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);

        System.out.println("Para maratonar os iten selecionados, " + calculadora.getTempoTotal());

        System.out.println("===========================================================");

        System.out.println("Nome: " + minhaSerie.getNome() + "\nNota: " + minhaSerie.getClassificacao());
        filtro.filtrar(minhaSerie);

        System.out.println("===========================================================");

        System.out.println("Nome: " + meuFilme.getNome() + "\nNota: " + meuFilme.getClassificacao());
        filtro.filtrar(meuFilme);

        System.out.println("===========================================================");

        System.out.println("Nome: " + ep.getNome() + "\nNota: " + ep.getClassificacao());
        filtro.filtrar(ep);

        System.out.println("===========================================================");

        System.out.println("Lista de filmes: ");
        System.out.println(listaDeFilmes);


    }
}
