package github.LeandroBryto;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaPrincipal extends JFrame {
    private JTextField nomeField;
    private JButton iniciarButton;

    public TelaPrincipal() {
        // Definir título da janela
        setTitle("Sistema de Estudo");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Definir o layout para centralizar os componentes
        setLayout(new BorderLayout());

        // Criar campo de texto e botão
        nomeField = new JTextField(10); // Largura do campo de texto
        iniciarButton = new JButton("Iniciar");

        // Criar um painel para centralizar os componentes
        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        // Configurar as restrições do GridBagConstraints
        gbc.gridx = 0; // Coluna
        gbc.gridy = 0; // Linha
        gbc.insets = new Insets(10, 10, 10, 10); // Margens
        gbc.anchor = GridBagConstraints.CENTER; // Centraliza os componentes

        // Adicionar componentes ao painel
        panel.add(new JLabel("Digite seu nome:"), gbc);

        gbc.gridy = 1; // Mover para a próxima linha
        panel.add(nomeField, gbc);

        gbc.gridy = 2; // Mover para a próxima linha
        panel.add(iniciarButton, gbc);

        // Adicionar o painel ao centro da janela
        add(panel, BorderLayout.CENTER);

        // Ação para o botão "Iniciar"
        iniciarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nomeUsuario = nomeField.getText();
                if (!nomeUsuario.isEmpty()) {
                    // Abrir a tela de agenda de estudo passando o nome do usuário
                    TelaAgendaEstudo telaAgendaEstudo = new TelaAgendaEstudo(nomeUsuario);
                    telaAgendaEstudo.setVisible(true);
                    setVisible(false);  // Oculta a tela principal
                } else {
                    JOptionPane.showMessageDialog(null, "Por favor, insira seu nome.");
                }
            }
        });
    }

    public static void main(String[] args) {
        // Executar a tela principal
        SwingUtilities.invokeLater(() -> {
            TelaPrincipal telaPrincipal = new TelaPrincipal();
            telaPrincipal.setVisible(true);
        });
    }
}
