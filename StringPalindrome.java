package org.interviewProgram;

import org.testng.annotations.Test;

public class StringPalindrome {

	@Test
	void test01() {

		String str = "Real Madrid";

		String revStr = "";

		for(int i=(str.length()-1);i>=0;i--) {
			revStr = revStr + str.charAt(i);
		}

		if(str.equals(revStr)) {
			System.out.println(str+" is a palindrome string");
		}else {
			System.out.println(str+" is not a palindrom string");
		}

	}

	@Test
	void test02() {

		String str = "civic";

		String revStr = "";

		for(int i=(str.length()-1);i>=0;i--) {
			revStr = revStr + str.charAt(i);
		}

		if(str.equals(revStr)) {
			System.out.println(str+" is a palindrome string");
		}else {
			System.out.println(str+" is not a palindrom string");
		}

	}


}
