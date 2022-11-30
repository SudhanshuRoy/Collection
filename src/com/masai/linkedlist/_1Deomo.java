package com.masai.linkedlist;

import java.util.LinkedList;
import java.util.List;

public class _1Deomo {

	public static void main(String[] args) {
		List<Integer> ll=new LinkedList<Integer>();
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(4);
		ll.add(5);
		for(Integer x:ll) {
//			System.out.println(x);
		}
		for(int i=0;i<ll.size();i++) {
			System.out.println(ll.get(i));
		}

	}

}
