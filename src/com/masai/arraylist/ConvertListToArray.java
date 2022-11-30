package com.masai.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ConvertListToArray {

	public static void main(String[] args) {
		List<Integer> ints=new ArrayList<Integer>();
		ints.add(1);
		ints.add(2);
		ints.add(3);
		ints.add(4);
		Object [] objArr= ints.toArray();
		
		for(Object obj:objArr) {
			int n=(int) obj;
			System.out.println(obj);
		}
	}

}
