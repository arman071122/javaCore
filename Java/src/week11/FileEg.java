package week11;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileEg {
    public static void main(String[] args) throws IOException {

//	File in = new File("C:\\Users\\user\\OneDrive\\Desktop\\New folder\\file.txt");
	File file1 = new File("Files/file.txt");
	File file2 = new File("Files/file2.txt");

	System.out.println(" File Creation");
	System.out.println("***************");

	if (file1.createNewFile())
	    System.out.println("Created file : " + file1.getName() + "\n");
	else
	    System.out.println(file1.getName() + " Already exist\n");

	if (file2.createNewFile())
	    System.out.println("Created file : " + file2.getName() + "\n");
	else
	    System.out.println(file2.getName() + " Already exist\n");

	System.out.println(" File Deletion");
	System.out.println("***************");

	if (file2.delete())
	    System.out.println(file2.getName() + " successfully deleted\n");
	else
	    System.out.println("File not found\n");

	System.out.println(" File Exist or not");
	System.out.println("*******************");

	if (file2.exists())
	    System.out.println(file2.getName() + " exists\n");
	else
	    System.out.println(file2.getName() + " Not Found\n");

	System.out.println(" File can read or write");
	System.out.println("************************");

	if (file1.canRead()) {
	    System.out.print(file1.getName() + " is readable and its contents are ");
	    Scanner sc = new Scanner(file1);
	    String s = sc.nextLine();
	    System.out.print(s);
	    System.out.println();
	} else
	    System.out.println(file1.getName() + " is not readable\n");

	System.out.println();
	if (file1.canWrite())
	    System.out.println(file1.getName() + " is writable\n");

	else
	    System.out.println(file1.getName() + " is not writable\n");

	System.out.println(" File InputStream");
	System.out.println("******************");

	FileInputStream fin = new FileInputStream(file1);// or give file path
	System.out.println();

	int read1;
	while ((read1 = fin.read()) != -1)
	    System.out.print((char) read1);
	fin.close();

	System.out.println("\n\n File OutputStream");
	System.out.println("******************");

	FileOutputStream fout = new FileOutputStream(file1, true);// append=true
	String s = "hello world ";
	byte[] arr = s.getBytes();
	fout.write(arr);
	System.out.println("\nSuccessfully Written\n");
	fout.close();

	System.out.println(" File to File");
	System.out.println("******************");

	FileInputStream fin2 = new FileInputStream(file1);
	FileOutputStream fout2 = new FileOutputStream(file2, true);

	int read2;
	while ((read2 = fin2.read()) != -1)
	    fout2.write(read2);
	System.out.println("Contents copied from " + file1.getName() + " to " + file2.getName());
	fin2.close();
	fout2.close();

	System.out.println("\n File InputStream");
	System.out.println("******************");

    }
}
