package curso_programacao;

import java.util.Scanner;

import entities.CurrencyConverter;

public class RealtoDollar {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		CurrencyConverter conv = new CurrencyConverter();
	
		conv.dollar = 4.50;
		System.out.println("Digite a quantidade de dólares que deseja: ");
		conv.value = sc.nextDouble();
		
		System.out.printf("O valor para ser pago em reais é: R$%.2f%n",
				conv.converter());
	
		sc.close();
	}
}
