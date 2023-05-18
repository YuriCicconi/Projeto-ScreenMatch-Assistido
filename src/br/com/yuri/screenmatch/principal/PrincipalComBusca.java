package br.com.yuri.screenmatch.principal;

import br.com.yuri.screenmatch.modelos.GeradorDeJson;
import br.com.yuri.screenmatch.modelos.Requisicoes;
import br.com.yuri.screenmatch.modelos.Titulo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner sc = new Scanner(System.in);
        String nomeDoFilme = "";
        List<Titulo> lista = new ArrayList<>();

        while (!nomeDoFilme.equalsIgnoreCase("sair")) {
            System.out.println("Qual filme gostaria de buscar? (Digite sair para sair)");
            nomeDoFilme = sc.nextLine();

            if (nomeDoFilme.equalsIgnoreCase("sair")) {
                break;
            }

            try {
                Requisicoes requisicao = new Requisicoes();

                //instanciando um Titulo a partir de um TituloOmdb
                Titulo meuTitulo = new Titulo(requisicao.pesquisaFilme(nomeDoFilme));

                lista.add(meuTitulo);

            } catch (NumberFormatException e) {
                System.out.println("Aconteceu um erro");
                System.out.println(e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println("Algum erro de argumento na busca, verifique o endereço");
            }
        }

        GeradorDeJson novoGerador = new GeradorDeJson();

        novoGerador.gerarJson(lista);
    }
}
