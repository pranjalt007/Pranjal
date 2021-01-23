package LockedMe;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LoopBack {
	public static void navigate()
	{
		try {
		System.out.println("\n========================================================================\n");
		System.out.println("\n ");
		System.out.println("\n 1--Back to Sub Menu");
		System.out.println("\n 2--Back to Main Menu");
		System.out.println("\n 3--Close the Application");
		Scanner scanner = new Scanner(System.in);
		System.out.println("\n Enter your choice:\t");
		int input = scanner.nextInt();
		switch (input) {
		
		case 1:
			LockedMe.SelectSubOption();
			
			break;
			
		case 2:
			LockedMe.SelectOption();
			
			break;

		
		case 3:
			System.out.println("\n Closing your application........ \n Thank you!");
			System.exit(0);
		default:
			System.out.println("\n invalid option! Please select option Between 1 to 3");
			LoopBack.navigate();
			break;
	}
	
	}catch (InputMismatchException ex) {
		System.out.println("\n Invalid input type! Please try again");
		LoopBack.navigate();
		
}
	}

}