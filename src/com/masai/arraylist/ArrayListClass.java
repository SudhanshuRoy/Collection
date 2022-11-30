package com.masai.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListClass {

	

	public static void main(String[] args) {
		List list=new ArrayList();
		list.add(5);
		list.add("Ram");
		list.add(new Student(1,"Sudhanshu",450));
		list.add(null);
		
		System.out.println(list);
		
		List<String> list2=new ArrayList<String>();
		list2.add("one");
		list2.add("two");
		System.out.println(list2.get(1));
		
		

	}

}
