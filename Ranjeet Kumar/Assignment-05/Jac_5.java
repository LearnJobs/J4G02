package Assignment5_5java;

public class Jac_5 extends Thread{
	   
		 public void run(){    
		  for(int i=1;i<=5;i++){    
		   try{    
		    Thread.sleep(500);    
		   }catch(Exception e){System.out.println(e);}    
		  System.out.println(i);    
		  }    
		 }    
		public static void main(String args[]){    
		 Jac_5 t1=new Jac_5();
		 Jac_5 t2=new Jac_5();   

		 Jac_5 t3=new Jac_5();   

		 t1.start();    
		 try{    
		  t1.join(1500);    
		 }catch(Exception e){System.out.println(e);}    
		    
		 t2.start();    
		 t3.start();    
		 }    
		}    


