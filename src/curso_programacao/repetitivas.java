package curso_programacao;

import java.util.Scanner;

public class repetitivas {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a quantidade de valores: ");
		int n = sc.nextInt();
		int soma = 0;
		for (int i = 0; i<n ; i++) {
			int x = 0;
			
			System.out.println("Digite um valor: ");
			
			x = sc.nextInt();
			
			soma = soma + x;
			System.out.println("Acumulado: " + soma);
		}
		
		System.out.println("O valor final da soma é: " + soma);
		sc.close();
	}

}
