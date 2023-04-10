package br.com.yuri.screenmatch.modelos;

public class Serie extends Titulo{

    private int temporadas;
    private int episodiosPorTemporada;
    private int duracaoPorEpisodio;
    private boolean ativa;

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public int getDuracaoPorEpisodio() {
        return duracaoPorEpisodio;
    }

    public void setDuracaoPorEpisodio(int duracaoPorEpisodio) {
        this.duracaoPorEpisodio = duracaoPorEpisodio;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    @Override
    public void exibeFichaTecnica() {
        System.out.println("Nome: " + getNome());
        System.out.println("Ano de lançamento: " + getAnoDeLancamento());
        System.out.println("Temporadas: " + getTemporadas());
        System.out.println("Episódios por temporada: " + getEpisodiosPorTemporada());
        System.out.println("Duração de cada episódio: " + getDuracaoPorEpisodio());
        if (this.ativa == false) {
            System.out.println("Série finalizada");
        }else {
            System.out.println("Série ainda em produção");
        }
        if (this.isIncluidoNoPlano() == false) {
            System.out.println("Não incluído no plano");
        }else {
            System.out.println("Incluído no plano");
        }
    }

    @Override
    public int getDuracaoEmMinutos() {
        return this.temporadas * this.episodiosPorTemporada * this.duracaoPorEpisodio;
    }
}
