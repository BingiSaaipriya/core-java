package com.aggregation;

public class Leavetracker {
	private  int sickleave;
	private int earnedleave;
	private int maternityleave;
	private int emergecyleave;
	
	
public Leavetracker() {
	
}


public Leavetracker(int sickleave, int earnedleave, int maternityleave, int emergecyleave) {
	super();
	this.sickleave = sickleave;
	this.earnedleave = earnedleave;
	this.maternityleave = maternityleave;
	this.emergecyleave = emergecyleave;
}


public int getSickleave() {
	return sickleave;
}


public void setSickleave(int sickleave) {
	this.sickleave = sickleave;
}


public int getEarnedleave() {
	return earnedleave;
}


public void setEarnedleave(int earnedleave) {
	this.earnedleave = earnedleave;
}


public int getMaternityleave() {
	return maternityleave;
}


public void setMaternityleave(int maternityleave) {
	this.maternityleave = maternityleave;
}


public int getEmergecyleave() {
	return emergecyleave;
}


public void setEmergecyleave(int emergecyleave) {
	this.emergecyleave = emergecyleave;
}


@Override
public String toString() {
	return "Leavetracker [sickleave=" + sickleave + ", earnedleave=" + earnedleave + ", maternityleave="
			+ maternityleave + ", emergecyleave=" + emergecyleave + "]";
}


}
