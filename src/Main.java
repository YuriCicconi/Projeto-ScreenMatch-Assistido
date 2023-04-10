import br.com.yuri.screenmatch.modelos.Filme;

public class Main {
    public static void main(String[] args) {

        Filme meuFilme = new Filme();
        meuFilme.setNome("O Senhor dos Anéis - A Sociedade do Anel");
        meuFilme.setAnoDeLancamento(2001);
        meuFilme.setDuracaoEmMinutos(178);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(10);
        meuFilme.avalia(8);
        meuFilme.avalia(5);

        System.out.println(meuFilme);
        System.out.println(meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());
    }
}
