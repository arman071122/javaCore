package week10;

import week10.OuterClass.InnerClass;

public class ObjOuterClass {
    public static void main(String[] args) {
	InnerClass obj = new InnerClass();
//	or
	OuterClass.InnerClass obj2 = new OuterClass.InnerClass();// in this no need to import
    }

}
