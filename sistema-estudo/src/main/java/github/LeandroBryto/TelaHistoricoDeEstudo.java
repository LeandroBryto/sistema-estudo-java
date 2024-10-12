package github.LeandroBryto;

import javax.swing.*;
import java.awt.*;

public class TelaHistoricoDeEstudo {
    private JFrame frame;
    private HistoricoDeEstudo historico;

    public TelaHistoricoDeEstudo(HistoricoDeEstudo historico) {
        this.historico = historico;
        frame = new JFrame("Histórico de Estudo");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        JTextArea areaTexto = new JTextArea();
        areaTexto.setEditable(false);
        areaTexto.setText(historico.gerarRelatorio());

        JScrollPane scrollPane = new JScrollPane(areaTexto);
        frame.add(scrollPane, BorderLayout.CENTER);

        JButton voltarButton = new JButton("Voltar");
        voltarButton.addActionListener(e -> {
            frame.setVisible(false); // Esconde a tela de histórico
        });
        frame.add(voltarButton, BorderLayout.SOUTH);

        frame.setVisible(true);
    }

    public void setVisible(boolean visible) {
        frame.setVisible(visible);
    }
}
