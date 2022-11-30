package com.masai.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InfiniteLoopInCollection {

	public static void main(String [] args) {
		List<Student> students=new ArrayList<>();
		Scanner sc=new Scanner(System.in);	
		int count=1;
		while(true) {
			System.out.println("Enter details of student "+count++);
			System.out.println("Enter name : ");
			String name=sc.next();
			System.out.println("Enter roll : ");
			int roll=sc.nextInt();
			System.out.println("Enter marks : ");
			int marks=sc.nextInt();
			
			Student student=new Student(roll,name,marks);
			students.add(student);
			
			System.out.println("Do you want more(y/n) : ");
			String choice =sc.next();
			if(choice.equalsIgnoreCase("n")) break;
		}
		System.out.println("Details of all the student");
		for(Student s:students) System.out.println(s);
	}

}
