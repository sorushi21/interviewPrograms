package org.interviewProgram;

import org.testng.annotations.Test;

public class MiniNumberArray {

	@Test
	void test() {

		int[] ar= {10,20,30,50,2,40,60,809,90,70,5560,320};

		int mini = ar[0];

		for(int i=0;i<ar.length;i++) {
			if(mini>ar[i]) {
				mini = ar[i];
			}
		}

		System.out.println(mini);

	}
}
