package week08;

import java.util.Comparator;

public class nameAsc implements Comparator<StudentDetails> {

    @Override
    public int compare(StudentDetails o1, StudentDetails o2) {
	return o2.name.compareTo(o1.name);
    }
}
