package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

import model.entities.BankAccountWithExceptions;
import model.exceptions.BusinessException;

public class BankAccountExceptions {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira os dados da conta: ");
		System.out.print("Número da conta: ");
		int number = sc.nextInt();
		System.out.print("Titular da conta: ");
		String holder = sc.nextLine();
		System.out.print("Saldo da conta: ");
		double balance = sc.nextDouble();
		System.out.println("Limite de saque: ");
		double withdraw = sc.nextDouble();
		
		BankAccountWithExceptions conta = new BankAccountWithExceptions(number, holder, balance, withdraw);
		
		System.out.print("Informe a quantia que deseja sacar: ");
		double amount = sc.nextDouble();
		
		try {
			conta.withdraw(amount);
			System.out.printf("Saldo atual: %.2f%n", conta.getBalance());
		}
		catch (BusinessException e) {
			System.out.println(e.getMessage());
		}
		
		sc.close();
	}

}
