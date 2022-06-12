package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class FixacaoMatriz {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Defina o tamanho de M: ");
		int m = sc.nextInt();
		System.out.println("Defina o tamanho de N: ");
		int n = sc.nextInt();
		
		int[][] mat = new int[m][n];
		
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++) {
				System.out.print("Digite o valor: ");
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Digite o valor de x: ");
		int x = sc.nextInt();
		
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat.length;j++) {
				if(mat[i][j] == x) {
					System.out.println("Posicao: " + i + ", " + j);
					if(j>0) {
						System.out.println("Left " + mat[i][j-1]);
					}
					if(i>0) {
						System.out.println("Up " + mat[i-1][j]);
					}
					if (j<mat.length-1) {
						System.out.println("Right" + mat[i][j+1]);
					}
					if(i<mat.length-1) {
						System.out.println("Down " + mat[i+1][j]);
					}
				}
			}
		}
				
		
		
		sc.close();
	}

}
