package NEWDEMO;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Menu {
	
    public static void getInstance() throws IOException, NumberFormatException, InterruptedException{
    	Scanner scan=new Scanner(System.in);
         File file =new File("D:\\EmpData.txt");
	   
	   System.out.println("倓堊訧捅 - Employee Information - Main Me");
	   System.out.println("=================================");
	   System.out.println("1 - Print All Current Records"+"\n"
	   		+ "2 每 Print All Current Records (formatted)"+"\n"
	   		+ "3 每 Print Names and Phone Numbers"+"\n"
	   		+ "4 每 Print Names and Phone Numbers (formatted)"+"\n"
	   		+ "5 - Search for specific Record(s)"+"\n"
	   		+ "6 - Add New Records"+"\n"
	   		+ "7 每 Delete Records"+"\n"
	   		+ "Q - Quit");
	   System.out.print("Your Selection: ");
	   if(!file.exists())
	   {
		   System.out.println("\nEmployee information data file not found! Now exit!");
	   System.exit(0);
	   }
	   String s = scan.nextLine();

	    Factory.getInstance(s);
    }

}