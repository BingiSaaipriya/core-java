package com.inter;

public class Gamestest {
	public static void main(String[] args) {
		Games gg=new Cricket();
		gg.gamename();
		gg.score();
		gg.teammembers();
		gg.time();
		System.out.println();
		Games gg2=new Basketball();
		gg2.gamename();
		gg2.score();
		gg2.time();
		gg2.teammembers();
		Games gg3=new Football();
		gg3.gamename();
		gg3.score();
		gg3.time();
		gg3.teammembers();
		
		Games gg4=new Kabbadi();
		gg4.gamename();
		gg4.score();
		gg4.time();
		gg4.teammembers();
		
	}

}
