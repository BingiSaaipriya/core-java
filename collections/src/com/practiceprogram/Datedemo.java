package com.practiceprogram;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

import javax.swing.text.DateFormatter;

public class Datedemo {
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date);
		
		Date d2 = new Date(2023, 03, 07);
		System.out.println(d2);
		
		//mm//dd//yyyy
		String dateformatting="mm//dd//yyyy";
		DateFormatter formaterdate= new DateFormatter();
		SimpleDateFormat simpledateformat = new SimpleDateFormat();
		String formateddate= simpledateformat.format(d2);
		System.out.println(formateddate);
		System.out.println(LocalDate.now());
		
	}

}
