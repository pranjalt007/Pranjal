package LockedMe;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class DisplayFile {
	
	public static void file()
	{
			Scanner scanner = new Scanner( System.in );
			 System.out.println("\n Please Enter The Directory Path:");
			 String dirPath = scanner.nextLine();
			 File folder = new File(dirPath);
			
			 if(folder.isDirectory())
			 {
				File[] fileList = folder.listFiles();
				
				int length = fileList.length;
			if(length >0)
			{
				System.out.println("\nTotal number of items present in the directory:" + fileList.length);
				Arrays.sort(fileList);
				for(File file : fileList)
				
			 {
					
				System.out.println(file.getName());
}
			}else
			{
			System.out.println("Empty folder");	
			}
			}
				else
			{
				System.out.println("path not exist!");
			}
			
		
		}

}
