package org.interviewProgram;

import java.util.Scanner;

import org.testng.annotations.Test;

public class PrimeNumber {

	@Test
	void test01() {

		Scanner sc = new Scanner(System.in);
		int i;
		System.out.println("Printing the Prime Number Upto");
		int j = sc.nextInt();
		sc.close();
		for(i=1;i<=j;i++) {
			int a=0;
			for(int num=2;num<i;num++) {
				if(i%num==0) {
					a=a+1;
				}
			}
			if(a==0) {
				System.out.println(i+": prime number");
			}else {
				System.out.println(i+": not a prime number");
			}
		}

	}
}

