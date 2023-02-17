package com.demo.testcase;

public class Break {

	public static void main(String[] args) {

		System.out.println("!!!!!!!!!!for - break!!!!!!!!!!");	
		for(int i=13; i<25; i++)
		{
			if(i==16)
			{
				break;
			}
			System.out.println(i);
		}
		System.out.println("!!!!!!!while - break!!!!!!!!!");	
		
		int i = 13;
		while(i<25)
		{
			if(i==16)
				break;
			System.out.println(i);	
			i++;
		}	
	}

	}


