package Assignment1;

public class printCountThreeDigit {
public static void main(String[] args) {
	int count = 0;
	int arr[] = {123,456,23,2};
	for(int i=0;i<arr.length;i++) {
		if(arr[i]<1000 && arr[i]>99) {
			System.out.println(arr[i]);
			count++;
		}
	}
	System.out.println("Three digit num "+count);
}
}
