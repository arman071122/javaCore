package week01;

public class Operators {
    public static void main(String[] args) {
	System.out.println("Operators in java");
	System.out.println("*****************\n");

	System.out.println("1. Unary Operators");
	System.out.println("******************\n");

	System.out.println("++ and -- \n");
	int a = 10;
	System.out.println("a = " + a);
	System.out.println("a++ gives " + a++);
	System.out.println(a + "\n");

	int b = 10;
	System.out.println("b = " + b);
	System.out.println("++b gives " + ++b);
	System.out.println(b + "\n");

	int c = 10;
	System.out.println("c = " + c);
	System.out.println("c-- gives " + c--);
	System.out.println(c + "\n");

	int d = 10;
	System.out.println("d = " + d);
	System.out.println("--d gives " + --d);
	System.out.println(d + "\n");

	a = 10;
	System.out.println(
		"(a++) + (++a) + (a--) + (--a) would give " + a++ + " + " + ++a + " + " + a-- + " + " + --a + "\n");

	System.out.println("~ (Bitwise NOT) and ! (Logical NOT)\n");// ~ inverts each bit of its operand in its binary
								    // form and ! is used to invert a boolean value like
								    // true to false and false to true
	int e = 10;
	int f = -10;
	boolean tr = true;
	boolean fl = false;
	System.out.println(e + " becomes " + ~e);
	System.out.println(f + " becomes " + ~f);
	System.out.println(tr + " becomes " + !tr);
	System.out.println(fl + " becomes " + !fl);

	System.out.println("\n 2. Arithmetic Operators");
	System.out.println("**************************");
	a = 10;
	b = 5;
	System.out.println("Addition gives " + (a + b));
	System.out.println("Subtraction gives " + (a - b));
	System.out.println("Multiplication gives " + (a * b));
	System.out.println("Division gives " + (a / b));
	System.out.println("Modulus gives " + (a % b));

	System.out.println("\n 3. Shift Operators");
	System.out.println("*********************");

	a = 10;
	System.out.println(a << 3);// Left recursion same as a * 2^3
	System.out.println(20 << 4);

	System.out.println(" ");

	System.out.println(a >> 2);// Right recursion same as a / 2^3
	System.out.println(20 >> 4);

	System.out.println("\n 4. Relational Operators");
	System.out.println("***************************");

	a = 5;
	b = 5;
	c = 9;
	System.out.println(a == b);
	System.out.println(b == c);

	System.out.println(" ");

	System.out.println(a != b);
	System.out.println(b != c);

	System.out.println(" ");

	System.out.println(a > b);
	System.out.println(b > c);
	System.out.println(b < c);

	System.out.println("");

	System.out.println(a >= b);
	System.out.println(b >= c);
	System.out.println(b <= c);

	System.out.println("");

	System.out.println("\n 5. Bitwise Operators");
	System.out.println("************************");

	System.out.println("Bitwise operators - Bitwise AND(&) Bitwise OR (|) and Bitwise XOR(^)\n");

	a = 5; // 0101 in binary
	b = 3; // 0011 in binary
	c = a & b; // 0001 in binary, which is 1 in decimal
	System.out.println(c); // Output: 1

	System.out.println("");

	c = a | b; // 0111 in binary, which is 7 in decimal
	System.out.println(c); // Output: 7

	System.out.println("");

	c = a ^ b; // 0110 in binary, which is 6 in decimal
	System.out.println(c);

	System.out.println("\n 6. Logical Operators");
	System.out.println("************************");

	System.out.println("Logical operators - Logical AND (&&) and Logical OR (||)");

	a = 5;
	b = 5;
	c = 9;

	System.out.println(a == b && b > c);
	System.out.println(a == b && b < c);
	System.out.println(a > b && b < c);

	System.out.println("");

	System.out.println(a == b || b < c);
	System.out.println(a == b || b > c);
	System.out.println(a > b || b < c);

	System.out.println("");

	System.out.println("\n 7. Ternary Operator");
	System.out.println("***********************");

	a = 5;
	b = 4;
	int min = (b < a) ? b : a; // means if (b<a) is true then b is stored into min else a
	System.out.println("Least number of both is " + min);
	int max = (a > b) ? a : b;
	System.out.println("Bigger number of both is " + max);

	System.out.println("");

	String result = (a > 0) ? "Positive" : (a < 0) ? "Negative" : "Zero"; // means if a>0 return Positive else if
									      // a<0 then return Negative if both not
									      // true the return default value Zero
	System.out.println("The number is " + result);

	System.out.println("");

	System.out.println("\n 8. Assignment Operators");
	System.out.println("***************************");

	a = 10;
	System.out.println(a += 4); // a = a+4
	a = 10;
	System.out.println(a -= 4); // a = a-4
	a = 10;
	System.out.println(a *= 4); // a = a*4
	a = 10;
	System.out.println(a /= 4); // a = a/4

	System.out.println("");

	System.out.println("\n Comparison b/w Logical && and Bitwise &");
	System.out.println("******************************************");

	a = 10;
	b = 20;
	c = 15;
	System.out.println(a > b && b > c); // && checks the second condition only if the first condition is true this
					    // is the short circuiting property
	System.out.println(a < b && b > c);
	System.out.println(a > b & b > c); // & checks the second condition nonetheless

	System.out.println("");

	b = 20;
	System.out.println(a > b && b++ > c); // first condition false so short circuited hence doesn't do the b++
	System.out.println(b);
	b = 20;
	System.out.println(a < b && b++ > c); // first condition is true hence does the b++
	System.out.println(b);
	b = 20;
	System.out.println(a > b & b++ > c); // does the b++ nonetheless
	System.out.println(b);

	System.out.println("");

	System.out.println("\n Comparison b/w Logical || and Bitwise |");
	System.out.println("*******************************************");

	a = 10;
	b = 20;
	c = 15;
	System.out.println(a < b || b > c); // || checks the second condition only if the first condition is false this
					    // is the short circuiting property
	System.out.println(a > b || b > c);
	System.out.println(a < b | b > c); // checks he second condition nonetheless

	System.out.println("");

	b = 20;
	System.out.println(a < b || b++ > c); // first condition is true hence short circuited and doesn't do b++
	System.out.println(b);
	b = 20;
	System.out.println(a > b || b++ > c); // first condition is false hence checks the second condition and does the
					      // b++
	System.out.println(b);
	b = 20;
	System.out.println(a < b | b++ > c); // does the b++ nonetheless
	System.out.println(b);
    }
}
