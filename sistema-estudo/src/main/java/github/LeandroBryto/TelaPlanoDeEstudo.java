package github.LeandroBryto;

import javax.swing.*;
import java.awt.*;

public class TelaPlanoDeEstudo {
    private JFrame frame;
    private JTextArea planoDeEstudoArea;

    public TelaPlanoDeEstudo() {
        frame = new JFrame("Plano de Estudo");
        planoDeEstudoArea = new JTextArea(20, 40);
        planoDeEstudoArea.setEditable(false);

        // Plano de Estudo definido
        String planoDeEstudo = """
                Semana 1 a 4: Java (28 dias)
                Dia 1 a 7: Conceitos básicos (variáveis, loops, condições, métodos)
                Estudo diário: 1-2 horas
                Tópicos: Sintaxe, operadores, estruturas de controle, métodos e arrays.
                Prática: Faça pequenos projetos (calculadora, conversor de temperatura, etc.)

                Dia 8 a 14: Programação Orientada a Objetos (POO)
                Estudo diário: 1-2 horas
                Tópicos: Classes, objetos, herança, encapsulamento, polimorfismo.
                Prática: Projetos como gerenciamento de biblioteca, cadastro de usuários.

                Dia 15 a 21: Exceções, Coleções, e Java Lambdas
                Estudo diário: 1-2 horas
                Tópicos: Try-catch, listas, mapas, sets, lambdas.
                Prática: Faça exercícios de manipulação de coleções e tratamento de exceções.

                Dia 22 a 28: Projeto Final de Java
                Crie um pequeno projeto que englobe todos os conceitos vistos (POO, coleções, exceções, etc.).

                Semana 5 a 6: Git (14 dias)
                Dia 29 a 35: Comandos básicos e workflow
                Estudo diário: 1-2 horas
                Tópicos: git init, add, commit, push, pull.
                Prática: Crie um repositório no GitHub, inicie um projeto, faça commits e versione seu código Java.

                Dia 36 a 42: Branching, merging e boas práticas
                Estudo diário: 1-2 horas
                Tópicos: Branches, merge, resolver conflitos, rebase.
                Prática: Crie branches para diferentes funcionalidades no seu projeto e pratique merges.

                Semana 7 a 8: Spring Framework (14 dias)
                Dia 43 a 49: Spring Boot e MVC
                Estudo diário: 1-2 horas
                Tópicos: Criar API REST com Spring Boot, endpoints, controllers, services.
                Prática: Desenvolva uma API simples para gerenciamento de usuários.

                Dia 50 a 56: Spring Data e Spring Security
                Estudo diário: 1-2 horas
                Tópicos: Integração com banco de dados, autenticação e autorização.
                Prática: Implemente um sistema de login e CRUD completo em um banco de dados.

                Semana 9: Docker (7 dias)
                Dia 57 a 63: Conceitos e criação de containers
                Estudo diário: 1-2 horas
                """;

        planoDeEstudoArea.setText(planoDeEstudo);

        // Layout da janela
        frame.setLayout(new BorderLayout());
        frame.add(new JLabel("Plano de Estudo:"), BorderLayout.NORTH);
        frame.add(new JScrollPane(planoDeEstudoArea), BorderLayout.CENTER);

        // Configurações da janela
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    public void exibir() {
        frame.setVisible(true);
    }
}
