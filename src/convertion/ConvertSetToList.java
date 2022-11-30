package convertion;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ConvertSetToList {

	public static void main(String[] args) {
		
		Set<Integer> set=new HashSet<Integer>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(5);
		
		List<Integer> list=new ArrayList<>();
		for(Integer i:set) {
			list.add(i);
		}
		System.out.println(list);
		
		// Sort-cut very effective
		List<Integer> list2=new ArrayList<>(set);
		list2.forEach(i->System.out.println(i));
		

	}	

}
