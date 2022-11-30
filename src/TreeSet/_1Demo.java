package TreeSet;

import java.util.TreeSet;

public class _1Demo {

	public static void main(String[] args) {
		//Implements set so duplicate not allowed,insertion order not maintained,elements are sorted
		TreeSet<Integer> ts=new TreeSet<Integer>();
		ts.add(30);
		ts.add(80);
		ts.add(30);
		ts.add(40);
		ts.add(50);
		System.out.println(ts);

	}

}
