package Array;


public class RemoveElement {
public static void main(String[] args) {
	int [] arr = {10,20,30,40,50,60,70};
	int n = 2;
	System.out.print("Original array :");
	for(int i=0;i<arr.length;i++){
		System.out.print(arr[i]+" ");
	}
	int a = 0;
	int [] arr1 = new int[arr.length-1];
	for(int i=0;i<arr.length;i++) {
		if(i!=n) {
			arr1[a++] = arr[i]; 
		}else {
			continue;
		}
			
	}
	System.out.println();
	System.out.print("updated array : ");
	for(int p: arr1) {
		System.out.print(p+" ");
	}
}
}
