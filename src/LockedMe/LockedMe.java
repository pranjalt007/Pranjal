package LockedMe;

import java.util.Scanner;
import java.util.InputMismatchException;

public class LockedMe {

	public static void SelectOption() {
		{
			try {

				System.out.println("");
				System.out.println("\n========================================================================");
				System.out.println("\n*****Please Enter Your Choice****\n");
				System.out.println("\n Select 1-- Display all the File and Folders");
				System.out.println("\n Select 2-- To create a file, delete a file and search a file form Directory");

				System.out.println("\n 3--Exit");
				Scanner scanner = new Scanner(System.in);
				System.out.println("\n Enter your choice:\n");
				int select = scanner.nextInt();
				switch (select) {
				case 1:
					System.out.println("\n You have selected option 1: Display all the File and Directory.....");
					DisplayFile.file();
					LoopBack.navigate();

					break;

				case 2:
					System.out.println("\n you have selected 2nd option, Below are the sub menu");
					LockedMe.SelectSubOption();
					break;

				case 3:
					System.out.println("\n Closing your application........ \n Thank you!");
					System.exit(0);
				default:
					System.out.println("\n invalid option! Please select option Between 1 to 3");
					LockedMe.SelectOption();
					break;
				}

			} catch (InputMismatchException ex) {
				System.out.println("\n Invalid input type! Please try again");
				LockedMe.SelectOption();
			}

		}
	}

	public static void SelectSubOption() {
		try {
			System.out.println("\n========================================================================\n");
			
			System.out.println("\n *******Sub Menu******\n");
			System.out.println("\n 1--Create a new file");
			System.out.println("\n 2--Delete a file");
			System.out.println("\n 3--Search a file");
			System.out.println("\n 4--Back to Main Menu");
			System.out.println("\n 5--Exit");
			Scanner scanner = new Scanner(System.in);
			System.out.println("\n Enter your choice:\t");
			int input = scanner.nextInt();
			switch (input) {

			case 1:
				CreateFile.Cfile();
				LoopBack.navigate();
				break;

			case 2:
				DeleteFile.dfile();
				LoopBack.navigate();
				break;

			case 3:
				SearchFile.Search();
				LoopBack.navigate();

				break;
			case 4:
				LockedMe.SelectOption();

				break;
			case 5:
				System.out.println("\n Closing your application........ \n Thank you!");
				System.exit(0);
			default:
				System.out.println("\n invalid option! Please select option Between 1 to 3 ");
				LockedMe.SelectSubOption();
				break;
			}

		} catch (InputMismatchException ex) {
			System.out.println("\n Invalid input type! Please try again");
			LockedMe.SelectSubOption();

		}
	}
} 