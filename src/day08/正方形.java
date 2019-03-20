package day08;

import java.util.Scanner;

public class Õý·½ÐÎ {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		String string = scanner.next();
		for (int i = 0; i < N / 2; i++) {
			if (i==0 || i==N/2-1) {
				for (int j = 0; j < N; j++) {
					System.out.print(string);
				}
			}else {
				System.out.print(string);
				for (int j = 0; j < N - 2; j++) {
					System.out.print(" ");
				}
				System.out.print(string);
			}
			System.out.println();
		}
	}

}
