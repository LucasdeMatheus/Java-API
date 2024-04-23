package br.com.alura.src.Modelo;

import br.com.alura.Filme.calcular.Classificacao;

public class Filme extends Titulo implements Classificacao {
    private String diretor;

    public Filme(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }


    public void exibirFilme(){
        System.out.println("Nome: " + getNome());
        System.out.println("Ano de lancamento: " + getAnoDeLancamento());
        System.out.println("Avaliacao: " + pegaMedia());
        System.out.println("Total de Avaliacoes: " + getTotalDeAvaliacoes());
        System.out.println("Duração: " + getDuracaoEmMinutos() + "min");
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int)pegaMedia() / 2;
    }

    @Override
    public String toString() {
        return "Filme: " + this.getNome() + " (" + this.getAnoDeLancamento() + ")";
    }


}