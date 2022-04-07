package Assingment2DateandTime.java;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate EmployeeBirthday=LocalDate.of(1990, Month.APRIL,6);
		System.out.println(EmployeeBirthday);
		
		LocalDate nowDate=LocalDate.now();
		System.out.println(nowDate);
		
		System.out.println(Period.between(EmployeeBirthday, nowDate));
		System.out.println("Employee..>"+ChronoUnit.YEARS.between(EmployeeBirthday, nowDate));

	}

}
