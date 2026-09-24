package Array;

public class RemoveDuplicate {
	public static void main(String[] args) {
		int[] arr = { 2, 4, 2, 5, 4, 3, 2,44 };
		frequency(arr);
	}

	public static void frequency(int arr[]) {
		int max = arr[0],min = arr[0];
		for(int i: arr) {
			if(i>max) {
				max = i;
			}
			if(i<min) {
				min = i;
			}
		}
		int [] freq = new int[max - min + 1];
		for(int i:arr) {
			freq[i-min]++;
		}
		for(int i=0;i<freq.length;i++) {
			if(freq[i]==1)
			System.out.println(i+min+" is "+freq[i]+" times");
		}	
	}
}
