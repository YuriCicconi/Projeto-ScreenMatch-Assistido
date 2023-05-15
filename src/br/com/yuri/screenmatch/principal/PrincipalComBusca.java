package br.com.yuri.screenmatch.principal;

import br.com.yuri.screenmatch.modelos.Titulo;
import br.com.yuri.screenmatch.modelos.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner sc = new Scanner(System.in);
        System.out.println("Qual filme gostaria de buscar?");
        var busca = sc.nextLine();
        String apiKey = "26b12326";

        //Salvando a url em uma 'variavel' por ser mais dinamico
        String endereco = "http://www.omdbapi.com/?t=" + busca + "&apikey=" + apiKey;


        //criando um client
        HttpClient client = HttpClient.newHttpClient();
        //criando um request
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();
        //criando um response
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());

        //armazenando o conteudo do body em uma variavel
        String json = response.body();

        //criando um gson builder para não diferenciar maiusculas e minusculas
        Gson gson = new GsonBuilder().
                setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .create();

        //convertendo o json em um objeto classe TituloOmdb
        TituloOmdb meuTituloOmdb = gson.fromJson(json, TituloOmdb.class);

        //instanciando um Titulo a partir de um TituloOmdb
        Titulo meuTitulo = new Titulo(meuTituloOmdb);
        System.out.println("Título já convertido");
        System.out.println(meuTitulo);
    }
}
