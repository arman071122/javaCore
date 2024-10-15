package week8;

import java.util.Comparator;

public class rollnoasc implements Comparator<StudentDetails> {

    @Override
    public int compare(StudentDetails o1, StudentDetails o2) {
	// TODO Auto-generated method stub
	return o1.rno - o2.rno;
    }

}