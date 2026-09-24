package Assignment1;

public class sumElementDivisibleBy3 {
public static void main(String[] args) {
	int arr[] = {1,2,3,43,4,5,6};
	int sum = 0;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]%3==0) {
			sum+=arr[i];
		}
	}
	System.out.println("sum is "+sum);
}
}
