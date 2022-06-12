package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Exemplo2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Product[] vect = new Product[n];
		
		for(int i=0;i<vect.length;i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			
			vect[i] = new Product(name, price);
		}
		
		double sum = 0;
		for(int i=0;i<n;i++) {
			sum += vect[i].getPrice();
		}
		
		double avg = sum/vect.length;
		
		System.out.println("AVG: " + avg);
		
		
		sc.close();
	}

}
