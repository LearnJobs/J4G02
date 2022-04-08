
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

class Demo1{
	public static void main(String...strings) {
		 try {
			 Class.forName("oracle.jdbc.driver.OrcaleDriver");
			 Connection con=DriverMnager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","112233");
			 Statement smt=con.createStatement();
			 smt.executeUpdate("Create table emo(eno number, ename varchar(12),esal nuber) ");
			 System.out.println("tabele create successfully");
			 con.close();
		 }catch(Exception e) {
 			 System.out.println(e);
			 
		 }
	}
}