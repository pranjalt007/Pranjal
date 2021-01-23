package LockedMe;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class CreateFile {
	public static void Cfile() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("\nEnter the file path:\n");
		String dirPath = scanner.nextLine();
		File folder = new File(dirPath);

		if (folder.isDirectory()) {
			{
				Scanner scanner1 = new Scanner(System.in);
				System.out.println("\n Enter the file file name\n");
			String file1 = scanner1.nextLine();
				File file = new File(folder,file1); 

				try {
					if (file.createNewFile())
						System.out.println("\n File created!\n");
					else
						System.out.println("\n File already exists!\n");

				} catch (IOException e) {
					
					System.out.println("\n Incorrect file path!\n");
					e.printStackTrace();
				} 
		
			}
		} else {
			System.out.println("/n path not exist!");
		}
	}
}
