package Assingment2.java;

public class Questions5  implements Cloneable{
	int Que_No;
	String sub_Name;
	public Questions5(int Que_No ,String sub_Name) {
		this.Que_No=Que_No;
		this.sub_Name=sub_Name;
		
	}
public void result() {
	System.out.println("Questions nos......>"+Que_No+" "+"SubjectName........>"+sub_Name);
}
public static void main(String...strings) {
	Questions5 o1=new Questions5(44,"dataStructure");
	Questions5 o2=null;
	try {
	o2=(Questions5)o1.clone();
}catch(Exception e) {
	e.printStackTrace();
}
	o1.result();
	o1.sub_Name="Java";
	o2.result();
	o1.result();
	o2.result();
}}

