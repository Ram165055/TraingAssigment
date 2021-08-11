package com.assigment.one;

import java.time.LocalDate;
import java.time.Period;

public class FindAge {

	public static void main(String[] args) {
		LocalDate today=LocalDate.now();
		LocalDate birthday=LocalDate.of(1999, 12, 1);
		int year=Period.between(birthday,today).getYears();
		int month=Period.between(birthday,today).getMonths();
		int day=Period.between(birthday,today).getDays();
         System.out.println("yy:mm:dd->"+year+":"+month+":"+day);
	}

}
