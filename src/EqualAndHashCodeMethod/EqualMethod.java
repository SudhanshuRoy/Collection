package EqualAndHashCodeMethod;

import com.masai.arraylist.Student;

public class EqualMethod {

	public static void main(String[] args) {
	   Student s1=new Student(05,"RajParsad",400);
	   Student s2=new Student(05,"RajParsad",400);
	 
       // Before overriding both is false but after overriding equals and hashcode 
	   // method second one become true;
	   System.out.println(s1==s2);
	   System.out.println(s1.equals(s2));// In case of String it would be true
	   
	   // String method internally overrides the equal method.
	   
//	   String str="Ram";
//	   String str2="Ram";
//	   String s=new String("Ram");
//	   
//	   System.out.println(str==str2);
//	   System.out.println(str.equals(str2));
//	   System.out.println(s==str);
//	   System.out.println(s.equals(str));
	   
	   
	}

}
