package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Rent;

public class main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		
		Rent[] vect = new Rent[10];
		
		
		System.out.println("How many rooms will be reated?");
		int n = sc.nextInt();
		

		for (int i = 1; i <= n; i++) {
		    System.out.printf("Rent #%d: %n", i );
		    
		    System.out.printf("Name: ");
		    sc.nextLine();
		    String name = sc.nextLine();
		    
		    System.out.printf("Email: ");
		    String email = sc.next();
		    
		    System.out.printf("Room:");
            int roomNumber = sc.nextInt();
            
            Rent rent = new Rent(name, email);
            
            vect[roomNumber] = rent;
        }
		System.out.println();
		System.out.println("Busy Rooms:");
		for(int i =0; i<10; i++) {
			if(vect[i] != null ) {
				System.out.println(i + ":" + vect[i]);
			}
		}
		
		
		
		
		
		
	sc.close();	
	}
	
	
}
