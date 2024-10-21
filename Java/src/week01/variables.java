package week01;

public class variables {
    int ph = 790; // instance variable

    static int a = 2;

    void tvm() {
	int ph1 = 8590; // local variable for tvm()
	System.out.println("Armans phone num is" + ph1); // local variable only accessible by tvm() function or method
	System.out.println("Common phone number is " + ph); // instance variable declared inside the class but outside
							    // the methods can be accessed by any method in the program
    }

    void kollam() {
	int ph2 = 9658; // local variable for kollam()
//	System.out.println(ph1);
	System.out.println("Sameenas phone num is" + ph2);// local variable only accessible by kollam() function or
							  // method
	System.out.println("Common phone number is " + ph);// instance variable declared inside the class but outside
							   // the methods can be accessed by any method in the program
    }

    public static void main(String[] args) {
	variables arm = new variables();
	System.out.println(a);
	arm.tvm();
	arm.kollam();
    }

}
