package Assignment1;

public class biggerThanAvg {
public static void main(String[] args) {
	int arr[] = {1,2,3,4,4,5};
	int count = 0;
	double sum = 0;
	for(int i=0;i<arr.length;i++) {
		sum+=arr[i];
	}
	double avg = sum/arr.length;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]>avg) {
			count++;
			System.out.println(arr[i]);
		}
	}
	System.out.println("count are "+count);
}
}
