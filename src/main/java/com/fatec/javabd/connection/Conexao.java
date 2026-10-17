package com.fatec.javabd.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	public static Connection getConexao() {
		Connection conexao = null;
		 String url = "jdbc:mysql://localhost:3306/bdjava";
	     String user = "root";
	     String password = "12345678";

	     try {
	    	 conexao = DriverManager.getConnection(url, user, password);
	         
	         System.out.println("Conexão estabelecida");
	         
	     } catch (SQLException e) {
	         System.err.println("FALHA AO CONECTAR");
	         System.err.println("Mensagem de erro: " + e.getMessage());
	     }
	     
	     return conexao;
	}
}
