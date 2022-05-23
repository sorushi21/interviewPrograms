package org.interviewProgram;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

import org.testng.annotations.Test;

public class RemoveDuplicateArrayList {

	@Test
	void test() {

		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(10);
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(40);

		Iterator<Integer> itr = list.iterator();
		while(itr.hasNext()) {

			System.out.print(itr.next()+" ");

		}

		System.out.println();
		test01(list);
		System.out.println();
		test02(list);

	}

	//method01
	void test01(ArrayList<Integer> list) {

		ArrayList<Integer> newList = new ArrayList<Integer>();

		for (Integer ele : list) {

			if (!newList.contains(ele)) {

				newList.add(ele);
			}

		}
		
		Iterator<Integer> itr = newList.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}

	}
	
	//method02
	void test02(ArrayList<Integer> list) {
		
		LinkedHashSet<Integer> set = new LinkedHashSet<Integer>(list);
		ArrayList<Integer> newList = new ArrayList<Integer>(set);
		
		Iterator<Integer> itr = newList.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		
	}
}