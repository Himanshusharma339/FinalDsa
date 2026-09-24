package Array;

import java.util.Scanner;
public class SwapIndex {
	public static void Swap(int []arr,int n1,int n2){
		for(int i=0;i<arr.length;i++) {
			if( i== n1) {
				int temp = arr[n1];
				arr[n1] =arr[n2];
				arr[n2] = temp;
			}
		}
		for(int p:arr) {
			System.out.print(p+" ");
		}
		
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter first index ");
	int n1 = sc.nextInt();
	System.out.println("Enter second index ");
	int n2 = sc.nextInt();
	int [] arr = {10,20,30,40,50,60};
	Swap(arr, n1, n2);
}
}
