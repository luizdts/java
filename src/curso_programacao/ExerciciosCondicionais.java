package curso_programacao;

import java.util.Scanner;

public class ExerciciosCondicionais {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/*	QUESTÃO 01
		int x = 0;
		
		System.out.println("Digite um valor: ");
		x = sc.nextInt();
		
		if(x>0) {
			System.out.println("NÃO NEGATIVO");
		} else {
			System.out.println("NEGATIVO");
		}
		*/
		
		/* QUESTÃO 02
		 
		int x = 0;
		
		System.out.println("Digite o valor do número: ");
		x = sc.nextInt();
		
		if (x%2 == 0) {
			System.out.println("PAR");
		} else {
			System.out.println("ÍMPAR");
		}
		*/
		/* QUESTÃO 03
		int x, y = 0;
		
		System.out.println("Digite o valor do número 1: ");
		x = sc.nextInt();
		System.out.println("Digite o valor do número 2: ");
		y = sc.nextInt();
		
		if (x > y) {
			if (x%y == 0) {
				System.out.println("São múltiplos");
			}
			else {
				System.out.println("Não são múltiplos");
			}
		} else {
			if (y%x == 0) {
				System.out.println("São múltiplos");
			}
			else {
				System.out.println("Não são múltiplos");
			}
		}
		*/
		
		/* QUESTÃO 05
		double conta = 0;
		double preco1, preco2 = 0;
		int escolha, escolha2 = 0;
		
		System.out.println("--------TABELA DE PREÇOS----------");
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
		
		Preguiça para terminar os outros.........
		*/
		
		sc.close();

	}

}
