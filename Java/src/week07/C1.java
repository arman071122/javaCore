package week07;

public class C1 extends C2 implements I1 {

    @Override
    public void a() {
	System.out.println("This is function a");
    }

    @Override
    public void b() {
	System.out.println("This is function b");
    }

    public static void main(String[] args) {
	C1 c1 = new C1();
	c1.a();
	c1.b();
	c1.x();
	c1.y();
    }
}
