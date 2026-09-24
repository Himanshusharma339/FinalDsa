package Array;
import java.util.Scanner;
public class InsertElementCertainPosition {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter idx");
	int n1 = sc.nextInt();
	System.out.println("Enter element that you want to insert..");
	int n2 = sc.nextInt();
	int [] arr = {10,20,30,40,50,60,70};
	int [] arr1 = new int[arr.length+1];
	int a = 0;
	int b = 0;
	for(int i=0;i<=arr.length;i++) {
		if(i != n1) {
			arr1[a++]=arr[b++];
		}
		else {
			arr1[a++] = n2; 
		}
	}
	for(int p: arr1) {
		System.out.println(p+" ");
	}
	
}
}
