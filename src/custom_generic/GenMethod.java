package custom_generic;

public class GenMethod {
	public static <E> void printArr(E [] arr) {
		System.out.println("I am inside the printArr");
		for(E ele: arr) {
			System.out.println(ele);
		}
	}

	public static void main(String[] args) {
		int [] nums= {1,2,3,4,5,6,7};
		String [] names= {"Ram","Mohan","Keshav","Sudhanshu"};
		Character [] chars= {'a','b','c','d'};
		printArr(names);
		printArr(chars);
	}

}
