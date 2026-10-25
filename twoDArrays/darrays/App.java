package darrays;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author C.Student16
 */
public class App {

	public static void main(String[] args) {
		int[][] b = new int[2][2]; // 3 is rows, 2 is columns
		int[][] a = { { 3, -8, -9, 4 }, { 4, 2, 3, 3 }, { 4, 5, 6, -2 } }; // i is rows and k columns
		// int[][] a = { {1} }; // i is rows and k columns
//        fillArray(b);
//        System.out.print(toString(b));
//      System.out.println(Arrays.toString(sumOfEachRow(a)));
//      System.out.println(Arrays.toString(sumOfEachColumn(a)));
//		System.out.println(sumOfAllElements(a));
//		System.out.println(maxValue(a));
//        System.out.println(Arrays.toString(sumOfEachColumn(a)));
//        System.out.println(maxValueIndex(a));
		System.out.println(Arrays.toString(maxValueInEachRow(a)));
		
		System.out.println(Arrays.toString(sumEachDiagonal(a)));
		
		// System.out.println(Arrays.toString(maxValueEachRow2d(a)));

		System.out.println(countHowManyColumnsAreAscending(a));
	}

	public static void fillArray(int[][] x) {
		for (int i = 0; i < x.length; i++)
			for (int k = 0; k < x[i].length; k++) // x[i] is the first column
				x[i][k] = Integer.parseInt(JOptionPane.showInputDialog("Input a number:"));
	}

	public static String toString(int[][] att) {
		String d = "";
		for (int i = 0; i < att.length; i++) {
			for (int k = 0; k < att[i].length; k++) {
				d = d + " " + att[i][k];
			}
			d = d + "\n";
		}
		return d;
	}

	public static int sumOfAllElements(int[][] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			for (int k = 0; k < a[i].length; k++) {
				sum = sum + a[i][k];
			}
		}
		return sum;
	}

	public static int[] sumOfEachRow(int[][] a) {
		int[] b = new int[a.length];
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			for (int k = 0; k < a[i].length; k++) {
				sum = sum + a[i][k];
			}
			b[i] = sum;
			sum = 0;
		}
		return b;
	}

	public static int[] sumOfEachColumn(int[][] a) {
		int[] b = new int[a[0].length];
		int sum = 0;
		int j = 0;
		for (int k = 0; k < a[0].length; k++) {
			for (int i = 0; i < a.length; i++) {
				sum = sum + a[i][k];
			}
			b[j] = sum;
			sum = 0;
			j++;
		}
		return b;
	}

	public static int maxValue(int[][] a) {
		int max = a[0][0];
		for (int k = 0; k < a[0].length; k++) {
			for (int i = 0; i < a.length; i++) {
				if (a[i][k] > max) {
					max = a[i][k];
				}

			}
		}
		return max;
	}

	public static int[] maxValueInEachRow(int[][] a) {
		int[] maxValInRow = new int[a.length];
		for (int row = 0; row < a.length; row++) {
			maxValInRow[row] = a[row][0];
			for (int column = 0; column < a[0].length; column++) {
				if (a[row][column] > maxValInRow[row]) {
					maxValInRow[row] = a[row][column];
				}
			}
		}
		return maxValInRow;
	}

	public static int countHowManyColumnsAreAscending(int[][] a) {
		int c = 0;
		int i = 0;
		for (int k = 0; k < a[0].length; k++) {
			i = 0;
			while (i < a.length - 1 && a[i][k] < a[i + 1][k]) {
				i++;
			}
			if (i == a.length - 1) {
				c++;
			}
		}
		return c;
	}

	public static int maxValue1d(int[] row) {
		int max = row[0];
		for (int i = 1; i < row.length; i++)
			max = max < row[i] ? row[i] : max;
		return max;
	}

	public static int[] maxValueEachRow2d(int[][] array2d) {
		int[] max = new int[array2d.length];
		for (int i = 0; i < array2d.length; i++)
			max[i] = maxValue1d(array2d[i]);
		return max;
	}

	public static int[] sumEachDiagonal(int[][] array2d) {
		int[] eachDiagonalSum = new int[array2d.length];
		for (int diagonal = 0; diagonal < array2d.length; diagonal++) {
			eachDiagonalSum[diagonal] = 0;
			for (int column = 0; column < array2d[0].length; column++) {
				eachDiagonalSum[diagonal] += array2d[(diagonal+column) % array2d.length][column];
			}
		}
		return eachDiagonalSum;
	}

}
