package br.com.yuri.screenmatch;
import br.com.yuri.screenmatch.calculos.CalculadoraDeTempo;
import br.com.yuri.screenmatch.calculos.FiltroRecomendacao;
import br.com.yuri.screenmatch.modelos.Episodio;
import br.com.yuri.screenmatch.modelos.Filme;
import br.com.yuri.screenmatch.modelos.Serie;

public class Main {
    public static void main(String[] args) {

        Filme meuFilme = new Filme();
        Serie minhaSerie = new Serie();
        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        Episodio ep = new Episodio();
        FiltroRecomendacao filtro = new FiltroRecomendacao();

        meuFilme.setNome("O Senhor dos Anéis - A Sociedade do Anel");
        meuFilme.setAnoDeLancamento(2001);
        meuFilme.setDuracaoEmMinutos(178);
        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(10);
        meuFilme.avalia(8);
        meuFilme.avalia(5);

        System.out.println("===========================================================");

        minhaSerie.setNome("Breaking Bad");
        minhaSerie.setAnoDeLancamento(2005);
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

        System.out.println(calculadora.getTempoTotal());


        System.out.println("Nome: " + minhaSerie.getNome() + "\nNota: " + minhaSerie.getClassificacao());
        filtro.filtrar(minhaSerie);
        System.out.println("Nome: " + meuFilme.getNome() + "\nNota: " + meuFilme.getClassificacao());
        filtro.filtrar(meuFilme);
        System.out.println("Nome: " + ep.getNome() + "\nNota: " + ep.getClassificacao());
        filtro.filtrar(ep);


    }
}
