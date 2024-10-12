package github.LeandroBryto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/sistema_estudo"; // URL do banco de dados
    private static final String USER = "root"; // Usuário do MySQL
    private static final String PASSWORD = "root"; // senha do MySQL

    public static Connection getConnection() {
        Connection connection = null;
        try {
            // Conectar ao banco de dados
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Conexão estabelecida com sucesso!");
        } catch (SQLException e) {
            System.err.println("Erro ao conectar ao banco de dados: " + e.getMessage());
        }
        return connection;
    }
}
