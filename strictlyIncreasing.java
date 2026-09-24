package Array;
public class strictlyIncreasing {
	
	public static boolean CheckStrictly(int arr[]) {
		for(int i=1;i<arr.length-1;i++) {
			if(arr[i+1]<arr[i]) {
				return false;
			}
		}
		return true;
	}
	
public static void main(String[] args) {
	int [] arr = {2,3,7,8,9};
	System.out.println(CheckStrictly(arr));
	
}
}
