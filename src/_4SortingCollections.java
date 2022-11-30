import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class _4SortingCollections {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(3,3,3,5,6,7,7,7,6,5,8);
		
		Comparator<Integer> com=(i1, i2)->(i1>i2)? +1:-1;
		
		TreeSet<Integer> ts=new TreeSet(com);
		ts.addAll(list);
		System.out.println(ts);

	}

}
