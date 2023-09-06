package account;

import java.util.Locale;
import java.util.Scanner;
import init.count;

public class program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        count count;
	
        System.out.printf("Enter account number:");
        int number = sc.nextInt();
        System.out.printf("Enter account holder:");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.printf("Is there na initial deposit (y/n)?");
        
        char response = sc.next().charAt(0);
		if (response == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			count = new count(number, holder, initialDeposit);
		}
		else {
			count = new count(number, holder);
		}
		
        
        System.out.printf("\n");
        System.out.println("Account data:");
        System.out.println(count);
        
        System.out.printf("\n");
        System.out.printf("Enter a deposit value:");
        double depositValue = sc.nextDouble();
		count.deposit(depositValue);
        System.out.println("Updated account data:");
        System.out.println(count);
        
        System.out.printf("\n");
        System.out.printf("Enter a withdraw value:");
        double withdrawValue = sc.nextDouble();
		count.withdraw(withdrawValue);
        System.out.println("Updated account data:");
        System.out.println(count);
        
        
        sc.close();
	}

}
