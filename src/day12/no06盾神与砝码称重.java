package day12;

import java.util.Scanner;

public class no06盾神与砝码称重 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int[] fama =  new int[n];
		int[] weight = new int[m];
		
		for (int i = 0; i < fama.length; i++) {
			fama[i] = scanner.nextInt();
		}
		for (int i = 0; i < weight.length; i++) {
			weight[i] = scanner.nextInt();
		}
		
		
		for (int i = 0; i < weight.length; i++) {
			dfs(weight[i], 0, n, 0, fama);			
		}
	}
	
	public static boolean dfs(int w, int i, int n, int noww, int[] fama) {
		if (w == noww) {
			System.out.println(w);
			return true;
		}
		if(i == n) {
			return false;
		}
		return dfs(w, i+1, n, noww+fama[i], fama) ||
				dfs(w, i+1, n, noww - fama[i], fama) ||
				dfs(w, i+1, n, noww, fama);
		
	}

}
