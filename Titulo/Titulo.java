package br.com.alura.src.Titulo;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

class Titulo {
    private String titulo;
    private int minutos;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public static void main(String[] args) {
        Titulo titulo = new Titulo();
        titulo.setTitulo("não sabo");
        titulo.setMinutos(69);

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();
        String json = gson.toJson(titulo);

        System.out.println(json);
    }
}
