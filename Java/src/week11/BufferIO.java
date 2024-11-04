package week11;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferIO {
    public static void main(String[] args) throws IOException {
	File input = new File("Files/input.txt");
	File output = new File("Files/output.txt");

	FileOutputStream fo = new FileOutputStream(output);
	BufferedOutputStream bo = new BufferedOutputStream(fo);

	String message = "Hi guys";
	byte[] m = message.getBytes();
	bo.write(m);

	FileInputStream fi = new FileInputStream(input);
	BufferedInputStream bi = new BufferedInputStream(fi);
	byte[] allBytes = bi.readAllBytes();
	String s = new String(allBytes);
    }
}
