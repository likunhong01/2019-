package day09;

import java.util.Scanner;

public class 买不到的数目 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int leng = a * b;
		int dp[] = new int[leng];
		int min = Math.min(a, b);
		int max = Math.max(a, b);
		
		for(int i = 0; i < max; i++) {
			dp[i] = 0;
		}
		dp[0] = 1;
		dp[min] = 1;
		dp[max] = 1;
		for (int i = max + 1; i < dp.length; i++) {
			if (dp[i-a] == 1 || dp[i-b] == 1) {
				dp[i] = 1;
			}
		}
		for (int i = dp.length - 1; i >= max; i--) {
			if (dp[i] == 0) {
				System.out.println(i);
				break;
			}
		}
	}
}
