package TreeSet;

public class Student implements Comparable<Student>{
private int roll;
private String name;
private int marks;
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
public Student(int roll, String name, int marks) {
	super();
	this.roll = roll;
	this.name = name;
	this.marks = marks;
}
public int getRoll() {
	return roll;
}
public void setRoll(int roll) {
	this.roll = roll;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getMarks() {
	return marks;
}
public void setMarks(int marks) {
	this.marks = marks;
}
@Override
public String toString() {
	return "Students [roll=" + roll + ", name=" + name + ", marks=" + marks + "]";
}
@Override
public int compareTo(Student s) {
	if(this.marks>s.marks) return +1;
	else if(this.marks<s.marks) return -1;
	else return this.name.compareTo(s.name);
}

}
