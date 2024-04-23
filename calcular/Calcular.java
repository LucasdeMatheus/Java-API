package br.com.alura.src.calcular;


import br.com.alura.src.Modelo.Titulo;

public class Calcular {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }
    public void inclui(Titulo t){
        tempoTotal += t.getDuracaoEmMinutos();
    }
}
