package br.com.alura.src.Principal;

import br.com.alura.src.Modelo.Filme;
import br.com.alura.src.Modelo.Serie;
import br.com.alura.src.Modelo.Titulo;

import java.util.ArrayList;
import java.util.Collections;

public class PrincipalComlista {
    public static void main(String[] args) {
        var filme2 = new Filme("Clube da Luta", 1999);
        filme2.avalia(5);
        filme2.avalia(4);
        Serie serie1 = new Serie("Better call Saul",2015);
        Filme meuFilme = new Filme("Taxi Driver", 1976);
        meuFilme.avalia(3);
        meuFilme.avalia(4);

        ArrayList<Titulo> lista = new ArrayList<>();

        lista.add(filme2);
        lista.add(meuFilme);
        lista.add(serie1);

        // for each (para cada um)
        for (Titulo titulo : lista){
            System.out.println(titulo.getNome());
            if (titulo instanceof Filme filme){
            System.out.println("Classificação " + filme.getClassificacao());
            }
        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Ryan gosling");
        buscaPorArtista.add("Brad pit");
        buscaPorArtista.add("Ana de Armas");
        System.out.println(buscaPorArtista);
        Collections.sort(buscaPorArtista);
        System.out.println("ordenado: " + buscaPorArtista);

        Collections.sort(lista);
        System.out.println(lista);
    }
}
