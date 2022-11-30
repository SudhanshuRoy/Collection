package mapInterface;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class _1DemoHashMap {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Map<Integer,String> map=new HashMap<>();
		
		System.out.println(map);
		System.out.println(map.size());
		map.put(1, "One");
		map.put(2,"Two");
		map.put(3,"Three");
		map.put(null,"four");
		map.put(null, "Four"); // replaced
		map.put(5,null);
		map.put(6,null);
		System.out.println(map);
		System.out.println(map.size());
		
		// get all the values
		System.out.println("**********************");
		Collection<String> values=map.values();
		
		values.forEach(v->System.out.println(v));
		
		// get all keys
		System.out.println("**********************");
		Collection<Integer> keys=map.keySet();

		
		keys.forEach(k->System.out.println(k));
		
		// converting into ArrayList
		List<String> vs=new ArrayList<>(values);
		List<Integer> ks=new ArrayList<>(keys);
		System.out.println(vs);
		System.out.println(ks);
		
		System.out.println("**** Getting both keys and values****");
		// with the help of entry set
		Set<Map.Entry<Integer,String>> set=map.entrySet();
//		System.out.println(set);
//		System.out.println(set.getClass().getName());
		
		// iterate over set by for loops
		
		for(Map.Entry<Integer,String> me:set) {
//			System.out.println(me);
			System.out.println(me.getKey()+"========"+me.getValue());
		}

	}

}
