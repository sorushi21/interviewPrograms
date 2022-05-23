package org.interviewProgram;

import org.testng.annotations.Test;

public class ReverseArray {

	@Test
	public void test01() {
		int [] ar = {10,20,30,40,50,60,70,80,90,100};
		
		int lenAr = ar.length;
		
		for(int i=(lenAr-1);i>=0;i--) {
			System.out.print(ar[i]+" ");
		}
		
		System.out.println();
	}
	
	@Test
	public void test02() {
		int[] ar = {10,20,30,40,50,60,70,80,90,100};
		
		int len = ar.length;
		
		//reversing array
		int[] revAr = new int[len];
		for(int i=0;i<ar.length;i++) {
			revAr[len-1]=ar[i];
			len=len-1;
		}
		
		//printing reverse array
		for(int i=0;i<revAr.length;i++) {
			System.out.print(revAr[i]+" ");
		}
		
		System.out.println();
	}
	
}
