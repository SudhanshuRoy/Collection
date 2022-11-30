import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class _3CollectionsClass {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(3,3,3,5,6,7,7,7,6,5,8);
		Set<Integer> set=new LinkedHashSet(list);
		set.forEach(e->{
			int x=Collections.frequency(list, e);
			System.out.println(e+" "+x);
		});

	}

}
