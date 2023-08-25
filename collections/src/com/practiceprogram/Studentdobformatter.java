package com.practiceprogram;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Studentdobformatter {
	private static final SimpleDateFormat  simpledateformatter = new SimpleDateFormat("mm-dd-yyyy");
	public static String getDateMMDDYYY(Date date) {
		return simpledateformatter.format(date);
	}

	public static Date getDateMMDDYYY(String date) {
		try {
			return simpledateformatter.parse(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
	}

}
	


