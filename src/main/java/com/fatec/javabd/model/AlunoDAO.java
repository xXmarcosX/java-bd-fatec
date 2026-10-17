package com.fatec.javabd.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.fatec.javabd.connection.Conexao;
import javax.swing.JOptionPane;

public class AlunoDAO {
	String sql;
	Connection con;
	PreparedStatement pstmt;
	
	public void adicionarAluno(Aluno aluno) {
		try {
			this.sql = "INSERT INTO aluno(alu_ra, alu_nome, alu_email, alu_celular, alu_semestre) VALUES(?, ?, ?, ?, ?)";
			this.con = Conexao.getConexao();
			this.pstmt = this.con.prepareStatement(this.sql);
			
			pstmt.setString(1, aluno.getRa());
			pstmt.setString(2, aluno.getNome());
			pstmt.setString(3, aluno.getEmail());
			pstmt.setString(4, aluno.getCelular());
			pstmt.setInt(5, aluno.getSemestre());
			
			pstmt.executeUpdate();
			
			System.out.print("Aluno inserido com sucesso!");
			
			con.close();
			
		} catch(SQLException e) {
			System.out.println("Erro: " + e);
                        JOptionPane.showMessageDialog(null, "Erro ao cadastrar aluno");
		}
	}
	
	public Aluno consultaAlunoPorRA(String ra) {
		ResultSet rs;
		Aluno aluno = new Aluno();
		con = null;
		
		sql = "SELECT alu_ra, alu_nome, alu_email, alu_celular, alu_semestre"
				+ " FROM aluno"
				+ " WHERE alu_ra = ? ";
		
		try {
			this.con = Conexao.getConexao();
			this.pstmt = this.con.prepareStatement(this.sql);
			
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, ra);
			
			rs = pstmt.executeQuery();
			
			if (rs.next()) {
				aluno.setRa(rs.getString("alu_ra"));
				aluno.setNome(rs.getString("alu_nome"));
				aluno.setEmail(rs.getString("alu_email"));
				aluno.setCelular(rs.getString("alu_celular"));
				aluno.setSemestre(rs.getInt("alu_semestre"));
				
				return aluno;
			}
			
			return null;
		} catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		
		return aluno;
	}

}
