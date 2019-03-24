package day11;

import java.util.Scanner;

public class 生命之树 {
	static int answer = 0;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] value = new int[n];
		for (int i = 0; i < value.length; i++) {
			value[i] = scanner.nextInt();
		}
		
		int[][] path = new int[n][n];
		for (int i = 0; i < n - 1; i++) {
			int x = scanner.nextInt();
			int y = scanner.nextInt();
			path[x-1][y-1] = path[y-1][x-1] = 1;
		}
		
		boolean[] is = new boolean[n];
		
		for (int i = 0; i < value.length; i++) {
			dfs(value, path, is, i, value[i]);
			for (int j = 0; j < is.length; j++) {
				is[j] = false;
			}
		}
		System.out.println(answer);
		
		
	}
	
	public static void dfs(int[] value, int[][] path, boolean[] is, int index, int ans) {
		is[index] = true;
		// 找到所有可以到的点
		for (int i = 0; i < path[index].length; i++) {
			if (path[index][i] == 1 && !is[i]) {
				ans += value[i];
				if (answer < ans) {
					answer = ans;
				}
				dfs(value, path, is, i, ans);
				ans -= value[i];
			}
		}
	}
}
