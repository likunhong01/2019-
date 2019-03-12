package day02;

import java.util.Scanner;
public class 最小公倍数 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int m = scanner.nextInt();
		int n = scanner.nextInt();
		int mcopy = m, ncopy = n;
		if (n>m) {
			int tmp = m;
			m = n;
			n = tmp;
		}
		while (m % n != 0) {
			int tmp = m;
			m = n ;
			n = tmp % n;
		}
		System.out.println(mcopy * ncopy / n);
	}
}
