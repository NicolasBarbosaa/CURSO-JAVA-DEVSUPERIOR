package application;

import entites.Account;
import entites.BusinessAccount;
import entites.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		
		Account acc = new Account();
		BusinessAccount bacc = new BusinessAccount();
		SavingsAccount sa = new SavingsAccount();
		
		
		//UPCASTING(casting da subclass para a superclass)
		//por causa da relação "é-um" da herança, uma conta empresarial tbm é uma conta
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
		Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);
		
		
		//DOWNCASTING(casting da superclass para a subclass)
		BusinessAccount acc4 = (BusinessAccount)acc2;
		acc4.loan(100.0);
		
		// BusinessAccount acc5 = (BusinessAccount)acc3;
		//senteça sai como false pq o "instanceof" confere que "acc3" não é do tipo BusinessAccount e sim SavingAccount
		if (acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
		}
		
		if (acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}
		
		
		
			Account acc6 = new Account(1001, "bob", 1000.00);
			acc6.withDraw(200.0);
			System.out.println("saque pela conta (com desconto): "+ acc6.getBalance());
			
			Account acc7 = new SavingsAccount(1001, "maria", 1000.00,0.01 );
			acc7.withDraw(200.0);
			System.out.println("saque pela conta poupança(sem desconto): "+acc7.getBalance());
			
			Account acc8 = new BusinessAccount(1002, "Antonio", 1000.00, 500.0);
			acc8.withDraw(200);
			System.out.println("Saque pela conta empresarial(com desconto de 2.0 pela conta empresarial + 5 da Account): " + acc8.getBalance());
	}
}
