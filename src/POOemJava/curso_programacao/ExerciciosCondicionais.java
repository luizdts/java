package curso_programacao;

import java.util.Scanner;

public class ExerciciosCondicionais {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/*	QUEST�O 01
		int x = 0;
		
		System.out.println("Digite um valor: ");
		x = sc.nextInt();
		
		if(x>0) {
			System.out.println("N�O NEGATIVO");
		} else {
			System.out.println("NEGATIVO");
		}
		*/
		
		/* QUEST�O 02
		 
		int x = 0;
		
		System.out.println("Digite o valor do n�mero: ");
		x = sc.nextInt();
		
		if (x%2 == 0) {
			System.out.println("PAR");
		} else {
			System.out.println("�MPAR");
		}
		*/
		/* QUEST�O 03
		int x, y = 0;
		
		System.out.println("Digite o valor do n�mero 1: ");
		x = sc.nextInt();
		System.out.println("Digite o valor do n�mero 2: ");
		y = sc.nextInt();
		
		if (x > y) {
			if (x%y == 0) {
				System.out.println("S�o m�ltiplos");
			}
			else {
				System.out.println("N�o s�o m�ltiplos");
			}
		} else {
			if (y%x == 0) {
				System.out.println("S�o m�ltiplos");
			}
			else {
				System.out.println("N�o s�o m�ltiplos");
			}
		}
		*/
		
		/* QUEST�O 05
		double conta = 0;
		double preco1, preco2 = 0;
		int escolha, escolha2 = 0;
		
		System.out.println("--------TABELA DE PRE�OS----------");
		System.out.println("1 - Cachorro quente - R$ 4,00");
		System.out.println("2 - X-Salada - R$ 4,50");
		System.out.println("3 - X-Bacon - R$ 5,00");
		System.out.println("4 - Torrada - R$ 2,50");
		System.out.println("5 - Suco - R$ 1,00");
		System.out.println("----------------------------------");
		
		System.out.println("Escolha o primeiro lanche: ");
		escolha = sc.nextInt();
		System.out.println("Escolha o segundo lanche: ");
		escolha2 = sc.nextInt();
		
		if(escolha == 1 && escolha2 == 5) {
			preco1 = 4;
			preco2 = 1;
			conta = preco1 + preco2;
			System.out.println("Valor a ser pago: R$ " + conta);
		}
		else if (escolha == 2 && escolha2 == 5) {
			preco1 = 4.50;
			preco2 = 1;
			conta = preco1 + preco2;
			System.out.println("Valor a ser pago: R$ " + conta);
		}
		else if (escolha == 3 && escolha2 == 5) {
			preco1 = 5;
			preco2 = 1;
			conta = preco1 + preco2;
			System.out.println("Valor a ser pago: R$ " + conta);
		}
		else if (escolha == 4 && escolha2 == 5) {
			preco1 = 2;
			preco2 = 1;
			conta = preco1 + preco2;
			System.out.println("Valor a ser pago: R$ " + conta);
		}
		
		Pregui�a para terminar os outros.........
		*/
		
		sc.close();

	}

}
