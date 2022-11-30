import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class _1ToolClass {

	public static void main(String[] args) {
		// Arrays and collections class belongs utility class and also know as helper class
		
		List<Integer> list= Arrays.asList(2,3,5,5,3,3,8);
		
		Set<Integer> set=new LinkedHashSet(list);
		System.out.println(list);
		System.out.println(set);
		
		List<String> cities=Arrays.asList("muz","Kol","mumbai","goa","pune","delhi","patna");
		System.out.println(cities);
		
		System.out.println(list.getClass().getName());

	}

}
