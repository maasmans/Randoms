import java.util.Arrays;
import java.util.Random;

public class ZesNietDezelfdeGetallen {
	public static void main(String[] args) {
		int[] array = new int[6];
		vulArrayMetCheck(array);
		System.out.println(Arrays.toString(array));
		
	}

	public static int randomGetal() { // getall tussen 0 en 9 dus 10 mogelijkheden.
		Random r = new Random();
		return r.nextInt(10);
	}

	public static int[] vulArray(int[] array) {
		for (int i = 0; i < array.length; i++) {// loopt zes keer omdat de lengte 6
			array[i] = randomGetal();
		}
		return array;
	}

	public static boolean checkOfGetalInArray(int[] array, int teCheckenGetal) {
		boolean zitErNietIn = true;
		for (int getal : array) {
			if (getal == teCheckenGetal) {
				zitErNietIn = false;
			}
		}
		return zitErNietIn;

	}

	public static int[] vulArrayMetCheck(int[] array) {
		for (int i = 0; i < array.length; i++) {// loopt zes keer omdat de lengte 6
			int nieuwGetal = randomGetal();
			if (checkOfGetalInArray(array, nieuwGetal)) {
				array[i] = nieuwGetal;
			}
		}
		return array;
	}
}
