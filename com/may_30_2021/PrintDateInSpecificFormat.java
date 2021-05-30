package com.dailycoder.may_30_2021;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class PrintDateInSpecificFormat {

	public static void main(String[] args) {
		
		String pattern = "MM-dd-yyyy HH:MM:SSS";
		
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		
		String date = sdf.format(new Date());
		
		System.out.println("Current date is "+ date);
		
	}
}
