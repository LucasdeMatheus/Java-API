package br.com.alura.src.Desafio;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.*;

public class BuscaCep {

    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner sc = new Scanner(System.in);
        String cep = "";


        List<Map<String, Object>> enderecos = new ArrayList<>();

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();

        while(!cep.equalsIgnoreCase("sair")) {
            System.out.println("Digite o CEP: ");
            cep = sc.nextLine();

            if(cep.equalsIgnoreCase("sair")) {
                break;
            }

            String endereco = "https://viacep.com.br/ws/" + cep + "/json/";

            try{
                validarCep(cep);
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();
                HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

                String json = response.body();
                if (json.contains("\"erro\": true")) {
                    System.out.println("CEP não encontrado.");
                }else if (response.statusCode() == 400) {
                    System.out.println("cep invalido, tente novamente.");;
                }else {
                    System.out.println(json);
                    Map<String, Object> enderecoMap = gson.fromJson(json, HashMap.class);
                    enderecos.add(enderecoMap);
                }

            }catch (cepInvalid e) {
                System.out.println(e.getMessage());
            }



        }
        System.out.println(gson.toJson(enderecos));
        File diretorio = new File("C:\\Users\\ffgus\\Desktop\\api\\Desafio");
        File arquivo = new File(diretorio, "endereço.json");
        FileWriter escrita = new FileWriter(arquivo);
        escrita.write(gson.toJson(enderecos));
        escrita.close();
    }

    public static void validarCep(String cep){
        if(cep.length() > 8 || cep.length() < 8 || !cep.matches("[0-9]+")){
            throw new cepInvalid("CEP inválido: Por favor, insira um cep com 8 digitos numéricos");
        }
    }
}
