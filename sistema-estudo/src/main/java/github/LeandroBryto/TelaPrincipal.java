package github.LeandroBryto;

import javax.swing.*;
import java.awt.*;

public class TelaPrincipal extends JFrame {
    private JTextField nomeField;

    public TelaPrincipal() {
        setTitle("Sistema de Estudo");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 1));

        JLabel nomeLabel = new JLabel("Digite seu nome:");
        nomeField = new JTextField();
        JButton entrarButton = new JButton("Entrar");

        entrarButton.addActionListener(e -> {
            String nome = nomeField.getText();
            TelaAgendaEstudo telaAgenda = new TelaAgendaEstudo(nome);
            telaAgenda.setVisible(true);
            dispose(); // Fecha a tela principal
        });

        panel.add(nomeLabel);
        panel.add(nomeField);
        panel.add(entrarButton);
        add(panel);
    }
}
