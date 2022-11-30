package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class _1Demo {

	public static void main(String[] args) {
		List<Integer> nums=Arrays.asList(6,5,2,8,1);
		Stream<Integer> data=nums.stream();
		Stream<Integer> mappedData=data.map(n->n*2);
		
//		Stream sortedData=data.sorted();
		
//		data.forEach(d->System.out.println(d));
		
//		sortedData.forEach(d->System.out.println(d));
//		mappedData.forEach(n->System.out.println(n));
		nums.stream().map(n->n*2).filter(n->n>8).forEach(n->System.out.println(n));
		

	}

}
