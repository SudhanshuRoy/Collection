package com.masai.stack;

import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class _1Demo {

	public static void main(String[] args) {
		Stack<Character>  list=new Stack<>();
		list.add('a');
		list.push('b');
		list.push('c');
		list.add('d');
		list.add(null);
		for(Character c:list) {
			System.out.println(c);
		}
		

	}

}
