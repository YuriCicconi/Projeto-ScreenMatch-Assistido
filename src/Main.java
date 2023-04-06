public class Main {
    public static void main(String[] args) {

        Filme meuFilme = new Filme();
        meuFilme.nome = "O Senhor dos Anéis - A Sociedade do Anel";
        meuFilme.anoDeLancamento = 2001;
        meuFilme.duracaoEmMinutos = 178;

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(10);
        meuFilme.avalia(8);
        meuFilme.avalia(7);

        System.out.println(meuFilme.somaDasAvaliacoes);
        System.out.println(meuFilme.totalDeAvaliacoes);
        System.out.println(meuFilme.pegaMedia());
    }
}
