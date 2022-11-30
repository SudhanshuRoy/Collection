package convertion;

import java.util.HashSet;
import java.util.Set;

import java.util.Iterator;

public class SetInterfaceDemo {

	public static void main(String[] args) {
		Set<Integer> set=new HashSet<Integer>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		
		System.out.println(set.contains(8));
		System.out.println(set.contains(5));
		
		for(Integer i:set) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		System.out.println(set.remove(3));
		
		System.out.println("******************");
		Iterator<Integer> itr=set.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		System.out.println();
		
		set.removeIf(i->i<2);
		
		System.out.println("******************");
		set.forEach(i->System.out.print(i+" "));
		

	}

}
