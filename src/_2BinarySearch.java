import java.util.Arrays;

public class _2BinarySearch {

	public static void main(String[] args) {
		int [] arr= {82,8,9,3,55,10,42};
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		int x=Arrays.binarySearch(arr,82);
		System.out.println(x);
		
		
		

	}

}
