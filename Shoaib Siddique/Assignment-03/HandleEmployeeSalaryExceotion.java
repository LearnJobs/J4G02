/*package com.assignment;

import java.util.Scanner;

public class HandleEmployeeSalaryExceotion {

	
		public static void main(String arg[])	
		{
		    double gs,it,pf,netSalary;
		    Scanner sc=new Scanner(System.in);
		    System.out.println("enter Gross salary");
	                   gs=sc.nextDouble();
		    System.out.println("enter Income Tax %");
	                   it=sc.nextDouble();
		
	    
		     System.out.println("enter Provident Fund %");
	      pf=sc.nextDouble();
		     pf=pf*(gs/100);
		     it=it*(gs/100);
		 
		     netSalary=gs-it-pf;
		     if(gs>80000)
		   	 try {
		    		 throw new SalaryException();
		    	 }catch(SalaryException se) {
	         		 System.err.println(se.getMessage());
		    	 }
		       else
		     {
		    
		    	 netSalary=gs-it-pf;
		     System.out.println("Net Salary is="+netSalary);
	                   }
	}
}


*/