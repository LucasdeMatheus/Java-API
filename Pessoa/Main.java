package br.com.alura.src.Pessoa;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
    public static void main(String[] args) {
        String jsonPessoa = """
          {
            "nome" : "Lucas",
            "idade" : 18,
            "cidade" : "Brasilia"
          }
        """;

//        Gson gson = new Gson();
//        Pessoa pessoa = gson.fromJson(jsonPessoa, Pessoa.class);
//
//        System.out.println("Objeto Pessoa: " + pessoa);

        Gson gson = new GsonBuilder().setLenient().create();
        Pessoa pessoa = gson.fromJson(jsonPessoa, Pessoa.class);
        System.out.println("Objeto Pessoa: " + pessoa);
    }
}
