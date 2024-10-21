package week01;

public class mutablity {
	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder("Hallo"); // mutable
		System.out.println(sb.append("hai"));
		System.out.println(sb);

		System.out.println("");

		String s = new String("bie"); // immutable
		System.out.println(s.concat("hai"));
		System.out.println(s);

		System.out.println("");

		StringBuffer bf = new StringBuffer("Poda"); // mutable
		System.out.println(bf.append("armane"));
		System.out.println(bf);

	}
}
