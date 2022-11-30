import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;



public class _5SortingCollectionLogic2 {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(3,13,3,5,16,7,7,17,6,5,8);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		System.out.println(Collections.max(list));
		
		List<Student> students=new ArrayList<>();
		students.add(new Student(01,"n8",1000));
		students.add(new Student(05,"n2",700));
		students.add(new Student(06,"n3",300));
		students.add(new Student(01,"n5",1000));
		students.add(new Student(07,"n4",800));
		
		
		Comparator<Student> com2=(s1,s2)->s1.getMarks()>s2.getMarks()? +1:-1;
		
//		TreeSet<Student> ts=new TreeSet<>(com2);
//		ts.addAll(students);
		
		// without using comparator
		System.out.println(students);
		Collections.sort(students,com2);
		System.out.println(students);
		System.out.println(Collections.max(students,com2));
		

	}

}
