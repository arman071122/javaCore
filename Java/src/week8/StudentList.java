package week8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class Student {
    String name;
    int rno;

    public Student(String name, int rno) {
	this.name = name;
	this.rno = rno;
    }

    @Override
    public String toString() {
	return "Student [name=" + name + ", roll number = " + rno + "]";
    }
}

public class StudentList {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the roll number : ");
	int rno = sc.nextInt();
	boolean found = false;

	Student s1 = new Student("Arman", 1);
	Student s2 = new Student("Fijo", 2);
	Student s3 = new Student("Rohan", 3);
	Student s4 = new Student("Shreyas", 4);

	ArrayList<Student> students = new ArrayList<Student>();
	students.add(s1);
	students.add(s2);
	students.add(s3);
	students.add(s4);

	Iterator<Student> itr = students.iterator();
	while (itr.hasNext()) {
	    Student student = itr.next();
	    if (student.rno == rno) {
		found = true;
		System.out.println(student);
	    }
	}
	if (!found)
	    System.out.println("Student not found");
    }
}
