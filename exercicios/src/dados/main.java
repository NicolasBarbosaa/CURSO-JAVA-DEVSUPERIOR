package dados;

import java.util.Locale;
import java.util.Scanner;

import util.program;

public class main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		program program;


		System.out.print("Enter account number: ");
		String number = sc.next();

		System.out.print("Enter account holder: ");
		String holder = sc.next();
		
		System.out.print("Is there na initial deposit (y/n)");
		char response = sc.next().charAt(0);
		
		if (response == 'y') {
			System.out.println("Digite o valor de déposito: ");
			double initialDeposit = sc.nextDouble();
			program = new program(holder, response, initialDeposit);
			
		}else {
			program = new program(holder, response);
		}

		System.out.println();
		System.out.println("Account data:");
		System.out.println(program);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		program.deposit(depositValue);
		System.out.println("Updated account data:");
		System.out.println(program);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		program.withdraw(withdrawValue);
		System.out.println("Updated account data:");
		System.out.println(program);
		
		sc.close();
	}

}
