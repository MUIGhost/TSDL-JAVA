package shri;

public class ThreeDarray {
	public static void main(String[] args) {
		// Creating a 3D array with dimensions 2x3x4
		int[][][] cube = { { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } },
				{ { 13, 14, 15, 16 }, { 17, 18, 19, 20 }, { 21, 22, 23, 24 } } };

		// Displaying the elements of the 3D array
		System.out.println("Elements of the 3D array:");
		for (int i = 0; i < cube.length; i++) {
			System.out.println("Layer " + (i + 1) + ":");
			for (int j = 0; j < cube[i].length; j++) {
				for (int k = 0; k < cube[i][j].length; k++) {
					System.out.print(cube[i][j][k] + " ");
				}
				System.out.println();
			}
			System.out.println();
		}

		// Accessing a specific element of the 3D array
		int element = cube[1][2][1];
		System.out.println("Element at index [1][2][1]: " + element);
	}
}
