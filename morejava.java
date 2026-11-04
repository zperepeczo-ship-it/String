package darrays;

import java.util.Arrays;

public class morejava {

	public static void main(String[] args) {
		int[][] a = //
				{ //
						{ 3, -8, -9, 4 }, //
						{ 4, 2, 3, 3 }, //
						{ 4, 5, 6, -2 } //
				}; // i is rows and k columns

		int[][] a1 = //
				{ //
						{ 1, 0, 0, 0 }, //
						{ 0, 1, 0, 0 }, //
						{ 0, 0, 1, 2 } //
				}; // i is rows and k columns

//		for (int[] c : a1) {
//			System.out.println(Arrays.toString(c));
//		}

		System.out.println();

//
//		System.out.println();
//
		for (int[] c : a) {
			System.out.println(Arrays.toString(c));
		}

		int[] coords = getNthLargestElementCoordinates(a, 3);

		System.out.println(coords[0] + ", " + coords[1]);

//
//		System.out.println();
//
//		System.out.println(biggestAverageOfColumns(a));
//
//		System.out.println();
//
//		System.out.println(Arrays.toString(sumEchDiagonalColumns(a)));
//
//		System.out.println(maxValueInWhichRow(a));
//
//		System.out.println();
//
//		System.out.println(sumOfAllMaxValuesInRows(a));
//
//		int[][] b = changeRowsAndColumnsMatrixTranspositions(a);
//
//		System.out.println();
//
//		System.out.println(biggestAverageOfColumns(b));
//
//		System.out.println();
//
//		for (int i = 0; i < b.length; i++) {
//			System.out.println(Arrays.toString(b[i]));
//		}
//
//		System.out.println();
//
//		for (int[] c : b) {
//			System.out.println(Arrays.toString(c));
//		}
//
//		System.out.println();
//
//		System.out.println(maxValueInWhichRow(b));
//
//		System.out.println();
//
//		System.out.println();
//
//		System.out.println(sumOfAllMaxValuesInRows(b));
//
//		System.out.println();
//
//		int[][] d = sumOfTwo2dArrays(a, a1);
//
//		for (int[] c : d) {
//			System.out.println(Arrays.toString(c));
//		}
//
//		System.out.println();
//
//		int[][] e = productOfTwo2dArrays(b, a);
//
//		for (int[] c : e) {
//			System.out.println(Arrays.toString(c));
//		}
//
//		System.out.println();
//
//		System.out.println(biggestAverageOfColumns(a));

	}

	public static int[] sumEchDiagonalColumns(int[][] a) {
		int[] eachDiagonalSum = new int[a[0].length];
		for (int diagonal = 0; diagonal < a[0].length; diagonal++) {
			eachDiagonalSum[diagonal] = 0;
			for (int elementInDiagonal = 0; elementInDiagonal < a.length; elementInDiagonal++) {
				eachDiagonalSum[diagonal] += a[elementInDiagonal][(elementInDiagonal + diagonal) % a[0].length];
			}
		}

		return eachDiagonalSum;
	}

	public static int[][] changeRowsAndColumnsMatrixTranspositions(int[][] a) {
		int b[][] = new int[a[0].length][a.length];
		for (int columns = 0; columns < a.length; columns++) {
			for (int rows = 0; rows < a[0].length; rows++) {

				b[rows][columns] = a[columns][rows];
			}
		}
		return b;
	}

	public static int maxValueInWhichRow(int[][] a) {
		int maxNumber = a[0][0];
		int maxIndex = 0;
		for (int rows = 0; rows < a.length; rows++) {
			for (int columns = 0; columns < a[0].length; columns++) {
				if (maxNumber < a[rows][columns]) {
					maxNumber = a[rows][columns];
					maxIndex = rows;

				}
			}
		}
		return maxIndex;

	}

	public static int sumOfAllMaxValuesInRows(int[][] a) {
		int sum = 0;
		int maxNumber;
		for (int rows = 0; rows < a.length; rows++) {
			maxNumber = a[rows][0];
			for (int columns = 1; columns < a[0].length; columns++) {
				if (maxNumber < a[rows][columns]) {
					maxNumber = a[rows][columns];
				}

			}
			sum = sum + maxNumber;
		}

		return sum;
	}

	public static int sumOfAllMaxValuesColumns(int[][] a) {

		return (sumOfAllMaxValuesInRows(changeRowsAndColumnsMatrixTranspositions(a)));
	}

	public static int[][] sumOfTwo2dArrays(int[][] a, int[][] c) {
		int b[][] = new int[a.length][a[0].length];
		for (int rows = 0; rows < a.length; rows++) {
			for (int columns = 0; columns < a[0].length; columns++) {
				b[rows][columns] = a[rows][columns] + c[rows][columns];
			}
		}
		return b;
	}

	public static int[][] productOfTwo2dArrays(int[][] a1, int[][] a2) {
		int product[][] = new int[a1.length][a2[0].length];
		for (int rows = 0; rows < product.length; rows++) {
			for (int columns = 0; columns < product[0].length; columns++) {
				for (int sth = 0; sth < a1[0].length; sth++) {
					product[rows][columns] += a1[rows][sth] * a2[sth][columns];
				}
			}
		}
		return product;
	}

	public static double biggestAverageOfColumns(int[][] a) {
		double c[] = new double[a[0].length];
		for (int columns = 0; columns < a[0].length; columns++) {
			double avg = 0;
			for (int rows = 0; rows < a.length; rows++) {
				avg = avg + a[rows][columns];
			}
			c[columns] = avg / a.length;
		}
		double max = c[0];
		for (int j = 0; j < c.length; j++) {
			if (max < c[j]) {
				max = c[j];
			}
		}
		return max;
	}

	public static int[] getNthLargestElementCoordinates(int[][] a, int n) {

		if (n > a.length * a[0].length || n <= 0) {
			return null;
		}
		int max;
		int min = a[0][0];

		for (int row = 0; row < a.length; row++) {
			for (int column = 0; column < a[0].length; column++) {
				if (a[row][column] < min) {
					a[row][column] = min;
				}
			}
		}

		int k;
		int[] b = new int[2];
		int[] c = new int[n];
		for (int i = 0; i < n; i++) {
			max = min;
			k = 0;
			for (int row = 0; row < a.length; row++) {
				for (int column = 0; column < a[0].length; column++) {
					if (a[row][column] > max) {
						if (k < i && c[k] == a[row][column]) {
							k++;
						} else {
							a[row][column] = max;
							b[0] = row;
							b[1] = column;
						}
					}
				}
			}
			c[i] = max;
		} // end of for loop which increases variable i lol xd
		return b;
	}

}
