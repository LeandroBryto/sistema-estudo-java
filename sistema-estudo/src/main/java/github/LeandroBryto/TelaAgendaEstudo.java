package github.LeandroBryto;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaAgendaEstudo {
    private JFrame frame;
    private String nomeUsuario;

    public TelaAgendaEstudo(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;

        frame = new JFrame("Agenda de Estudo");

        // Definindo layout e botões da tela principal
        JButton calendarioButton = new JButton("Calendário");
        JButton comentariosButton = new JButton("Comentários");
        JButton relatorioButton = new JButton("Relatório");
        JButton planoDeEstudoButton = new JButton("Plano de Estudo");

        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
        frame.add(new JLabel("Bem-vindo, " + nomeUsuario + "!"));
        frame.add(calendarioButton);
        frame.add(comentariosButton);
        frame.add(relatorioButton);
        frame.add(planoDeEstudoButton);

        // Configurações da janela
        frame.setSize(300, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        // Ação para o botão Calendário
        calendarioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false); // Oculta a tela principal
                TelaCalendario telaCalendario = new TelaCalendario(new HistoricoDeEstudo());
                telaCalendario.exibir();
            }
        });

        // Ação para o botão Comentários
        comentariosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TelaComentarios telaComentarios = new TelaComentarios(); // Cria nova tela de comentários
                telaComentarios.exibir(); // Exibe a tela de comentários
            }
        });

        // Ação para o botão Relatório
        relatorioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TelaRelatorio telaRelatorio = new TelaRelatorio(new HistoricoDeEstudo());
                telaRelatorio.exibir();
            }
        });

        // Ação para o botão Plano de Estudo
        planoDeEstudoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                TelaPlanoDeEstudo telaPlanoDeEstudo = new TelaPlanoDeEstudo();
                telaPlanoDeEstudo.exibir();
            }
        });
    }

    public void setVisible(boolean b) {
        frame.setVisible(b);
    }
}
