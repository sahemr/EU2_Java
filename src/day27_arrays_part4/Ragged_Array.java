package day27_arrays_part4;

public class Ragged_Array {

	public static void main(String[] args) {

		int[][] array = new int[4][];

		System.out.println(array[0]);

		array[0] = new int[3];
		array[1] = new int[4];
		array[2] = new int[5];
		array[3] = new int[2];	// these creation and below creation is same

		int[][] array2 = { { 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 0, 0, 0 }, { 0, 0 } };

	}

}
