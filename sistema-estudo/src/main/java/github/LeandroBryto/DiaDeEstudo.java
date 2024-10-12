package github.LeandroBryto;

import java.time.LocalDate;

public class DiaDeEstudo {
    private LocalDate data;
    private String topico;
    private String local;
    private int horas;
    private boolean estudado;

    public DiaDeEstudo(LocalDate data) {
        this.data = data; // Remover o parse, pois data já é do tipo LocalDate
        this.estudado = false;
    }

    public LocalDate getData() {
        return data;
    }

    public String getTopico() {
        return topico;
    }

    public void setTopico(String topico) {
        this.topico = topico;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public boolean isEstudado() {
        return estudado;
    }

    public void marcarEstudado() {
        this.estudado = true;
    }

    @Override
    public String toString() {
        return "Dia: " + data + ", Tópico: " + topico + ", Local: " + local + ", Horas: " + horas + " - " + (estudado ? "Estudado" : "Não Estudado");
    }
}
