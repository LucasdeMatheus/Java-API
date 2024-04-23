package br.com.alura.src.Modelo;

import br.com.alura.Filme.calcular.Classificacao;

public class Serie extends Titulo implements Classificacao {
    private int temporada;
    private int epsodioporTemporada;
    private boolean ativa;
    private  int minutosPorEpisodio;

    public Serie(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }

    public void exibirSerie(){
        System.out.println("Nome: " + getNome());
        System.out.println("Ano de lancamento: " + getAnoDeLancamento());
        System.out.println("Avaliacao: " + pegaMedia());
        System.out.println("Total de Avaliacoes: " + getTotalDeAvaliacoes());
        System.out.println("Duração: " + getDuracaoEmMinutos() + "min");
        System.out.println("temporada: " + temporada);
        System.out.println("epsodioporTemporada: " + epsodioporTemporada);
        System.out.println("ativa: " + ativa);
        System.out.println("minutos: " + minutosPorEpisodio + "min");
    }

    public int getTemporada() {
        return temporada;
    }

    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    public int getEpsodioporTemporada() {
        return epsodioporTemporada;
    }

    public void setEpsodioporTemporada(int epsodioporTemporada) {
        this.epsodioporTemporada = epsodioporTemporada;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    @Override
    public int getDuracaoEmMinutos() {
        return temporada * epsodioporTemporada * minutosPorEpisodio;
    }

    @Override
    public int getClassificacao() {
        return 0;
    }
}
