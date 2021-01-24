package LockedMe;

import java.util.InputMismatchException;
import java.util.Scanner;

public class LoopBack {
	public static void navigate()
	{
		try {
		System.out.println("\n========================================================================\n");
		System.out.println("\n ***Select the vaild option***");
		System.out.println("\n 1--Back to Main Menu");
		System.out.println("\n 2--Close the Application");
		Scanner scanner = new Scanner(System.in);
		System.out.println("\n Enter your choice:\t");
		int input = scanner.nextInt();
		switch (input) {
			
		case 1:
			LockedMe.SelectOption();
			
			break;

		
		case 2:
			System.out.println("\n ***Application Closed***\n Thank you!");
			System.exit(0);
			break; 
			
		default:
			System.out.println("\n ***Invalid option! Please select vaild option***");
			LoopBack.navigate();
			break;
	}
	
	}catch (InputMismatchException ex) {
		System.out.println("\n ***Invalid input type! Please try again***");
		LoopBack.navigate();
		
}
	}

}