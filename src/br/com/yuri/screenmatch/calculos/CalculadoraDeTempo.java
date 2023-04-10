package br.com.yuri.screenmatch.calculos;

import br.com.yuri.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {

    private int tempoTotal;

    public String getTempoTotal() {
        return "O tempo total é: " + tempoTotal + " minutos";
    }

    public void incluiTitulo(Titulo t) {

        tempoTotal += t.getDuracaoEmMinutos();
    }
}
