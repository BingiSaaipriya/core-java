package com.exceptionshandling;

public class Voterid {
	int age;
	
	public void voterelection() {
		if(age>=18) {
			System.out.println("eligible for voting ");
		}else {
			//System.out.println("not eligible foe voting");
			//throw new IllegalAccessError("not eligible for vote");
			throw new VoteValidateException("not eligible for vote");
		}
	
	}
public static void main(String[] args) {
Voterid vote = new Voterid();
//try {
vote.age=1;
	vote.voterelection();
//	System.out.println("person");
//}catch(VoteValidateException e){
//	System.out.println("not eligible for vote");
//}
//System.out.println("personoi");
}
}
