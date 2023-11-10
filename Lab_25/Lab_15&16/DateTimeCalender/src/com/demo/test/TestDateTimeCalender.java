package com.demo.test;
	import java.text.SimpleDateFormat;
	import java.time.LocalDate;
	import java.time.LocalTime;
	import java.time.LocalDateTime;
	import java.util.Calendar;
	import java.util.Date;

	public class TestDateTimeCalender {
	    public static void main(String[] args) {
	        
	        // Date example
	        Date currentDate = new Date();
	        SimpleDateFormat dateFormat = new SimpleDateFormat("E dd/MM/yyyy");
	        String formattedDate = dateFormat.format(currentDate);
	        System.out.println("Current Date: " + formattedDate);
	        
	        // Time example
	        LocalTime currentTime = LocalTime.now();
	        System.out.println("Current Time: " + currentTime);
	        
	        // Date and Time example
	        LocalDateTime currentDateTime = LocalDateTime.now();
	        System.out.println("Current Date and Time: " + currentDateTime);
	        
	        // Calendar example
	        Calendar calendar = Calendar.getInstance();
	        Date calDate = calendar.getTime();
	        String formattedCalDate = dateFormat.format(calDate);
	        int year = calendar.get(Calendar.YEAR);
	        int month = calendar.get(Calendar.MONTH) + 1;
	        int day = calendar.get(Calendar.DAY_OF_MONTH);
	        System.out.println("Current Calendar Date: " + formattedCalDate);
	        System.out.println("Year: " + year);
	        System.out.println("Month: " + month);
	        System.out.println("Day: " + day);
	    }
	}
