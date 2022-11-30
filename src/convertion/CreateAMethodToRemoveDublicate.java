package convertion;

import java.util.LinkedHashSet;
import java.util.Set;

public class CreateAMethodToRemoveDublicate {
	static String removeDuplicateCharacter(String orignal) {
//		String result=""; String is immutable so if you do any modification then a new string will be created in heap area;
		
		StringBuilder sb=new StringBuilder();
		char[] arr=orignal.toCharArray();
		
		Set<Character> lhs=new LinkedHashSet<>();
		for(char c:arr) {
			lhs.add(c);
		}
		
		for(Character c:lhs) {
			sb.append(c);
		}
		
		return sb.toString();
	}
	
	public static void main(String[] args) {
		
		String name=CreateAMethodToRemoveDublicate.removeDuplicateCharacter("RRRRAAAATTTAAAANNNN");
		System.out.println(name);
	}

}
