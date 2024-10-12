package github.LeandroBryto;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaComentarios {
    private JFrame frame;
    private JTextArea comentariosArea;
    private JButton salvarButton;
    private String comentarioSalvo;

    public TelaComentarios() {
        frame = new JFrame("Comentários sobre o Estudo");
        comentariosArea = new JTextArea(10, 30);  // Área para escrever o comentário
        salvarButton = new JButton("Salvar Comentário");

        // Configurações de layout
        frame.setLayout(new BorderLayout());
        frame.add(new JLabel("Escreva seus comentários sobre o estudo:"), BorderLayout.NORTH);
        frame.add(new JScrollPane(comentariosArea), BorderLayout.CENTER); // Area com barra de rolagem
        frame.add(salvarButton, BorderLayout.SOUTH);

        // Configurações da janela
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);

        // Ação do botão "Salvar"
        salvarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                comentarioSalvo = comentariosArea.getText();  // Armazena o comentário
                JOptionPane.showMessageDialog(frame, "Comentário salvo com sucesso!");
                frame.dispose();  // Fecha a tela de comentários após salvar
            }
        });
    }

    public String getComentarioSalvo() {
        return comentarioSalvo;
    }

    public void exibir() {
        frame.setVisible(true);
    }
}
