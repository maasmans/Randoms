import java.util.Arrays;
import java.util.Random;

// MAAK PROGRAMMA DAT 6 verschillende getallen in array gooit waarbij de getallen 1 tot 9 met output 

public class RandomArray {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(vierRandomGetallenArray()));
	}
	// Creeer random getal

	public static int randomGetal() { // getall tussen 0 en 9 dus 10 mogelijkheden.
		Random r = new Random();
		return r.nextInt(10);	
	}
	
	public static String vierGetallenNaarString(int a, int b, int c, int d) {
		String vierGetallen = Integer.toString(a) + " " + Integer.toString(b) + " " + Integer.toString(c) + " " + Integer.toString(d);
		return vierGetallen;
	}
	public static String vierRandomGetallenString() {
		return vierGetallenNaarString(randomGetal(),randomGetal(),randomGetal(),randomGetal());
	}
	public static int[] vierRandomGetallenArray() {
		int[] vierRandomGetallenArray = {randomGetal(),randomGetal(),randomGetal(),randomGetal()};
		return vierRandomGetallenArray;
	}
	
}
