package Assignment1;

public class sortedArr {
public static void main(String[] args) {
	int arr [] = {2,7,7,8,9};
	for(int i=0;i<arr.length-1;i++) {
		if(arr[i]>arr[i+1]) {
			System.out.println("unsorted");
			return;
		}
		
		
	}
	System.out.println("sorted");
}
}
