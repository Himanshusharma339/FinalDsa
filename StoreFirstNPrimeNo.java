package Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StoreFirstNPrimeNo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no..");
		int n = sc.nextInt();
		List<Integer> l = new ArrayList<>();
		for (int i = 2;; i++) {
			if (isPrime(i)) {
				l.add(i);
				n--;
			}
			if (n == 0) {
				break;
			}
		}
		for (int i : l) {
			System.out.print(i + " ");
		}
		sc.close();

	}

	static boolean isPrime(int n) {
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
