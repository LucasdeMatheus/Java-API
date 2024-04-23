package br.com.alura.src.Modelo;

import br.com.alura.src.exceção.ErroDeConversaoDeAnoException;
import com.google.gson.annotations.SerializedName;

public class Titulo implements Comparable<Titulo>{

        //@SerializedName("Title")
        private String nome;
        //@SerializedName("Year")
        private int anoDeLancamento;
        private boolean incluidoNoPlano;
        private double somaDasAvaliações;
        private int totalDeAvaliacoes;
        private int duracaoEmMinutos;

        public Titulo(String nome, int anoDeLancamento) {
            this.nome = nome;
            this.anoDeLancamento = anoDeLancamento;
        }

    public Titulo(TituloOmdb meuTituloOmdb) {
        this.nome = meuTituloOmdb.title();

        if(meuTituloOmdb.year().length() > 4) {
            throw new ErroDeConversaoDeAnoException("Não consegui converter o ano porque tem mais de 04 caracteres.");
        }
        this.anoDeLancamento = Integer.parseInt(meuTituloOmdb.year());
        this.duracaoEmMinutos = Integer.parseInt(meuTituloOmdb.runtime().substring(0, 2));
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
            this.anoDeLancamento = anoDeLancamento;
        }

        public void setIncluidoNoPlano(boolean incluidoNoPlano) {
            this.incluidoNoPlano = incluidoNoPlano;
        }

        public void setSomaDasAvaliações(double somaDasAvaliações) {
            this.somaDasAvaliações = somaDasAvaliações;
        }

        public void setDuracaoEmMinutos(int duracaoEmMinutos) {
            this.duracaoEmMinutos = duracaoEmMinutos;
        }

        public void avalia(double nota){
            somaDasAvaliações += nota;
            totalDeAvaliacoes++;;
        }
        public String getNome() {
            return nome;
        }

        public int getAnoDeLancamento() {
            return anoDeLancamento;
        }

        public boolean isIncluidoNoPlano() {
            return incluidoNoPlano;
        }

        public double getSomaDasAvaliações() {
            return somaDasAvaliações;
        }

        public int getTotalDeAvaliacoes() {
            return totalDeAvaliacoes;
        }

        public int getDuracaoEmMinutos() {
            return duracaoEmMinutos;
        }

        public double pegaMedia(){
            return  somaDasAvaliações / totalDeAvaliacoes;
        }

        public int getClassificacao() {
            return 0;
        }

        @Override
        public String toString() {
            return "\n(nome='" + nome + '\'' +
                    ", \nano de lancamento=" + anoDeLancamento
                    + ", \nduração: " + duracaoEmMinutos + " minutos)";

        }

        @Override
        public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }
}
