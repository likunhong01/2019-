package day12;

import java.util.Arrays;
import java.util.Scanner;

class ele implements Comparable<Integer>{
	int kg;
	int iq;
	@Override
	public int compareTo(Integer arg0) {
		// TODO 自动生成的方法存根
		return 0;
	}
}

public class no01越大越聪明 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
//		Scanner scanner = new Scanner(System.in);
//		int n = scanner.nextInt();
		int[][] elephents = new int[][]{
			{6008, 1300},
			{6000, 2100},
			{500, 2000},
			{1000, 4000},
			{1100, 3000},
			{6000, 2000},
			{8000, 1400},
			{6000, 1200},
			{2000, 1900}
		};
		
		// 构造有向图
		int[][] grouph = new int[elephents.length][elephents.length];
		for (int i = 0; i < grouph.length; i++) {
			for (int j = 0; j < grouph.length; j++) {
				if (elephents[i][0] < elephents[j][0] && elephents[i][1] > elephents[j][1]) {
					grouph[i][j] = 1;
				}else {
					grouph[i][j] = 0;
				}		
			}
		}
		
		int[] d = new int[elephents.length];	// 从第i个点出发的最长路径
		int ans = 0;	// 最大长度
		for (int i = 0; i < d.length; i++) {
			int t = dp(i, elephents.length, d, grouph);
			ans = ans>t?ans:t;
		}
		
		
		System.out.println(ans);
		
		
	}
	
	public static int dp(int i, int n, int[] d, int[][] grouph) {
		if (d[i]>0) {
			return d[i];
		}
		d[i] = 1;
		for (int j = 0; j < n; j++) {
			if (grouph[i][j] == 1) {
				// 去他能到达的点找路
				int t = dp(j, n, d, grouph);
				d[i] = d[i]>t+1?d[i]:t+1;
			}
		}
		return d[i];
	}
	
	
	
	public static void display2arr(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}
			System.out.println("\n");
		}
	}

}
