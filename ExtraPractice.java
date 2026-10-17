package strings;

import java.util.Arrays;

public class ExtraPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] s = new String[] { "cala", "ala", "wisia", "bisia", "cala", "kasia", "misia", "cala" };

		zadanie();
		int[] index = returnAllIndexesOfReoccuringName(s, "cala");

		System.out.println(Arrays.toString(index));

		orderAscendingMaxValueInsertionSort(s);
		// orderAscendingMaxValueSelectionSort(s);
		System.out.println(Arrays.toString(s));

		// System.out.println(indexOfAlphabeticallyBiggestWord(s, false));

		
	}

	public static void printXByX(int x) {
		for (int i = 1; i <= x; i++){
			for (int j =1; j<=x;j++){
			System.out.printf("%4d", i*j);
			}
				
			System.out.println();
	}
	}
	
	public static void zadanie() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

	public static int indexOfAlphabeticallyBiggestWord(String s[], boolean returnFirst) {
		int big = 0;
		for (int i = 1; i < s.length; i++) {
			if (returnFirst) {
				if (s[i].compareTo(s[big]) > 0) {
					big = i;
				}
			} else {
				if (s[i].compareTo(s[big]) >= 0) {
					big = i;
				}
			}
		}
		return big;

	}

	public static void orderAscendingMaxValueSelectionSort(String s[]) {
		for (int j = 0; j < s.length - 1; j++) {
			int big = 0;
			for (int i = 1; i < s.length - j; i++) {
				if (s[i].compareTo(s[big]) >= 0) {
					big = i;
				}
			}
			String temp = s[big];
			s[big] = s[s.length - 1 - j];
			s[s.length - 1 - j] = temp;
		}
	}

	public static void orderAscendingMaxValueInsertionSort(String s[]) {
		for (int i = 1; i < s.length; i++) {
			int c = i;
			while (c > 0 && s[c].compareTo(s[c - 1]) < 0) {
				String temp = s[c];
				s[c] = s[c - 1];
				s[c - 1] = temp;
				c--;
			}
		}
	}

	public static int[] returnAllIndexesOfReoccuringName(String s[], String name) {
		int c = 0;
		for (int i = 0; i < s.length; i++) {
			if (s[i].equals(name)) {
				c++;

			}
		}
		if (c == 0) {
			return null;
		}
		int[] b = new int[c];
		int k = 0;
		for (int i = 0; i < s.length; i++) {

			if (s[i].equals(name)) {
				b[k] = i;
				k++;
			}
		}
		return b;
	}
}
