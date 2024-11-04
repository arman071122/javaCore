package week11;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileMenu {

    static File f1 = new File("Files/files1.txt");
    static File f2 = new File("Files/file.txt");

    static void createFile() throws IOException {
	if (f1.createNewFile())
	    System.out.println("\n Successfully created file " + f1.getName());
	else
	    System.out.println(f1.getName() + " already exist\n");
    }

//    static void deleteFile() {
//	if (f1.delete())
//	    System.out.println(f1.getName() + " successfully deleted");
//	else
//	    System.out.println(f1.getName() + " not found");
//    }

    static void readFile() throws IOException {
	FileInputStream fin = new FileInputStream(f1);
	int read;
	System.out.print("Contents in " + f1.getName() + " are ");
	while ((read = fin.read()) != -1)
	    System.out.print((char) read);
	System.out.println("\n");

    }

    static void writeFile() throws IOException {
	FileOutputStream fout = new FileOutputStream(f1);
	String str = "Hi guys ";
	byte[] s = str.getBytes();
	fout.write(s);
	System.out.println(str + " successfully written to " + f1.getName() + "\n");
    }

    static void copytoFile() throws IOException {
	FileInputStream fin = new FileInputStream(f2);
	FileOutputStream fout = new FileOutputStream(f1, true);

	int read;
	while ((read = fin.read()) != -1)
	    fout.write(read);
	System.out.println("\nSuccessfully copied contents from " + f2.getName() + " to " + f1.getName());
    }

    public static void main(String[] args) throws IOException {
	createFile();
	readFile();
	writeFile();
	copytoFile();
    }
}
