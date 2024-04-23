package br.com.alura.src.Principal;

import br.com.alura.src.Modelo.Episodio;
import br.com.alura.src.Modelo.Filme;
import br.com.alura.src.calcular.Calcular;
import br.com.alura.src.calcular.FiltroRecomendacao;
import br.com.alura.src.Modelo.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Calcular calcular = new Calcular();

        Filme meuFilme = new Filme("Taxi Driver", 1976);
        meuFilme.setDuracaoEmMinutos(112);
        meuFilme.setIncluidoNoPlano(true);

        meuFilme.avalia(5);
        meuFilme.avalia(10);
        meuFilme.avalia(4.5);
        meuFilme.avalia(8);
        meuFilme.exibirFilme();

        System.out.println("\n***************************************\n");
        Serie serie1 = new Serie("Better call Saul",2015);
        serie1.setTemporada(5);
        serie1.setMinutosPorEpisodio(60);
        serie1.setIncluidoNoPlano(true);
        serie1.setEpsodioporTemporada(11);
        serie1.setAtiva(false);
        serie1.exibirSerie();

        calcular.inclui(serie1);
        calcular.inclui(meuFilme);
        System.out.println("\n\n" + calcular.getTempoTotal() + "min");

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(serie1);
        episodio.setTotalVisualizacao(300);
        filtro.filtra(episodio);

        var filme2 = new Filme("Clube da Luta", 1999);
        filme2.setDuracaoEmMinutos(139);
        filme2.setIncluidoNoPlano(true);
        filme2.avalia(10);
        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filme2);
        listaDeFilmes.add(meuFilme);
        System.out.println("Tamanho da Lista: " + listaDeFilmes.size());
        System.out.println("Primeiro filme: " + listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);
        System.out.println("toString do Filme: " + listaDeFilmes.get(0).toString());

    }
}
