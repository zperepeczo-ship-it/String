package strings;

public class ExtraPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] s = new String[] { "ala", "wisia", "wisia", "kasia", "misia" };

		System.out.println(indexOfAlphabeticallyBiggestWord(s, false));
	}

	public static void printTenByTen() {
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
		int big = 0;
		for (int i = 1; i < s.length; i++) {
			if (s[i].compareTo(s[big]) >= 0) {
				big = i;
			}
		}
		String temp = s[big];
		s[big]=s[s.length];
		s[s.length]=temp;
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
