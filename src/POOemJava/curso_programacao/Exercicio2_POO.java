package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Employee;

public class Exercicio2_POO {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		Employee emp = new Employee();
		
		System.out.println("Digite o nome: ");
		emp.name = sc.nextLine();
		System.out.println("Digite o salario: ");
		emp.grossSalary = sc.nextDouble();
		System.out.println("Digite a taxa: ");
		emp.tax = sc.nextDouble();
		
		System.out.println("Colaborador: " + emp);
		System.out.println("Digite o valor da porcentagem: ");
		double percentage = sc.nextDouble();
		emp.increaseSalary(percentage);
		
		System.out.println();
		System.out.println("Dados: " + emp);
		
		
		sc.close();
	}

}
