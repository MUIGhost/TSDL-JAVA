package shri;

public class twodarray {
	public static void main(String[] args) {
		// Creating a 2D array with 3 rows and 4 columns
		int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };

		// Displaying the elements of the 2D array
		System.out.println("Elements of the 2D array:");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

		// Accessing a specific element of the 2D array
		int element = matrix[1][2];
		System.out.println("Element at index [1][2]: " + element);
	}
}
