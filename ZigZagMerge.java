package Array;

public class ZigZagMerge {
public static void main(String[] args) {
	int [] arr1 = {20,30,50};
	int [] arr2 = {2,4,6,8,10};
	int l1 = arr1.length;
	int l2 = arr2.length;
	int [] res = new int[l1+l2];
	int i=0;
	int a = 0;
	int b = 0;
	while(a < l1 && b < l2) {
		res[i++] = arr1[a++];
		res[i++] = arr2[b++];
	}
	while(a < l1) {
		res[i++] = arr1[a++];
	}
	while(b < l2) {
		res[i++] = arr2[b++];
	}
	for(int x : res) {
		System.out.print(x+" ");
	}
}
}

