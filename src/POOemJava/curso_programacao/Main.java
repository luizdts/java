package curso_programacao;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String x;
		
		x = sc.next(); // Entrada de dados
		System.out.println("Voce digitou: " + x);
		
		int y;
		
		y = sc.nextInt();
		System.out.println("Voce digitou o valor: " + y);
		
		double z;
		
		z = sc.nextDouble();
		System.out.println("Voce digitou: " + z);
		
		char w;
		w = sc.next().charAt(0);
		System.out.println("Voce digitou: " + w);
		
		String s1, s2, s3;
		sc.nextLine();
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		
		// Operações matematicas 
		
		int alpha = 2;
		int omega = 3;
		
		
		System.out.println(Math.pow(omega, alpha));
		System.out.println(Math.sqrt(alpha));
		System.out.println(Math.abs(omega));
		
		sc.close();
	}

}
