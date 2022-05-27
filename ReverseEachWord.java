package org.interviewProgram;

import org.testng.annotations.Test;

public class ReverseEachWord {
	
	@Test
	void test01() {
		
		String str = "Champions of Europe : Real Madrid";
		String revStr = "";
		
		String []words = str.split(" ");
		for(int i=0;i<words.length;i++) {
			
			String word = words[i];
			String revWord ="";
			
			for(int j=(word.length()-1);j>=0;j--) {
				revWord = revWord +word.charAt(j);
			}
			
			revStr = revStr + revWord + " ";
		}
		
		System.out.println(revStr);
		
	}

}
