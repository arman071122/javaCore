package week6;

public class New2 {
    public static void main(String[] args) {
	Vehicle v = new Alto1();
	v.speed();
	v.brand();
	Alto1 a = (Alto1) v;
	System.out.println(a.noofwheels);
	a.brand();
    }
}
