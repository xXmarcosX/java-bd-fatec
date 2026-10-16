package com.fatec.javabd.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	public static Connection getConexao() {
		Connection conexao = null;
		 String url = "jdbc:mysql://localhost:3306/javabd";
	     String user = "root";
	     String password = "root";

	     try {
	    	 conexao = DriverManager.getConnection(url, user, password);
	         
	         if (conexao != null) {
	             System.out.println("🎉 SUCESSO! O MySQL Connector/J está funcionando e conectado!");
	             conexao.close();
	         }
	         
	     } catch (SQLException e) {
	         System.err.println("❌ FALHA AO CONECTAR!");
	         System.err.println("Mensagem de erro: " + e.getMessage());
	         e.printStackTrace();
	     }
	     
	     return conexao;
	}
}
