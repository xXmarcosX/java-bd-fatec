package com.fatec.javabd;

import java.util.Scanner;

import com.fatec.javabd.model.Aluno;
import com.fatec.javabd.model.AlunoDAO;

public class Program {
	 public static void main(String[] args) {
		 	String nome;
		 	String ra;
		 	String email;
		 	String celular;
		 	Integer semestre;
		 	Scanner sc = new Scanner(System.in);
		 	
//		 	System.out.println("Digite o RA do aluno: ");
//		 	ra = sc.nextLine();
//		 	
//		 	System.out.println("Digite o nome do aluno: ");
//		 	nome = sc.nextLine();
//		 	
//		 	System.out.println("Digite o e-mail do aluno: ");
//		 	email = sc.nextLine();
//		 	
//		 	System.out.println("Digite o número de celular do aluno: ");
//		 	celular = sc.nextLine();
//		 	
//		 	System.out.println("Digite o semestre do aluno: ");
//		 	semestre = sc.nextInt();
		 	
		 
//	       	Aluno aluno = new Aluno(ra, nome, email, celular, semestre);
	       	AlunoDAO alunoDao = new AlunoDAO();
	       			
//	       	alunoDao.adicionarAluno(aluno);
	       	
	       	System.out.println("Consultando aluno por RA: ");
	       	Aluno aluno2 = alunoDao.consultaAlunoPorRA("2830482511008");
	       	
	       	System.out.println(aluno2.getRa());
	       	System.out.println(aluno2.getNome());
	       	System.out.println(aluno2.getEmail());
	       	System.out.println(aluno2.getCelular());
	       	System.out.println(aluno2.getSemestre());
	       	
	       	sc.close();
	    }
}
