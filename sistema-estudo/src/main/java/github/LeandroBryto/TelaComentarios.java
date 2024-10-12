package github.LeandroBryto;

import javax.swing.*;

public class TelaComentarios extends JFrame {
    private JTextArea comentariosArea;
    private JButton salvarButton;

    public TelaComentarios() {
        setTitle("Comentários do Estudo");
        setSize(400, 300);
        setLocationRelativeTo(null);

        comentariosArea = new JTextArea(10, 30);
        salvarButton = new JButton("Salvar Comentário");

        salvarButton.addActionListener(e -> {
            // Lógica para salvar os comentários
            JOptionPane.showMessageDialog(null, "Comentário salvo com sucesso!");
        });

        JPanel panel = new JPanel();
        panel.add(new JScrollPane(comentariosArea));
        panel.add(salvarButton);

        add(panel);
    }
}

