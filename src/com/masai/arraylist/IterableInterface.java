package com.masai.arraylist;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class IterableInterface {

	public static void main(String[] args) {
		List<String> list=new ArrayList();
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("five");
		Iterator<String> itr= list.iterator();
		System.out.println(itr.getClass().getName());
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}

	}

}
