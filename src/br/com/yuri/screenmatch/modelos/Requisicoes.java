package br.com.yuri.screenmatch.modelos;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Requisicoes {

    public TituloOmdb pesquisaFilme(String nomeDoFilme) {

         Gson gson = new GsonBuilder()
                 .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                 .setPrettyPrinting()
                 .create();

        try {
            String endereco = "http://www.omdbapi.com/?t=" + nomeDoFilme + "&apikey=26b12326";

            HttpClient client = HttpClient.newHttpClient();

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(endereco))
                    .build();


            HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

            String json = response.body();

            TituloOmdb tituloOmdb = gson.fromJson(json, TituloOmdb.class);

            return tituloOmdb;


        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}
