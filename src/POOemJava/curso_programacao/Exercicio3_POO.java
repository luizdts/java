package curso_programacao;

import java.util.Scanner;

import entities.Student;

public class Exercicio3_POO {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		Student aluno = new Student();
		
		System.out.println("Digite a primeira nota do aluno: ");
		aluno.nota1 = sc.nextDouble();
		System.out.println("Digite a segunda nota do aluno: ");
		aluno.nota2 = sc.nextDouble();
		System.out.println("Digite a terceira nota do aluno: ");
		aluno.nota3 = sc.nextDouble();
		
		System.out.printf("Média final: %.2f%n", aluno.mediaFinal()/3);
		sc.close();
		
		if(aluno.mediaFinal()/3 < 60.0) {
			System.out.println("Reprovado");
			System.out.printf("Pontos necessários: %.2f%n", aluno.notaAprovacao());
		} else {
			System.out.println("Aprovado");
		}
	}

}
