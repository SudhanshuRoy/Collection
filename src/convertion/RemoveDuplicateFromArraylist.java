package convertion;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateFromArraylist {

	public static void main(String[] args) {
		List<Integer> al=new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(20);
		al.add(20);
		al.add(10);
		al.add(30);
		al.add(30);
		
		Set<Integer> set=new LinkedHashSet<>(al);
		al=new ArrayList<>(set);
		System.out.println(al);
		

	}

}
