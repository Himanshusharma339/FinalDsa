package Assignment1;

public class largestString {
public static void main(String[] args) {
	String arr[] = {"abc","abhi","unclle","piksiSharma"};
	String largest = arr[0];
	for(int i=1;i<arr.length;i++) {
		if(arr[i].length()>largest.length()) {
			largest=arr[i];
		}
	}
	System.out.println("largest string is "+largest);
	
}
}
