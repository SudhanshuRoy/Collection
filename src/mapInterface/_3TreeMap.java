package mapInterface;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import com.masai.arraylist.Student;

public class _3TreeMap {

	public static void main(String[] args) {
		Comparator<Student> comp=(s1,s2)->s1.getMarks()>s2.getMarks()?+1:-1;
		TreeMap<Student,String> tm=new TreeMap<Student,String>(comp);
		tm.put(new Student(1,"ram",345), "up");
		tm.put(new Student(5,"shyam",845), "bihar");
		tm.put(new Student(10,"monu",545), "himachal");
		tm.put(new Student(8,"arjun",645), "bangal");
		tm.put(new Student(6,"pawan",345), "up");
		Set<Map.Entry<Student,String>> set =tm.entrySet();
		
		for(Map.Entry<Student,String> kv:set){
			System.out.println(kv.getKey()+" "+kv.getValue());
		}
	}

}
