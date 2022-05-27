package org.interviewProgram;

import org.testng.annotations.Test;

public class FibonacciSeries {

	@Test
	void test01() {

		int n1=0,n2=1;
		int n3=0;

		int count = 10;

		for(int i=0;i<count;i++) {
			n3 = n1+n2;

			System.out.println(n3);

			n1=n2;
			n2=n3;

		}

	}

	@Test
	void test02() {

		test(10);

	}

	void test(int count) {

		int n1=0,n2=1;
		int n3=0;

		while(count>0) {

			n3=n1+n2;

			System.out.println(n3);
			
			n1=n2;
			n2=n3;

			count = count-1;

		}

	}
}
