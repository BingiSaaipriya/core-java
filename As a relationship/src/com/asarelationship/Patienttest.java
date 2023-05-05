package com.asarelationship;

public class Patienttest {


	public static void main(String[] args) {
		Hospital hospital = new Hospital(1, "hyd", "rainbow", 50000.00);
		Hospital hospital1 = new Hospital(4, "rdm", "rainbow", 60000.00);
		Hospital hospital2 = new Hospital(2, "pdpl", "rainbow", 30000.00);
		Patient pp = new Patient(2, "srihan", hospital);
		System.out.println(pp);
		
	}

}
