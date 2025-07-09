package Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    
    public Connection conector;

    public void conectar(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/evento";
            String usuario = "root";
            String senha = "novaSenhaForte123!";
            conector = DriverManager.getConnection(url, usuario, senha);
        } catch (ClassNotFoundException e){
            System.out.println("Erro no Driver: " + e.getMessage());
        } catch (SQLException e){
            System.out.println("Erro na conexão com o banco! " + e.getMessage());
        }
    }

    public void desconectar(){
        try {
            conector.close();
        }catch (SQLException e){
            System.out.println("Erro na conexão com banco! " + e.getMessage());
        }
    }
}
