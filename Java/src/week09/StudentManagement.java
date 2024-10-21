package week09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Student implements Comparable<Student> {
    String name;
    int grade;

    public Student(String name, int grade) {
	this.name = name;
	this.grade = grade;
    }

    @Override
    public String toString() {
	return "Student [name = " + name + ", grade = " + grade + "]";
    }

    @Override
    public int compareTo(Student s) {
	return this.name.compareTo(s.name);
    }
}

public class StudentManagement {
    static ArrayList<Student> studentList = new ArrayList<Student>();

    public static void addStudents(String name, int grade) {
	studentList.add(new Student(name, grade));
    }

    public static void displayStudents() {
	for (Student student : studentList)
	    System.out.println(student);
    }

    public static void removeStudents(String name) {
	for (int i = 0; i < studentList.size(); i++) {
	    if (studentList.get(i).name.equalsIgnoreCase(name)) {
		studentList.remove(i);
		System.out.println(name + " has been removed.");
		return;
	    }
	}
	System.out.println("Student not found.");
    }

    public static void searchStudent(String name) {
	for (int i = 0; i < studentList.size(); i++) {
	    if (studentList.get(i).name.equalsIgnoreCase(name)) {
		System.out.println(studentList.get(i));
		return;
	    }
	}
	System.out.println("Student not found.");
    }

    public static void sortStudents() {
	Collections.sort(studentList);
    }

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int ch;

	do {
	    System.out.println("Enter ur choice\n");
	    System.out.println("1. Add Student");
	    System.out.println("2. Display Student");
	    System.out.println("3. Remove Student");
	    System.out.println("4. Search Student");
	    System.out.println("5. Sort by Student name");
	    System.out.println("6. Exit\n");
	    ch = sc.nextInt();

	    switch (ch) {
	    case 1: {
		System.out.println("Please enter student name and grade\n");
		String name = sc.next();
		int grade = sc.nextInt();
		addStudents(name, grade);
		break;
	    }
	    case 2: {
		System.out.println("Displaying all students details....\n");
		displayStudents();
		break;
	    }
	    case 3: {
		System.out.println("Please enter the name of student to remove\n");
		String name = sc.next();
		removeStudents(name);
		break;
	    }
	    case 4: {
		System.out.println("Please enter the name of student to search\n");
		String name = sc.next();
		searchStudent(name);
		break;
	    }
	    case 5: {
		System.out.println("Sorting the student list by name in ascending order....\n");
		sortStudents();
		break;
	    }
	    default:
		if (ch == 6)
		    System.out.println("Gud bie");
		else
		    System.out.println("Invalid input");
	    }
	} while (ch != 6);
    }
}
