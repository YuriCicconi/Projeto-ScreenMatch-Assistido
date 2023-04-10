package br.com.yuri.screenmatch;
import br.com.yuri.screenmatch.calculos.CalculadoraDeTempo;
import br.com.yuri.screenmatch.modelos.Filme;
import br.com.yuri.screenmatch.modelos.Serie;

public class Main {
    public static void main(String[] args) {

        Filme meuFilme = new Filme();
        Serie minhaSerie = new Serie();
        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();

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

        calculadora.incluiTitulo(meuFilme);
        calculadora.incluiTitulo(minhaSerie);
        System.out.println(calculadora.getTempoTotal());

    }
}
