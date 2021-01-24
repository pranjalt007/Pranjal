package LockedMe;

import java.util.Scanner;
import java.util.InputMismatchException;

public class LockedMe {

	public static void SelectOption() {
		{
			try {			
				System.out.println("========================================================================");
				System.out.println("\n*****Select the option*****\n");
				System.out.println(" <Press 1> Display all the File and Folders.");
				System.out.println("\n <Press 2> For create a file, delete a file and search a file form Directory.");

				System.out.println("\n <Press 3> Exit.");
				Scanner scanner = new Scanner(System.in);
				System.out.println("\n Enter your choice:");
				int select = scanner.nextInt();
				switch (select) {
				case 1:
					System.out.println("\n ***You have selected option to display all the files and folders inside the directory***");
					DisplayFile.file();
					LoopBack.navigate();

					break;

				case 2:
					System.out.println("\n ***Kindly select the preferd action***");
					LockedMe.SelectSubOption();
					break;

				case 3:
					System.out.println("\n ***Application Closed*** \n Thank you!");
					System.exit(0);
				default:
					System.out.println("\n ***Invalid option! Please select option from 1 to 3***");
					LockedMe.SelectOption();
					break;
				}

			} catch (InputMismatchException ex) {
				System.out.println("\n ***Invalid input type! Please try again***");
				LockedMe.SelectOption();
			}

		}
	}

	public static void SelectSubOption() {
		try {
			System.out.println("\n *******Sub Menu******\n");
			System.out.println("\n <Press 1> Create a new file");
			System.out.println("\n <Press 2> Delete a file");
			System.out.println("\n <Press 3> Search a file");
			System.out.println("\n <Press 4> Back to Main Menu");
			System.out.println("\n <Press 5> Exit");
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
				System.out.println("\n ***Application Closed*** \\n Thank you!");
				System.exit(0);
			default:
				System.out.println("\n ***Invalid option! Please select vaild option.***");
				LockedMe.SelectSubOption();
				break;
			}

		} catch (InputMismatchException ex) {
			System.out.println("\n ***Invalid input type! Please try again***");
			LockedMe.SelectSubOption();

		}
	}
} 