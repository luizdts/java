package curso_programacao;

import java.util.Scanner;

import entities.Rectangle;

public class Exercicio1_POO {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Rectangle rectangle = new Rectangle();
		
		System.out.println("Digite o valor da base: ");
		rectangle.width = sc.nextDouble();
		System.out.println("Digite o valor da altura: ");
		rectangle.height = sc.nextDouble();
		
		System.out.println("Area: " + rectangle.area() + "m");
		System.out.println("Perimetro: " + rectangle.perimeter() + "m");
		System.out.printf("Diagonal: %.2fm%n", rectangle.diagonal());
		
		sc.close();
	}

}
