package com.operators;

public class Weekday {
	public static void main(String[] args) {
		int weekday=4;
		String  result=weekday==1?"monday":weekday==2?"tuesday":weekday==3?"wednesday":weekday==4?"thursday":weekday==5?"friday":weekday==6?"saturday":
			weekday==7?"sunday":"please enter a valid weekday";
				System.out.println(result);
				
		
	}

}
