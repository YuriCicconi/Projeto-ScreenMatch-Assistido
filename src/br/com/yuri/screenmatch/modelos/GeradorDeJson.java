package br.com.yuri.screenmatch.modelos;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class GeradorDeJson {

    public void gerarJson(List titulos) throws IOException {

        Gson gson = new GsonBuilder().
                setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();

        FileWriter escrita = new FileWriter("filmes.json");

        escrita.write(gson.toJson(titulos));
        escrita.close();
    }
}
