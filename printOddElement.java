package Assignment1;

public class printOddElement {
public static void main(String[] args) {
	int arr[] = {1,2,3,5,8,9};
	int sum = 0;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]%2==1) {
			sum+=arr[i];
		}
	}
	System.out.println("sum of odd element is "+sum);
}
}
