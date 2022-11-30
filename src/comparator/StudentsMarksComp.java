package comparator;

import java.util.Comparator;

public class StudentsMarksComp implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		
//		return s1.getMarks()>s2.getMarks()? +1:-1;
		if(s1.getMarks()>s2.getMarks()) return +1;
		else if(s1.getMarks()<s2.getMarks()) return -1;
		else return 0;
	}

}
