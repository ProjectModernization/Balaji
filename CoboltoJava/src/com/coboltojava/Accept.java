package com.coboltojava;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Accept {
	public static void main(String[] args){
		int StudentId;
		String StudentName;
		String Surname;
		String Initials;
		int CourseCode;
		String Gender;
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Calendar ca1 = Calendar.getInstance();    
		int DayOfYear=ca1.get(Calendar.DAY_OF_YEAR);
		
		String CurrentDate;
		String CurrentMonth;
		String CurrentDay;
//		String DayOfYear;
		String YearDay;
		
	    
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter student details using template below");
		System.out.println("Enter - ID, Surname, Intials, CourseCode, Gender");
		System.out.println("SSSSSSSNNNNNNNNIICCCCG");
		
		StudentId = keyboard.nextInt();
		Surname = keyboard.next();
		Initials = keyboard.next();
		CourseCode = keyboard.nextInt();
		Gender = keyboard.next();
		
	
		
		System.out.println("Name is " + Initials + " " + Surname);
		System.out.println("Date is  "+new SimpleDateFormat("MM dd yyyy")
				.format(Calendar.getInstance().getTime()));
		System.out.println("Today is day " + DayOfYear+ " of the year");
		System.out.println( "The Time is  "+new SimpleDateFormat("HH:mm")
				.format(Calendar.getInstance().getTime()) );
		
		
		
		
		
	}

}
