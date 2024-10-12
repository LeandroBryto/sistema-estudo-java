package github.LeandroBryto;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;

public class TelaCalendario {
    private JFrame frame;
    private JButton estudarButton;
    private JButton voltarButton; // Novo botão "Voltar"
    private JLabel calendarioLabel;
    private DiaDeEstudo diaAtual;  // Instância para o dia de estudo atual
    private HistoricoDeEstudo telaPrincipal;  // Referência para a tela principal (agora correto)

    public TelaCalendario(HistoricoDeEstudo telaPrincipal) { // Recebe a tela principal como parâmetro
        this.telaPrincipal = telaPrincipal;

        frame = new JFrame("Calendário de Estudo");
        estudarButton = new JButton("Estudar Agora");
        voltarButton = new JButton("Voltar"); // Inicializa o botão "Voltar"
        calendarioLabel = new JLabel();

        // Layout
        frame.setLayout(new FlowLayout());
        frame.add(new JLabel("Agenda de Estudo:"));
        frame.add(estudarButton);
        frame.add(voltarButton);  // Adiciona o botão "Voltar" à tela
        frame.add(calendarioLabel);

        // Configurações da janela
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);

        // Exibir o calendário com tópicos de estudo
        diaAtual = new DiaDeEstudo(LocalDate.now()); // Inicializa o dia de estudo
        exibirCalendario();

        // Ação para o botão Estudar Agora
        estudarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int resposta = JOptionPane.showConfirmDialog(frame, "Você deseja estudar agora?", "Confirmação", JOptionPane.YES_NO_OPTION);
                if (resposta == JOptionPane.YES_OPTION) {
                    // Marca o dia como estudado
                    diaAtual.marcarEstudado();
                    JOptionPane.showMessageDialog(frame, "Ótimo! Vamos estudar.");
                    exibirCalendario(); // Atualiza a exibição do calendário
                } else {
                    JOptionPane.showMessageDialog(frame, "Estudo adiado.");
                }
            }
        });

        // Ação para o botão Voltar
        voltarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Fecha a tela de calendário e retorna à tela principal
                frame.dispose();
                telaPrincipal.setVisible(true); // Torna a tela principal visível novamente
            }
        });
    }

    public void exibir() {
        frame.setVisible(true);
    }

    private void exibirCalendario() {
        LocalDate hoje = diaAtual.getData();
        // Aqui você pode definir a lógica para mostrar os tópicos do dia.
        // Exemplo básico:
        String statusEstudo = diaAtual.isEstudado() ? "Estudado" : "Não Estudado";
        calendarioLabel.setText("Hoje: " + hoje + " - Estudo: Java (Conceitos Básicos) - Status: " + statusEstudo);
    }

    public void setVisible(boolean b) {
        frame.setVisible(b);
    }
}
