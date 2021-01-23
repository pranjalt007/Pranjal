package LockedMe;

	import java.io.File;
	import java.io.IOException;
	import java.nio.file.Files;
	import java.nio.file.NoSuchFileException;
	import java.nio.file.Path;
	import java.nio.file.Paths;
	import java.util.Scanner;

	public class DeleteFile {

		public static void dfile() {
			Scanner scanner = new Scanner( System.in );
			 System.out.println("\n Please Enter The Directory Path:\n");
			 String dirPath = scanner.nextLine();
			 File folder = new File(dirPath);
			 if(folder.isDirectory())
			 {
				 File[] fileList = folder.listFiles();
					
					int length = fileList.length;
				if(length >0)
				{
			 Scanner scanner1 = new Scanner(System.in);
				System.out.println("\n Enter the file file name\n");
			String file1 = scanner1.nextLine();
			String combined_path = new File(folder, file1).getPath();
			Path path = Paths.get(combined_path);
	        try
	        { 
	        	
	            Files.delete(path); 
	            System.out.println("\n Deletion successful.\n");
	        } 
	        catch(NoSuchFileException e) 
	        { 
	            System.out.println("\n No such file/directory exists\n"); 
	        } 
	        
	        catch(IOException e) 
	        { 
	            System.out.println("\nInvalid permissions.\n"); 
	        } 
	            
			 }else
				{
				System.out.println("\nEmpty folder\n");	
				}
		}
				else
	    {
	    	System.out.println("\npath not exist!\n");
	    }
		
	    }

		
	 
	}