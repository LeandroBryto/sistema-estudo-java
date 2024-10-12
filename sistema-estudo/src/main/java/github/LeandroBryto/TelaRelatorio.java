package github.LeandroBryto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TelaRelatorio {
    private List<DiaDeEstudo> diasDeEstudo;

    public TelaRelatorio() {
        this.diasDeEstudo = new ArrayList<>();
        // Adicionando alguns dias de estudo para exemplo
        adicionarDiasDeEstudo();
    }

    private void adicionarDiasDeEstudo() {
        // Aqui, adicionamos alguns dias de estudo com tópicos, locais e horas
        DiaDeEstudo dia1 = new DiaDeEstudo(LocalDate.of(2024, 10, 1)); // Certifique-se de usar LocalDate
        dia1.setTopico("Conceitos básicos de Java");
        dia1.setLocal("Biblioteca");
        dia1.setHoras(2);
        diasDeEstudo.add(dia1);

        DiaDeEstudo dia2 = new DiaDeEstudo(LocalDate.of(2024, 10, 2));
        dia2.setTopico("Programação Orientada a Objetos");
        dia2.setLocal("Casa");
        dia2.setHoras(1);
        diasDeEstudo.add(dia2);

        // Adicione mais dias conforme necessário
    }

    public void gerarRelatorio() {
        System.out.println("Relatório de Estudo:");
        for (DiaDeEstudo dia : diasDeEstudo) {
            System.out.println(dia);
        }
    }
}
