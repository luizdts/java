package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

import entities.Rent;

public class FixacaoVetores {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		Rent[] vect = new Rent[10];


		for(int i=0;i<1;i++) {
		
			System.out.println("Digite o nome: ");
			String name = sc.nextLine();
			System.out.println("Digite o e-mail: ");
			String email = sc.nextLine();
			System.out.println("Room: ");
			int room = sc.nextInt();
			vect[room] = new Rent(name,email);
			

		}
		System.out.println("Busy rooms: ");
		for(int i=0;i<10;i++) {
			if(vect[i] != null) {
				System.out.println(i + " :" + vect[i]);
			}
			
		}
		sc.close();
	}

}
