package mapInterface;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import com.masai.arraylist.Student;

public class _2weproblem {
	public static void main(String[] args) {
		
		HashMap<String,Student> hm = new HashMap<>();
		
		hm.put("Maharastra",new Student(10,"Ganesh",950));
		hm.put("Tamilnadu",new Student(12,"Surya",850));
		hm.put("Telangana",new Student(15,"Venkat",920));
		hm.put("Haryana",new Student(16,"Dinesh",910));
		hm.put("Kerla",new Student(18,"Srinu",880));
		
		Set<String> cities=hm.keySet();	
		Collection<Student> students= hm.values();
		// If you want list of all the students
		
//		List<Student> list=new ArrayList<>(students);
		Comparator<Student> comp=(s1,s2)->s1.getMarks()>s2.getMarks()? -1:+1;
		TreeSet<Student> ts=new TreeSet<>(comp);
		ts.addAll(students);
		
		// Printing state wise Student;
		
		Set<Map.Entry<String,Student>> set=hm.entrySet();
		
		for(Map.Entry<String, Student> em:set) {
			System.out.println("Topper of the State : "+em.getKey());
			System.out.println("***************************");
			System.out.println("Roll : "+em.getValue().getRoll());
			System.out.println("Name : "+em.getValue().getName());
			System.out.println("marks : "+em.getValue().getMarks());
		}
		
		// Printing state wise topper in ascending order of their marks
		System.out.println("***********Jay Shree Ram****************");
		for(Student s:ts) {
			for(Map.Entry<String,Student> kv:set) {
				if(kv.getValue().equals(s)) {
					System.out.println("Topper of State : "+kv.getKey());
					System.out.println("*********************");
					System.out.println("Roll : "+kv.getValue().getRoll());
					System.out.println("Name : "+kv.getValue().getName());
					System.out.println("Marks : "+kv.getValue().getMarks());
					break;
				}
			}
		}
         
	}

}
