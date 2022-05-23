package org.interviewProgram;

import org.testng.annotations.Test;

public class ReverseString {
	
	@Test
	public void test01() {
		
		String str = "Rushikesh";
		
		String revStr = "";
		
		int i;
		for(i=(str.length()-1);i>=0;i--) {
			revStr = revStr + str.charAt(i);
		}
		
		System.out.println(revStr);
	}

}
