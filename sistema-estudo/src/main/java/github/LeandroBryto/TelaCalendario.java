package github.LeandroBryto;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class TelaCalendario extends JFrame {
    private List<DiaDeEstudo> diasDeEstudo;
    private JPanel calendarPanel;
    private DateTimeFormatter formatter;

    public TelaCalendario() {
        formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        diasDeEstudo = new ArrayList<>();

        // Adiciona dias de estudo predefinidos
        for (int i = 0; i < 28; i++) {
            diasDeEstudo.add(new DiaDeEstudo(LocalDate.now().plusDays(i)));
        }

        setTitle("Calendário de Estudo");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        calendarPanel = new JPanel();
        calendarPanel.setLayout(new GridLayout(7, 4)); // 7 linhas para dias da semana + 1 para o título

        // Adiciona os dias ao painel
        for (DiaDeEstudo dia : diasDeEstudo) {
            JButton diaButton = new JButton(formatter.format(dia.getData()));
            diaButton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (!dia.isEstudado()) {
                        int response = JOptionPane.showConfirmDialog(null, "Você deseja estudar no dia " + formatter.format(dia.getData()) + "?", "Confirmação", JOptionPane.YES_NO_OPTION);
                        if (response == JOptionPane.YES_OPTION) {
                            String topico = JOptionPane.showInputDialog("Qual tópico você vai estudar?");
                            String local = JOptionPane.showInputDialog("Qual o local de estudo?");
                            String horas = JOptionPane.showInputDialog("Quantas horas de estudo?");
                            try {
                                dia.setTopico(topico);
                                dia.setLocal(local);
                                dia.setHoras(Integer.parseInt(horas));
                                dia.marcarEstudado();
                                JOptionPane.showMessageDialog(null, "Estudo registrado para " + formatter.format(dia.getData()));
                            } catch (NumberFormatException ex) {
                                JOptionPane.showMessageDialog(null, "Por favor, insira um número válido para horas.");
                            }
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Você já estudou neste dia.");
                    }
                }
            });
            calendarPanel.add(diaButton);
        }

        JScrollPane scrollPane = new JScrollPane(calendarPanel);
        add(scrollPane);
    }
}
