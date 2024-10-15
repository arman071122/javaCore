package week8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class StudentDetails implements Comparable<StudentDetails> {
    String name;
    int rno;

    public StudentDetails(String name, int rno) {
	this.name = name;
	this.rno = rno;
    }

    @Override
    public String toString() {
	return "Student [name = " + name + ", roll number = " + rno + "]";
    }

    @Override
    public int compareTo(StudentDetails s) {
	return this.name.compareTo(s.name);
    }

//    @Override
//    public int compareTo(Object o) {
//	StudentDetails s = (StudentDetails) o;
//	if (this.rno == s.rno)
//	    return 0;
//	else if (this.rno < s.rno)
//	    return -1;
//	else
//	    return 1;
//    }

}

public class StudentListSort {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	StudentDetails s1 = new StudentDetails("Arman", 1);
	StudentDetails s2 = new StudentDetails("Fijo", 2);
	StudentDetails s3 = new StudentDetails("Rohan", 3);
	StudentDetails s4 = new StudentDetails("Shreyas", 4);

	ArrayList<StudentDetails> studentslist = new ArrayList<StudentDetails>();
	studentslist.add(s3);
	studentslist.add(s2);
	studentslist.add(s4);
	studentslist.add(s1);

	System.out.println(" Before Sorting\n");
	for (StudentDetails student : studentslist)
	    System.out.println(student);

	Collections.sort(studentslist, new rollnoasc());
	Collections.sort(studentslist, new nameAsc());

	System.out.println("\n After Sorting\n");
	for (StudentDetails student : studentslist)
	    System.out.println(student);

    }
}
