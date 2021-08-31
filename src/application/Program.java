package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Aluno;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Aluno aluno = new Aluno();
		
		System.out.println(" Digite o nome do aluno");
		aluno.nome = sc.nextLine();
		
		System.out.println("1ª Nota");
		aluno.nota1 = sc.nextDouble();
		System.out.println("2ª Nota");
		aluno.nota2 = sc.nextDouble();
		System.out.println("3ª Nota");
		aluno.nota3 = sc.nextDouble();
		
		System.out.println();
		System.out.println(aluno.toString());
		
		//System.out.println("FINAL GRADE = "+String.format("%.2f%n", aluno.soma())+"\n "+aluno.verifica_nota());
		
		
		

	}

}
