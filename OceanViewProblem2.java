package Array;

public class OceanViewProblem2 {
public static void main(String[] args) {
	int [] arr = {4,2,6,18,5,7,12,6};
	int max = Integer.MIN_VALUE;
	int count = 0;
	for(int i=arr.length-1;i>=0;i--) {
		if(arr[i]>max) {
			max =arr[i];
			count++;
		}
	}
	int [] arr1 = new int[count];
	int min = Integer.MIN_VALUE;
	int a = 0;
	for(int i=arr.length-1;i>=0;i--) {
		if(arr[i] > min) {
			min = arr[i];
			arr1[a++] = i;
		}
	}
	
	for(int i=arr1.length-1;i>=0;i--) {
		System.out.print(arr1[i]+" ");
	}
	
}
}
