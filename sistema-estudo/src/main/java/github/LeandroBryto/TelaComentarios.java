package github.LeandroBryto;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaComentarios {
    private JFrame frame;
    private JTextArea comentarioArea;
    private JButton salvarButton;
    private JButton limparButton;

    public TelaComentarios() {
        frame = new JFrame("Comentários sobre o Estudo");
        comentarioArea = new JTextArea(10, 30);
        salvarButton = new JButton("Salvar");
        limparButton = new JButton("Limpar");

        frame.setLayout(new FlowLayout());
        frame.add(new JLabel("Escreva seus comentários:"));
        frame.add(new JScrollPane(comentarioArea)); // Adiciona rolagem
        frame.add(salvarButton);
        frame.add(limparButton);

        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);

        // Ação para o botão Salvar
        salvarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                salvarComentario(comentarioArea.getText());
                JOptionPane.showMessageDialog(frame, "Comentário salvo!");
                comentarioArea.setText(""); // Limpa a área de texto após salvar
            }
        });

        // Ação para o botão Limpar
        limparButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                comentarioArea.setText(""); // Limpa a área de texto
            }
        });
    }

    private void salvarComentario(String comentario) {
        // Aqui você pode implementar a lógica para salvar o comentário em um arquivo ou banco de dados
        System.out.println("Comentário salvo: " + comentario);
    }
}
