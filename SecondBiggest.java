package Array;

public class SecondBiggest {
public static void main(String[] args) {
	int [] a = {80,80,43,50,38,63,58,80};
	int max = Integer.MIN_VALUE;
	int smax = Integer.MIN_VALUE;
	for(int i=0;i<a.length;i++) {
		if(a[i]>max) {
			smax = max;
			max = a[i];
		}
		else if(a[i]>smax && a[i]<max) {
			smax = a[i];
		}
	}
	System.out.println("Second big is :"+smax);
}
}
