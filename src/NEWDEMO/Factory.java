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

public class Factory {
	static File file =new File("D:\\EmpData.txt");
	static ArrayList<Emp> EmpList = new ArrayList<Emp>();
	static Scanner sc=new Scanner(System.in);
    public static void getInstance(String s) throws IOException, NumberFormatException, InterruptedException{
    	if(s.equals("1")){
    		Prt1();
    	}
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
           else if(s.equalsIgnoreCase("q"));
    	       System.exit(0);
    	
    }

	private static void Prt1() throws IOException {
		// TODO Auto-generated method stub
		Read();
		for(Emp s:EmpList){
		System.out.println(s.getEmpPayNumber()+":"+s.getTelNumber()+":"+s.getLastName()+":"+s.getFirstName()+":"+s.getInitName()+":"+s.getDepNumber()+":"+s.getJobTitle()+":"+s.getDate());
		}
	}
    
	private static void Prt2() throws IOException {
		// TODO Auto-generated method stub
		Read();
		   Collections.sort(EmpList, new SortByLastName());
		   for(Emp s:EmpList){
				System.out.println(s.getLastName()+":"+s.getFirstName()+":"+s.getInitName()+":"+s.getEmpPayNumber()+":"+s.getTelNumber()+":"+":"+s.getDepNumber()+":"+s.getJobTitle()+":"+s.getDate());
				}
	}


	private static void Prt3() throws IOException {
		// TODO Auto-generated method stub
		Read();
		for(Emp s:EmpList){
		System.out.println(s.getLastName()+":"+s.getFirstName()+":"+s.getTelNumber());
		}
	}

	private static void Prt4() throws IOException {
		// TODO Auto-generated method stub
		Read();
		Collections.sort(EmpList, new SortByLastName());
		for(Emp s:EmpList){
		System.out.println(s.getLastName()+":"+s.getFirstName()+":"+s.getTelNumber());
		}
	}

	private static void Ser() throws IOException {
		// TODO Auto-generated method stub
		Read();
		String str=sc.nextLine();
		for(Emp s:EmpList){
			if(str.equals(s.getLastName()))
				System.out.println(s.getEmpPayNumber()+":"+s.getTelNumber()+":"+s.getLastName()+":"+s.getFirstName()+":"+s.getInitName()+":"+s.getDepNumber()+":"+s.getJobTitle()+":"+s.getDate());
		}
				
			
	}
	
	private static void add() throws IOException, NumberFormatException, InterruptedException {
		// TODO Auto-generated method stub
		Read();
		 FileWriter fw = new FileWriter(file, false);
	    Emp em=new Emp();
		System.out.println("Employee Record Additions:\r\nEnter the following details of the new employee:\r\nEmployee 3 digit payroll number\r\nPhone Number\r\nLast Name\r\nFirst Name\r\nMiddle Init\r\nDept #\r\nJob Title\r\nDate Hir\r\n\r\n");
		System.out.println("Enter employee 3 digit payroll number");
		em.setEmpPayNumber(sc.nextLine());
		System.out.println("Enter Phone Number (02-12345678)");
		em.setTelNumber(sc.nextLine());
		System.out.println("Enter Last Name");
		em.setLastName(sc.nextLine());
		System.out.println("Enter First Name");
		em.setFirstName(sc.nextLine());
		System.out.println("Enter Middle Init");
		em.setInitName(sc.nextLine());
		System.out.println("Enter Dept #");
		em.setDepNumber(sc.nextLine());
		System.out.println("Enter Job Title");
		em.setJobTitle(sc.nextLine());
		System.out.println("Enter Date Hired (dd-mm-yyyy)");
		em.setDate(sc.nextLine());
		EmpList.add(em);
		for(Emp s:EmpList){
				fw.write(s.getEmpPayNumber()+":"+s.getTelNumber()+":"+s.getLastName()+":"+s.getFirstName()+":"+s.getInitName()+":"+s.getDepNumber()+":"+s.getJobTitle()+":"+s.getDate()+"\r\n");
		}
		fw.flush();
        fw.close();
        Menu.getInstance();
	}

	
	private static void del() throws IOException, NumberFormatException, InterruptedException {
		// TODO Auto-generated method stub
		Read();
		FileWriter fw = new FileWriter(file, false);
		String str=sc.nextLine();
		 for (int i = 0; i < EmpList.size(); i++) {
	            if (EmpList.get(i).getEmpPayNumber().equals(str)) {
	            	EmpList.remove(i);
	            }
	}
			for(Emp s:EmpList){
				fw.write(s.getEmpPayNumber()+":"+s.getTelNumber()+":"+s.getLastName()+":"+s.getFirstName()+":"+s.getInitName()+":"+s.getDepNumber()+":"+s.getJobTitle()+":"+s.getDate()+"\r\n");
		}
		fw.flush();
        fw.close();
        Menu.getInstance();}

	



	
	
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
