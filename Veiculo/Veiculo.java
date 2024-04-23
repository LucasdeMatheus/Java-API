package br.com.alura.src.Veiculo;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Veiculo {
    private String placa;
    private String modelo;

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public static void main(String[] args) {
        Veiculo honda = new Veiculo();
        honda.setPlaca("ABC-1234");
        honda.setModelo("HON-2024-HD");

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();
        String json = gson.toJson(honda);
        System.out.println(json);
    }
}
