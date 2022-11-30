import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseList {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(3,8,9,5,6,7,1,2);
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
		

	}

}
