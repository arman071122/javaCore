package week6;

abstract class MSOffice {
    abstract void createNewFile();
}

class Word extends MSOffice {
    void createNewFile() {
	System.out.println("Creating a new Word document...");
    }
}

class Excel extends MSOffice {
    void createNewFile() {
	System.out.println("Creating a new Excel spreadsheet...");
    }
}

class PowerPoint extends MSOffice {
    void createNewFile() {
	System.out.println("Creating a new PowerPoint presentation...");
    }
}

public class OfficeApplication {
    public static void main(String[] args) {

	MSOffice msOffice1 = new Word(); // upcasting
	MSOffice msOffice2 = new Excel();
	MSOffice msOffice3 = new PowerPoint();

	msOffice1.createNewFile();
	msOffice2.createNewFile();
	msOffice3.createNewFile();

	Word word = (Word) msOffice1; // downcasting
	System.out.println("\nThis is a Word object.");

	Excel excel = (Excel) msOffice2;
	System.out.println("This is an Excel object.");

	PowerPoint powerPoint = (PowerPoint) msOffice3;
	System.out.println("This is a PowerPoint object.");
    }
}
