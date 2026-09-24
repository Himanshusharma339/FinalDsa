package Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FirstNElementOfFibonaaci {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no.");
		int n = sc.nextInt();

		List<Integer> l = new ArrayList<>();
		l.add(0);
		l.add(1);
		n = n - 2;
		int firstElement = 0;
		int secondElement = 1;
		int thirdElement = firstElement + secondElement;
		
		while(n!=0) {
			firstElement = secondElement;
			secondElement = thirdElement;
			thirdElement = firstElement + secondElement;
			l.add(thirdElement);
			n--;
		}


		for (int i : l) {
			System.out.println(i + " ");
		}
	}
	
}
