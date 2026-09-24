package Array;

public class SunlightProblem {
public static void main(String[] args) {
	int [] arr = {4,2,6,8,5,7,12,6};
	int max = arr[0];
	int count = 1;
	for(int i:arr) {
		if(i > max) {
			max = i;
			count++;
		}
	}
	System.out.println(count);
}
}
