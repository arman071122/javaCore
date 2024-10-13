package week8;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentListForEach {
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

	for (Student student : students) {
	    if (student.rno == rno) {
		System.out.println(student);
		found = true;
		break;
	    }
	}
	if (!found)
	    System.out.println("Student not found");
    }
}
