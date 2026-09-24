package Array;

public class SumExceptItself {
public static void main(String[] args) {
	int arr[] = {2,5,4,3,6};
	int sum = 0;
	System.out.print("Original arr : ");

	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
		sum+=arr[i];
	}
	System.out.println();
	for(int i=0;i<arr.length;i++) {
		arr[i] = sum-arr[i];
	}
	System.out.print("resultant arr : ");
	for(int n: arr) {
		System.out.print(n+" ");
	}
	
}
}
