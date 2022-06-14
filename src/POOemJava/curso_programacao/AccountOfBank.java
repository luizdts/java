package curso_programacao;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

import java.util.ArrayList;
import java.util.List;

public class AccountOfBank {
    public static void main(String[] args){

        // Account acc = new Account(1001, "Rosemary", 0.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Carl", 0.0, 1000.0);

//        // UPCASTING

        Account acc1 = bacc;
        acc1.getBalance();
        Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 500.0);
        Account acc3 = new SavingsAccount(1004, "Joel", 0.0, 0.05);

        // DOWNCASTING

        BusinessAccount acc4 = (BusinessAccount) acc2;
        acc4.loan(100.0);

        //BusinessAccount acc5 = (BusinessAccount) acc3;
        if(acc3 instanceof BusinessAccount){
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(100.0);
            System.out.println("Loan!");
        }
        if(acc3 instanceof SavingsAccount){
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("Updated!");
        }
        Account acc6 = new Account(1001, "Alex", 1000.0);
        acc1.withdraw(500.0);
        System.out.println(acc6.getBalance());

        Account acc7 = new SavingsAccount(1002, "Maria", 2500.0, 0.01);
        acc2.withdraw(500.0);
        System.out.println(acc7.getBalance());

        Account acc8 = new BusinessAccount(1003, "Bob", 2000.0, 500.0);
        acc3.withdraw(200);
        System.out.println(acc8.getBalance());

    	List<Account> list = new ArrayList<>();

        list.add(new SavingsAccount(1002, "Maria", 2500.0, 0.01));
        list.add(new BusinessAccount(1003, "Bob", 2000.0, 500.0));
        list.add(new SavingsAccount(1004, "Ana", 500.0, 0.1));
        list.add(new BusinessAccount(1005, "George", 2000.0, 500.0));

        double sum = 0.0;
        for(Account acc : list){
            sum += acc.getBalance();
        }

        System.out.printf("Total balance: %.2f%n", sum);

        for(Account acc : list){
            acc.deposit(10.0);
        }

        for(Account acc : list){
    		System.out.printf("Updated balance for account %d: %.2f%n", acc.getNumber(), acc.getBalance());
        }
    }

}
