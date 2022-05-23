package org.interviewProgram;

import org.testng.annotations.Test;

public class ReverseNumber {

	@Test
	public void test01() {
		int num = 123456789;

		int rev = 0;

		while(num!=0) {
			int rem = num%10;
			rev = rev*10+rem;

			num = num/10;
		}
		
		System.out.println(rev);

	}
	
	@Test
	public static void test03(){
		test02(123456);
	}
	
	public static void test02(int num) {
		
		
		if(num<10) {
			
			System.out.print(num);
			
		}else {
			
			System.out.print(num%10);
			test02(num/10);
			
		}
		
	}

}
