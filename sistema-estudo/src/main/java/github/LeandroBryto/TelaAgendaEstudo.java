package github.LeandroBryto;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaAgendaEstudo extends JFrame {
    private String nomeUsuario;

    public TelaAgendaEstudo(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
        setTitle("Agenda de Estudo - " + nomeUsuario);
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 1));

        JButton calendarioButton = new JButton("Calendário");
        JButton comentariosButton = new JButton("Comentários (não implementado)");
        JButton relatorioButton = new JButton("Relatório");
        JButton sairButton = new JButton("Sair");

        calendarioButton.addActionListener(e -> {
            TelaCalendario telaCalendario = new TelaCalendario();
            telaCalendario.setVisible(true);
            dispose(); // Fecha a tela de agenda
        });

        relatorioButton.addActionListener(e -> {
            TelaRelatorio telaRelatorio = new TelaRelatorio();
            telaRelatorio.gerarRelatorio();
        });

        sairButton.addActionListener(e -> {
            System.exit(0);
        });

        panel.add(calendarioButton);
        panel.add(comentariosButton);
        panel.add(relatorioButton);
        panel.add(sairButton);
        add(panel);
    }
}
