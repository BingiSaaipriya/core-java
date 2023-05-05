package com.StringExamples;

public class DuplicateCharacters {
	
	public static void main(String[] args) {
		
		
		String name="AarhaSree";
		int count;
		name=name.toUpperCase();
		
		name=name.toLowerCase();
		
		char[]ch=name.toCharArray();
		
		char[]ch1= {'a','a','r','h','a','s','r','e','e'};
		
		for(int i=0;i<ch.length;i++) {
			count=1;
			for(int j=i+1;j<ch.length;j++) {
				
			//	if(ch[i]==ch[j]&&ch[i]!='') {
				
				
				if(ch[i]==ch[j]) {
					count++;
					ch[j]='0';
				}
				
			}
			if(count>1&&ch[i]!='0') {
				System.out.println(ch[i]);
				System.out.println(String.valueOf(ch[i]).toUpperCase());
				System.out.println(String.valueOf(ch[i]).toLowerCase()+"="+count);
			}
		}
		
		
		
		
	}

	}

