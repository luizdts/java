package curso_programacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.EmployeeList;

public class ExercicioLista {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<EmployeeList> list = new ArrayList<>();
		
		System.out.println("Quantos funcionários devem ser cadastrados: ");
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			
			System.out.println();

			System.out.println("Id: ");
			
			int id = sc.nextInt();
			while (hasId(list,id)) {
				System.out.println("Id já existente, digite outro: ");
				id = sc.nextInt();
			}
			
			System.out.println("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Salário: ");
			double salary = sc.nextDouble();
			
			list.add(new EmployeeList(id, name, salary));
		}
		
		System.out.println("Digite qual empregado deve ganhar um aumento: ");
		int id = sc.nextInt();
		EmployeeList emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		
		if (emp == null) {
			System.out.println("Este funcionário não existe!");
		} else {
			System.out.println("Digite a porcentagem de aumento: ");
			double percentage = sc.nextDouble();
			
			emp.increaseSalary(percentage);
			
		}
		
		System.out.println();
		System.out.println("Lista de empregados: ");
		for (EmployeeList obj: list) {
			System.out.println(obj);
		}
		
		sc.close();
	}

	private static boolean hasId(List<EmployeeList> list, int id) {
		
		EmployeeList emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		
		return emp != null;
	}

}
