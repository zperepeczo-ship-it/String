package strings;

public class Morestrings {

	public static void main(String[] args) {
		System.out.println(howManyOfTheseWords("alAla ma kotala","AlA"));
	}
	
	public static String[] outputWords(String s) {
		String[] a = s.split(" ");
		for (int i = 0; i < a.length; i++) {
			if (!Character.isLetterOrDigit(a[i].charAt(a[i].length() - 1))) {
				a[i] = a[i].substring(0, a[i].length() - 1);
			}
		}
		return a;
	}

	public static String everySecondLetterCapital(String s) {
		int c = 2;
		String a = "";
		for (int i = 0; i < s.length(); i++) {
			if (Character.isLetter(s.charAt(i))) {
				if (c % 2 == 0) {
					a = a + (s.charAt(i) + "").toUpperCase();
				} else
					a = a + (s.charAt(i) + "").toLowerCase();
				c++;
			} else
				a = a + (s.charAt(i));
		}
		return a;
	}

	public static int howManyOfTheseWords(String s, String word) {
		String sLower = s.toLowerCase();
		String wordLower = word.toLowerCase();
		int c = 0;
		for (int i = 0; i <= s.length() - word.length(); i++) {
			if (wordLower.equals(sLower.substring(i, i + wordLower.length())))
				c++;
		}
		return c;
	}

	public static String[] returnBiggerWord(String s[], String a) {
		String x[] = new String[s.length];
		int c = 0;
		for (int i = 0; i < s.length; i++) {
			if (s[i].compareTo(a) > 0) {
				x[c] = s[i];
				c++;
			}
		}
		if (c == 0) {
			return null;
		}
		String[] b = new String[c];
		for(int i = 0; i < c; i++){
			b[i] = x[i];
		}
		return b;
	}

	public static String[] orderWordsAscending(String a[]) {

		for (int k = 0; k < a.length - 1; k++) {
			for (int i = 0; i < a.length - 1; i++) {
				if (a[i].compareTo(a[i + 1]) > 0) {
					String temp = a[i];
					a[i] = a[i + 1];
					a[i + 1] = temp;
				}
			}
		}
		return a;
	}

	public static String[] sortTwoSortedArraysIntoOne(String s[], String t[]) {
		String u[] = new String[s.length + t.length];
		int i = 0, j = 0, c = 0;
		
		
		
		while (c < s.length + t.length) {
			if(i > s.length - 1){
				u[c] = t[j];
				j++;
			}
			else if (j > t.length - 1){
				u[c] = s[i];
				i++;
			}
			else if (s[i].compareTo(t[j]) > 0) {
				u[c] = s[i];
				i++;
			} 
			else {
				u[c] = t[j];
				j++;
			}
			c++;
		
			}
		
		return u;
	
}
}
