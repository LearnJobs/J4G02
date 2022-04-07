package Assingment2DateandTime.java;

import java.time.LocalDate;

public class AddToCurrentDate {
	public static void main(String...strings) {
		LocalDate todayDate=LocalDate.now();
		System.out.println("today date....>"+todayDate);
		
		System.out.println("....................................");
		LocalDate AftertwoDate=todayDate.plusDays(2);
		System.out.println("Aftertowdate....>"+AftertwoDate);
	}

}
