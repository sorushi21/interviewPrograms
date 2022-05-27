package org.interviewProgram;

import org.testng.annotations.Test;

public class NumberPalindrome {
	
	@Test
	void test01() {
		
		int num = 123454321;
		int orignalNum = num; 
		
		int revNum = 0;
		
		while(num!=0) {
			
			int rem = num%10;
			revNum = revNum*10+rem;
			
			num = num/10;
		}
		
		System.out.println(revNum);
				
		if(orignalNum == revNum) {
			System.out.println("Number is a palindrom number");
		}else {
			System.out.println("Number is not a palindrom number");
		}
		
	}

}
