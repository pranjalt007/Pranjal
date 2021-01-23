package LockedMe;

import java.io.File;
import java.util.Scanner;

public class SearchFile {

	public static void Search()  
    { 
		Scanner scanner = new Scanner( System.in );
		 System.out.println("\nEnter the file path:\n");
		 String dirPath = scanner.nextLine();
		 File folder = new File(dirPath);
        String[] flist = folder.list(); 
        int flag = 0; 
        if(folder.isDirectory())
        {
        if (flist == null) { 
            System.out.println("\nEmpty directory.\n"); 
        } 
        else { 
         Scanner filen = new Scanner( System.in );
   		 System.out.println("Enter the file name to search:\n");
   		 String filename = filen.nextLine();

            for (int i = 0; i < flist.length; i++) { 
                String filenamea = flist[i]; 
                if (filenamea.equals(filename)) { 
                    System.out.println(filename + " File found\n"); 
                    flag = 1; 
                } 
            } if (flag == 0) { 
                System.out.println("\nFile Not Found\n"); 
        } 
            filen.close();
        }
		
    } else
    {
    	System.out.println("\npath not exist!\n");
    }
    }
	
}