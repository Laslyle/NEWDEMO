package NEWDEMO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Factory {
	static File file =new File("D:\\EmpData.txt");
	static ArrayList<Emp> EmpList = new ArrayList<Emp>();
	static Scanner sc=new Scanner(System.in);
    public static void getInstance(String s) throws IOException, NumberFormatException, InterruptedException{
    	if(s.equals("1"))
    		Prt1();
    	   else if(s.equals("2"))
           Prt2();
           else if(s.equals("3"))
        	   Prt3();
           else if(s.equals("4"))
        	   Prt4();
           else if(s.equals("5"))
        	   Ser();
           else if(s.equals("6"))
        	   add();
           else if(s.equals("7"))
        	   del();
           else if(s.equalsIgnoreCase("q"))
    	       System.exit(0);
    	   else
    	  System.out.print("Invalid code! Press Enter to continue＃");	
    	if(sc.nextLine().equals(""))
    		Menu.getInstance();
    }

	private static void Prt1() throws IOException, NumberFormatException, InterruptedException {
		// TODO Auto-generated method stub
		Read();
		for(Emp s:EmpList){
		System.out.println(s.getEmpPayNumber()+":"+s.getTelNumber()+":"+s.getLastName()+":"+s.getFirstName()+":"+s.getInitName()+":"+s.getDepNumber()+":"+s.getJobTitle()+":"+s.getDate());
		}
		 System.out.print("Press Enter to continue... ");	
	    	if(sc.nextLine().equals(""))
	    		Menu.getInstance();
	}
    
	private static void Prt2() throws IOException, NumberFormatException, InterruptedException {
		// TODO Auto-generated method stub
		Read();
		   Collections.sort(EmpList, new SortByLastName());
		   for(Emp s:EmpList){
				System.out.println(s.getLastName()+":"+s.getFirstName()+":"+s.getInitName()+":"+s.getEmpPayNumber()+":"+s.getTelNumber()+":"+":"+s.getDepNumber()+":"+s.getJobTitle()+":"+s.getDate());
				}
		   System.out.print("Press Enter to continue... ");	
	    	if(sc.nextLine().equals(""))
	    		Menu.getInstance();
	}


	private static void Prt3() throws IOException, NumberFormatException, InterruptedException {
		// TODO Auto-generated method stub
		Read();
		for(Emp s:EmpList){
		System.out.println(s.getLastName()+":"+s.getFirstName()+":"+s.getTelNumber());
		}
		 System.out.print("Press Enter to continue... ");	
	    	if(sc.nextLine().equals(""))
	    		Menu.getInstance();
	}

	private static void Prt4() throws IOException, NumberFormatException, InterruptedException {
		// TODO Auto-generated method stub
		Read();
		Collections.sort(EmpList, new SortByLastName());
		for(Emp s:EmpList){
		System.out.println(s.getLastName()+":"+s.getFirstName()+":"+s.getTelNumber());
		}
		 System.out.print("Press Enter to continue... ");	
	    	if(sc.nextLine().equals(""))
	    		Menu.getInstance();
	}

	private static void Ser() throws IOException, NumberFormatException, InterruptedException {
		// TODO Auto-generated method stub
		Read();
		int flag=0;
		String str=null;
		while(true){
		System.out.println("(Enter keyword:");
		str=sc.nextLine();
		if(str.equals(""))
			System.out.println("No keyword entered 每 try agai");
		else
			break;
		}
	
		for(Emp s:EmpList){
			if(str.equals(s.getLastName())){
				flag=1;
				System.out.println(s.getEmpPayNumber()+":"+s.getTelNumber()+":"+s.getLastName()+":"+s.getFirstName()+":"+s.getInitName()+":"+s.getDepNumber()+":"+s.getJobTitle()+":"+s.getDate());
				System.out.print("Press Enter to continue... ");	
		    	if(sc.nextLine().equals(""))
		    		Menu.getInstance();
		}
		
		}
		if(flag==0)
		{
			System.out.println("Keyword 每 "+str+" - not found");
			System.out.print("Press Enter to continue... ");	
			if(sc.nextLine().equals(""))
				Menu.getInstance();
	}
		}
	
	private static void add() throws IOException, NumberFormatException, InterruptedException {
		// TODO Auto-generated method stub
		Read();
		 
	    Emp em=new Emp();
		System.out.println("Employee Record Additions:\r\nEnter the following details of the new employee:\r\nEmployee 3 digit payroll number\r\nPhone Number\r\nLast Name\r\nFirst Name\r\nMiddle Init\r\nDept #\r\nJob Title\r\nDate Hir\r\n\r\n");
		
		while(true){
			System.out.println("Enter employee 3 digit payroll number");
		String empnum=sc.nextLine();
		int flag=0;
		for(Emp s:EmpList){
			if(s.EmpPayNumber.equals(empnum)){
				System.out.println("Repeate!");
				flag=1;
			}
		}
		if(empnum.equals(""))
			System.out.println("No payroll number entered 每 try again");
		else if (empnum.matches("[\\D]{1,}"))
			System.out.println("Payroll number can contain only numerical characte");
		else if(empnum.matches("^[\\d]{3}$")&&flag==0){
		em.setEmpPayNumber(empnum);
	break;
	}}
		while(true){
		System.out.println("Enter Phone Number (02-12345678)");
		String telnum=sc.nextLine();
		if(telnum.equals(""))
			System.out.println("No phone number entered 每 try again");
		else if(telnum.matches("^0[2-8]{1}-[1-9]{1}[0-9]{7}$")){
		em.setTelNumber(telnum);
		break;}
		else
			System.out.println("Invalid phone number 每 try aga");
		}
		while(true){
			System.out.println("Enter Last Name");
			String lastname=sc.nextLine();
			if(lastname.equals(""))
				System.out.println("No last name entered 每 try again");
			else if(lastname.matches("[a-zA-Z]*\\s*")){
				em.setLastName(lastname);
			break;}
			else
				System.out.println("Last name can contain only alphabetical characters and spaces");
			}
		
		while(true){
			System.out.println("Enter First Name");
			String firstname=sc.nextLine();
			if(firstname.equals(""))
				System.out.println("No First name entered 每 try again");
			else if(firstname.matches("[a-zA-Z]*\\s*")){
				em.setFirstName(firstname);
			break;}
			else
				System.out.println("First name can contain only alphabetical characters and spaces ");
			}
		
		while(true){
			System.out.println("Enter Middle Init");
			String init=sc.nextLine();
			if(init.equals(""))
				System.out.println("No Middle Init entered 每 try again");
			else if(init.matches("[a-zA-Z]*\\s*")){
				em.setInitName(init);
			break;}
			else
				System.out.println("Middle Initcan contain only alphabetical characters and spaces");
			}
		
		while(true){
			System.out.println("Enter Dept #");
			String dept=sc.nextLine();
			if(dept.equals(""))
				System.out.println("No Dept # entered 每 try again ");
			else if(dept.matches("^[\\d]{1,}$")){
				em.setDepNumber(dept);
			break;}
			else
				System.out.println(" Dept # can contain only digits with no spaces");
			}
		
		while(true){
			System.out.println("Enter Job Title");
			String job=sc.nextLine();
			if(job.equals(""))
				System.out.println("No Job title entered 每 try again");
			else if(job.matches("[a-zA-Z]*\\s*")){
				em.setJobTitle(job);
			break;}
			else
				System.out.println("Job title can contain only alphabetical characters and spaces");
			}
		
		while(true){
			System.out.println("Enter Date Hired (dd-mm-yyyy)");
			String date=sc.nextLine();
			if(date.equals(""))
				System.out.println("No date hired entered 每 try again");
			else if(date.matches("(((0[1-9]|[12][0-9]|3[01])-((0[13578]|1[02]))|((0[1-9]|[12][0-9]|30)-(0[469]|11))|(0[1-9]|[1][0-9]|2[0-8])-(02))-([0-9]{3}[1-9]|[0-9]{2}[1-9][0-9]{1}|[0-9]{1}[1-9][0-9]{2}|[1-9][0-9]{3}))|(29/02/(([0-9]{2})(0[48]|[2468][048]|[13579][26])|((0[48]|[2468][048]|[3579][26])00)))")){
				em.setDate(date);
			break;}
			else
				System.out.println("Invalid Date Hired");
			}
	
		
		
		
		
		
		
		
		
		
		EmpList.add(em);
		FileWriter fw = new FileWriter(file, false);
		for(Emp s:EmpList){
				fw.write(s.getEmpPayNumber()+":"+s.getTelNumber()+":"+s.getLastName()+":"+s.getFirstName()+":"+s.getInitName()+":"+s.getDepNumber()+":"+s.getJobTitle()+":"+s.getDate()+"\r\n");
		}
		fw.flush();
        fw.close();
        System.out.println("Record Saved ");
        System.out.println("Add another employee record? (y)es or (n)o");
        if(sc.nextLine().equalsIgnoreCase("y"))
        		add();
        		else
        Menu.getInstance();
	}

	
	private static void del() throws IOException, NumberFormatException, InterruptedException {
		// TODO Auto-generated method stub
		Read();
		int flag=0;
		String str=null;
		System.out.println("倓堊訧捅 每 Employee Records:\r\n====================================");
	    while(true){
		System.out.println("Enter employee＊s 3 digit payroll number to enable record deletion");
		 str=sc.nextLine();
		 if(str.equals("")){
				System.out.println("No payroll number entered 每 try again");
		 }
		 else if(str.matches("^[\\d]{3}$")){
			 break;}
		 else
			 System.out.println("Payroll number can contain only numerical characte");
	    }
		
		 
			 for (int i = 0; i < EmpList.size(); i++) {
		            if (EmpList.get(i).getEmpPayNumber().equals(str)) {
		            	System.out.println("Confirm record deletion, (y)es or (n)o, ");
		            	if(sc.nextLine().equalsIgnoreCase("y")){
		            	   EmpList.remove(i);
		            	 flag=1;  
		            	}
		            	else 
		            	{
		            		flag=2;
		            		break;
		            	}
		            }
		        }
			 if(flag==0)
         		{
				 System.out.println("Employee record for "+str+" not found");
	            	System.out.println("Press Enter to continue ");
	            	if(sc.nextLine().equals(""))
	            		Menu.getInstance();
         		}
			 else if(flag==1){
			 FileWriter fw = new FileWriter(file, false);
				for(Emp s:EmpList){
					fw.write(s.getEmpPayNumber()+":"+s.getTelNumber()+":"+s.getLastName()+":"+s.getFirstName()+":"+s.getInitName()+":"+s.getDepNumber()+":"+s.getJobTitle()+":"+s.getDate()+"\r\n");
			}
			fw.flush();
	        fw.close();
	        System.out.println("Record deleted");}
			 else
				 Menu.getInstance();
	
		 
	    

		}

	



	
	
	public static void Read() throws IOException{
		  BufferedReader reader = new BufferedReader(new FileReader(file));
		  String line = null;
		  int flag=0;
		    while ((line = reader.readLine()) != null){
		    	String values[]=line.split(":");
		    	Emp a=new Emp();
		    	a.setEmpPayNumber(values[0]);
		    	a.setTelNumber(values[1]);
		    	a.setLastName(values[2]);
		    	a.setFirstName(values[3]);
		    	a.setInitName(values[4]);
		    	a.setDepNumber(values[5]);
		    	a.setJobTitle(values[6]);
		    	a.setDate(values[7]);
		    	for(Emp s:EmpList){
		    		if(a.EmpPayNumber.equals(s.EmpPayNumber)){
		    			flag=1;
		    			break;
		    		}	
		    	}
		    	if(flag==0)
		    	EmpList.add(a);
		    }
	}
}

class SortByLastName implements Comparator {
    public int compare(Object o1, Object o2) {
     Emp s1 = (Emp) o1;
     Emp s2 = (Emp) o2;
     return s1.getLastName().compareTo(s2.getLastName());
    }
}
