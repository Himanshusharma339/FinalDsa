package Array;

public class OceanViewProblem {
	public static void main(String[] args) {
		int[] arr = { 4, 2, 6, 18, 5, 7, 12, 7, 6 };
		int max = Integer.MIN_VALUE;
		int count = 0;
		int n = arr.length - 1;
		for (int i = n; i >= 0; i--) {
			if (arr[i] > max) {
				max = arr[i];
				count++;
			}
		}
		System.out.println(count);
	}
}
