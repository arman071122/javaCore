package movies;

public class Mov_songs {
	public static void main(String[] args) {
		Movies mov = new Movies();
		Songs patt = new Songs();

		System.out.println("Following are some info about the movie Aavesham");
		System.out.println("*************************************************");
		mov.aavesham();
		patt.aavesham();
		System.out.println("");

		System.out.println("Following are some info about the movie Deadpool");
		System.out.println("*************************************************");
		mov.deadpool();
		patt.deadpool();
		System.out.println("");

		System.out.println("Following are some info about the movie Oppenheimer");
		System.out.println("***************************************************");
		mov.oppenheimer();
		patt.oppenheimer();
	}
}
