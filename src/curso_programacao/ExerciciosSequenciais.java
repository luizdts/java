package curso_programacao;

import java.util.Scanner;

public class ExerciciosSequenciais {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		/* QUEST�O 1						
		int x = 0;
		int y = 0;
		int soma = 0;
		
		System.out.print("Digite o primeiro valor: ");
		x = sc.nextInt();
		System.out.println("Digite o segundo valor: ");
		y = sc.nextInt();
		
		soma = x + y;
		
		System.out.print("A soma �: " + soma);
		*/
		
		/* QUEST�O 2
		float raio = 0;
		double area = 0;
		
		System.out.println("Digite o valor do raio: ");
		raio = sc.nextFloat();	
		
		area = Math.PI * Math.pow(raio, 2);
		System.out.printf("A �rea �: %.2f", area);
		*/
		
		/* QUEST�O 03
		
		int A, B, C, D = 0;
		float DIFERENCA = 0;
		
		System.out.println("Digite o valor para A: ");
		A = sc.nextInt();
		System.out.println("Digite o valor para B: ");
		B = sc.nextInt();
		System.out.println("Digite o valor para C: ");
		C = sc.nextInt();
		System.out.println("Digite o valor para D: ");
		D = sc.nextInt();
		
		DIFERENCA = (A * B - C * D);
		
		System.out.println("O resultado da diferen�a A*B - C*D �: " + DIFERENCA);
		*/
		
		/* QUEST�O 04
		int numero, valorHora = 0;
		float salario, horas = 0;
		
		System.out.println("Digite o n�mero do funcion�rio: ");
		numero = sc.nextInt();
		System.out.println("Digite o valor do sal�rio: ");
		valorHora = sc.nextInt();
		System.out.println("Digite as horas trabalhadas: ");
		horas = sc.nextFloat();
		
		salario = valorHora * horas;
		
		System.out.println(numero);
		System.out.printf("R$: %.2f", salario);
		*/
		
		/* QUEST�O 05
		int pecas1, pecas2 = 0;
		float valor1, valor2, valorFinal = 0;
		
		System.out.println("Digite o n�mero de pe�as: ");
		pecas1 = sc.nextInt();
		System.out.println("Digite o valor da pe�a: ");
		valor1 = sc.nextFloat();
		System.out.println("Digite o n�mero de pe�as: ");
		pecas2 = sc.nextInt();
		System.out.println("Digite o valor da pe�a: ");
		valor2 = sc.nextFloat();
		
		valorFinal = (pecas1 * valor1) + (pecas2 * valor2);
		
		System.out.println("O valor �: " + valorFinal);
		*/
		
		/* QUEST�O 06
		double quadrado, circulo, triangulo, trapezio, retangulo = 0;
		float a, b, c = 0;
				
		System.out.println("Digite o valor de A: ");
		a = sc.nextFloat();
		System.out.println("Digite o valor de B: ");
		b = sc.nextFloat();
		System.out.println("Digite o valor de C: ");
		c = sc.nextFloat();
		
		quadrado = Math.pow(a, 2);
		triangulo = (a*b)/2;
		circulo = Math.PI * Math.pow(c, 2);
		trapezio = ((a+b) * c)/2;
		retangulo = a * b;
		
		System.out.printf("QUADRADO: %.3f\n", quadrado);
		System.out.printf("TRIANGULO: %.3f\n", triangulo);
		System.out.printf("CIRCULO: %.3f\n", circulo);
		System.out.printf("RETANGULO: %.3f\n", retangulo);
		System.out.printf("TRAP�ZIO: %.3f\n", trapezio);
		*/
		
		sc.close();
	}

}
