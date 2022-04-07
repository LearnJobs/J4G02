package Assingment2DateandTime.java;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Demo1 {
	public static void main(String...strings) {
		LocalDate date1=LocalDate.now();
		LocalDate date2=date1.plusDays(2);
		System.out.println(date1);
		System.out.println(date2);
		if(date2.getDayOfWeek().equals(DayOfWeek.SUNDAY)) {
		System.out.println(" it is show Sunday");
		}
		else {
			System.out.println("it is not show Sunday");
			
		}
	}

}
