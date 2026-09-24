package Array;

public class secondSmallest {
public static void main(String[] args) {
	int [] a = {35,80,80,43,50,38,63,58,80,38};//second smallest
	int smallest = Integer.MAX_VALUE;
	int SecondSmallest = Integer.MAX_VALUE;
	for(int i=0;i<a.length;i++) {
		if(a[i]<smallest) {
			SecondSmallest = smallest;
			smallest = a[i];
		}
		else if(a[i]>smallest && a[i] < SecondSmallest) {
			SecondSmallest = a[i];
		}
	
	}
	System.out.println(smallest);
	System.out.println(SecondSmallest);
}
}
