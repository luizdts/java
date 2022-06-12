package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class exemplo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		System.out.println("Defina a quantidade:");
		int n = sc.nextInt();
		
		double[] vect = new double[n];
		
		for(int i=0; i<n; i++) {
			System.out.println("Digite o valor da altura: ");
			vect[i] = sc.nextDouble();
		}
		
		double sum = 0;
		
		for(int i=0; i<n; i++) {
			sum += vect[i];
		}
		double avg = sum / n;
		System.out.println("AVERAGE HEIGHT: " + avg);
		
		
		sc.close();
	}

}
