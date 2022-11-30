package comparator;

import java.util.TreeSet;

public class _1Demo {

	public static void main(String[] args) {
		
		StudentsMarksComp smc=new StudentsMarksComp();
		StudentsNameComp snc=new StudentsNameComp();
		TreeSet<Student> ts=new TreeSet<>(snc);
		ts.add(new Student(01,"n8",1000));
		ts.add(new Student(05,"n2",700));
		ts.add(new Student(06,"n3",300));
		ts.add(new Student(01,"n5",1000));
		ts.add(new Student(07,"n4",800));
		ts.forEach(s->System.out.println(s));

	}

}
