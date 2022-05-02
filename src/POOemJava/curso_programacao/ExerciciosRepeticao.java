package curso_programacao;

import java.util.Scanner;

public class ExerciciosRepeticao {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		/* Questão 01	
		int senha = 2002;
		int senhaCorreta = 0;
		System.out.println("Digite a senha: ");
		senhaCorreta = sc.nextInt();
		
		while (senhaCorreta != senha) {
			
			System.out.println("Digite a senha: ");
			senhaCorreta = sc.nextInt();
			if(senhaCorreta != senha) {
				System.out.println("Senha incorreta.");
			}
			
		}
		
	
		System.out.println("Acesso permitido.");
		*/
		/* Questao 2
		int coordenada1 = 1, coordenada2 = 1;
		
		while(coordenada1 != 0 || coordenada2 != 0) {
			
			System.out.println("Digite a primeira coordenada: ");
			coordenada1 = sc.nextInt();
			System.out.println("Digite a segunda coordenada: ");
			coordenada2 = sc.nextInt();
			if(coordenada1 <= 3 && coordenada2 <= 3) {
				System.out.println("Primeiro quadrante");
			} else if (coordenada1 > 3 && coordenada1 <= 6 && coordenada2 > 3 && coordenada2 <= 6) {
				System.out.println("Segundo quadrante");
			} else if(coordenada1 > 6 && coordenada1 <= 9 && coordenada2 > 6 && coordenada2 <= 9) {
				System.out.println("Terceiro quadrante");
			} else if(coordenada1 > 9 && coordenada1 <= 12 && coordenada2 > 9 && coordenada2 <= 12) {
				System.out.println("Quarto quadrante");
			}
			if(coordenada1 != 0) {
				coordenada1 = 1;
				coordenada2 = 1;
			}
		
		}
		*/
		
		/* QUESTÃO 3
		int contAlcool = 0 , contGasolina = 0, contDiesel = 0;
		int escolha = 0;
		
		while (escolha != 4) {
			System.out.println("Digite um numero de combustivel: ");
			escolha = sc.nextInt();
			
			if(escolha == 1) {
				contAlcool++;
			} else if (escolha == 2) {
				contGasolina++;
			} else if(escolha == 3) {
				contDiesel++;
			} 
		}
		System.out.println("Alcool: " + contAlcool);
		System.out.println("Gasolina: " + contGasolina);
		System.out.println("Diesel: " + contDiesel);
		*/
		
		// LISTA FOR
		
		/* QUESTÃO 01
		int num = 0;
		
		System.out.println("Digite um número: ");
		num = sc.nextInt();
		
		
		for(int i=0; i<=num; i++) {
			if(i % 2 == 1) {
				System.out.println(i);
			}
		}
		*/
		
		/* QUESTÃO 02
		int tam = 0;
		int num = 0;
		int contIn = 0;
		int contOut = 0;
		
		System.out.println("Digite a quantidade de numeros: ");
		tam = sc.nextInt();
		
		for(int i=0;i<tam;i++) {
			System.out.println("Digite um número: ");
			num = sc.nextInt();
			
			if(num >= 10 && num <= 20) {
				contIn++;
			} else {
				contOut++;
			}
			
		}
		System.out.println("In: " + contIn);
		System.out.println("Out: " + contOut);
		
		*/
		/*	QUESTÃO 03
		 		double nota1 = 0, nota2 = 0, nota3 = 0;
		double media = 0;
		int tam = 0;
		
		System.out.println("Digite a quantidade de notas: ");
		tam = sc.nextInt();
		
		for(int i=0; i<tam; i++) {
			System.out.println("Digite a primeira nota: ");
			nota1 = sc.nextDouble();
			System.out.println("Digite a segunda nota: ");
			nota2 = sc.nextDouble();
			System.out.println("Digite a terceira nota: ");
			nota3 = sc.nextDouble();
			
			media = (nota1*2 + nota2*3 + nota3*5)/10;
			System.out.println("A média é: " + media);
		}
		 */
		/* QUESTÃO 07
		int tam = 0;
		
		System.out.println("Digite a quantidade: ");
		tam = sc.nextInt();
		
		for(int i=1;i<=tam;i++) {
			System.out.print(i);
			System.out.print(" " + Math.pow(i, 2));
			System.out.print(" " + Math.pow(i, 3));
			System.out.println(" ");
		}
		*/
		
		sc.close();
	}

}
