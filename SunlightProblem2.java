package Array;

public class SunlightProblem2 {
	public static void main(String[] args) {
		int[] arr = { 4, 2, 6, 8, 5, 7, 12, 6 };
		int max = arr[0];
		int count = 1;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
				count++;

			}
		}
		int[] arr1 = new int[count];
		int min = Integer.MIN_VALUE;
		int a = 0;

		for (int i = 0; i < arr.length; i++) {
			{
				if (arr[i] > min) {
					min = arr[i];
					arr1[a++] = i;
				}

			}
		}

		for (int p : arr1) {
			System.out.print(p + " ");
		}

	}
}
