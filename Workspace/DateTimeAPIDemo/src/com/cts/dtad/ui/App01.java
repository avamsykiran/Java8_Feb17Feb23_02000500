package com.cts.dtad.ui;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;


public class App01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		
		LocalDate today = LocalDate.now();
		System.out.println(today);

		LocalDateTime todayTime = LocalDateTime.now();
		System.out.println(todayTime);
		
		ZonedDateTime newYorkDateTime = ZonedDateTime.now(ZoneId.of("GMT-5"));
		System.out.println(newYorkDateTime);

		LocalDate indiaIndepDate = LocalDate.of(1947,Month.AUGUST, 15);
		
		System.out.println(today.format(format));		
		System.out.println(indiaIndepDate.format(format));
		
		System.out.print("DOB (dd-MMM-yyyy): ");
		String dobStr = scan.next();
		
		LocalDate dob = LocalDate.parse(dobStr,format);
		
		Period age = Period.between(dob, today);
		System.out.println(age);
		System.out.println(age.getYears());
		System.out.println(age.toTotalMonths());
		
		final int retrimentAge = 60;
		
		LocalDate willRetireBy = dob.plusYears(retrimentAge);
		System.out.println(willRetireBy.format(format));
	}

}
