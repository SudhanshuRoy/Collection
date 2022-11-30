package EqualAndHashCodeMethod;

import java.util.HashSet;
import java.util.Set;

import com.masai.arraylist.Student;

public class HashCodeMethod {

	public static void main(String[] args) {
		Set<Student> students=new HashSet<>();
		
		// You have overridden the equals method after that also you hashset not able 
		// to remove duplicate
		
		Student s1=new Student(01,"Ram",353);
		Student s2=new Student(01,"Ram",353);
		Student s3=new Student(02,"Shyam",353);
		
		students.add(s3);
		students.add(s2);
		students.add(s1);
		
		System.out.println(students.size());
		System.out.println(s1.equals(s2));
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		

	}

}
