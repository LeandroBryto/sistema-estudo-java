package github.LeandroBryto;

import java.time.LocalDate;

public class DiaDeEstudo {
    private LocalDate data;
    private String topico;
    private String local;
    private int horas;
    private boolean estudado;  // Adiciona um campo para verificar se o dia foi estudado

    public DiaDeEstudo(LocalDate data) {
        this.data = data;
        this.estudado = false;  // Inicializa como não estudado
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
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
        return estudado;  // Retorna se o dia foi estudado
    }

    public void marcarEstudado() {
        this.estudado = true;  // Marca o dia como estudado
    }

    @Override
    public String toString() {
        return "Data: " + data + "\nTópico: " + topico + "\nLocal: " + local + "\nHoras: " + horas + " horas\n";
    }
}
