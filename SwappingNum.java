package org.interviewProgram;

import org.testng.annotations.Test;

public class SwappingNum {
	
	@Test
	void test01() {
		
		int a = 12;
		int b = 13;
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("a : "+a+"\n"+"b : "+b);
		
	}
	
	@Test
	void test02() {
		
		int a=12;
		int b=13;
		int c=0;
					
		c=a;
		a=b;
		b=c;
				
		System.out.println("a : "+a+"\n"+"b : "+b);
	}
	
}
