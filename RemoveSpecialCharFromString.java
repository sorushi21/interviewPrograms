package org.interviewProgram;

import org.testng.annotations.Test;

public class RemoveSpecialCharFromString {

	@Test
	void test01() {
	
		String str = "+*/_)(*&%Real+--/Madrid";
		
		str = str. replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println(str);
		
	}
	
}
