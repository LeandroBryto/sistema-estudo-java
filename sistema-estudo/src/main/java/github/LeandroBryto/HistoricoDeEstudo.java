package github.LeandroBryto;

import java.util.ArrayList;
import java.util.List;

public class HistoricoDeEstudo {
    private List<String> estudosRealizados;

    public HistoricoDeEstudo() {
        estudosRealizados = new ArrayList<>();
    }

    public void adicionarEstudo(String estudo) {
        estudosRealizados.add(estudo);
    }

    public List<String> getEstudosRealizados() {
        return estudosRealizados;
    }

    public String gerarRelatorio() {
        StringBuilder relatorio = new StringBuilder("Histórico de Estudo:\n");
        for (String estudo : estudosRealizados) {
            relatorio.append(estudo).append("\n");
        }
        return relatorio.toString();
    }

    public void setVisible(boolean b) {
    }
}
