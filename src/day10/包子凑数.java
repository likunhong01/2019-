package day10;

import java.util.Scanner;

public class 包子凑数 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int arr[] = new int[N];
		for (int i = 0;i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		
		int count = 0;
		

		
		int max = arr[0];
		int min = arr[0];
		for (int i = 0 ;i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
			if (arr[i]<min) {
				min = arr[i];
			}
		}
		
		int g = gcd(arr[0],arr[1]);
		for (int i = 2; i < arr.length; i++) {
			g = gcd(g, arr[i]);
		}
		if (g != 1) {
			System.out.println("INF");
			System.exit(0);
		}
		
//		int leng = 1;
//		for (int i = 0; i < arr.length; i++) {
//			leng *= arr[i];
//		}
//		System.out.println(leng);
		int dp[] = new int[1000000]; 
		
		// 初始化dp
		for (int i = 0; i < max; i++) {
			dp[i] = 0;
		}
		for (int i = 0; i < arr.length; i++) {
			dp[arr[i]] = 1;		
		}
		
		
		for (int i = min + 1; i < dp.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (dp[i] ==1 || (i-arr[j]>0 &&dp[i - arr[j]] == 1)) {
					dp[i] = 1;
					break;
				}
				if (j == arr.length-1) {
					dp[i] = 0;
				}
			}
		}
		
		
		for (int i = 0; i < dp.length; i++) {
			if (dp[i] == 0) {
				count++;
			}
		}
		System.out.println(count - 1);
	}
	public static int gcd(int a,int b) {
		return b == 0 ? a : gcd(b,a % b);
	}
}
