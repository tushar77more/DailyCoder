package com.dailycoder.may_30_2021;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StudentWithHighestMarks {

	public static void main(String[] args) {
		
		Student s1= new Student(1, "Tom", 90);
		Student s2= new Student(2, "peter", 80);
		Student s3= new Student(3, "Lisa", 95);
		Student s4= new Student(4, "Robby", 100);
		Student s5= new Student(5, "Tushar", 50);
		
		//add all the students to list
		
		List<Student> list = new ArrayList<>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		
		System.out.println("Input student list ");
		
		list.stream().forEach(student -> System.out.println(""+student));
		
		System.out.println("\n\n\n\nStudent list with marks greater than 80 ---------> ");
		
		list.stream().filter(ele -> ele.getMarks()>80).forEach(student -> System.out.println(""+student));
		
		System.out.println("\n\n\n\nGet first Student after sprting by name ---------> ");
		
		Optional<Student> s = list.stream().sorted((a,b) -> a.getName().compareTo(b.getName())).findFirst();
		
		System.out.println(" "+s);
		
		
		System.out.println("\n\n\n\nStudent with highest marks ---------> ");
		
		int maxMarks = list.stream().map(e -> e.getMarks()).max(Integer::compare).get();
		
		System.out.println(" "+maxMarks);
		
		System.out.println("\n\n\n\nPrint Student details with highest marks ---------> ");
		
		Optional<Student> ss = list.stream().filter(ele -> ele.getMarks()==maxMarks).findFirst();
		
		System.out.println(" "+ss.get());
		

	}

}


class Student{
	
	int rollNo;
	String name;
	int marks;
	
	public Student(int rollNo, String name, int marks) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
	}
	
	public int getRollNo() {
		return rollNo;
	}

	public String getName() {
		return name;
	}

	public int getMarks() {
		return marks;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", marks=" + marks + "]";
	}
	
	
}
