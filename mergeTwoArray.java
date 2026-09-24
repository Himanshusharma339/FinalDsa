package Array;

public class mergeTwoArray {
public static void main(String[] args) {
	int [] arr1 = {1,3,5};
	int [] arr2 = {2,4,6,8,10};
	int [] res = new int[arr1.length + arr2.length];
	for(int i=0;i<arr1.length;i++) {
		res[i] = arr1[i];
	}
	for(int i=0;i<arr2.length;i++) {
		res[arr1.length+i] = arr2[i];
	}
	for(int p : res) {
		System.out.print(p+" ");
	}


	
}
}
