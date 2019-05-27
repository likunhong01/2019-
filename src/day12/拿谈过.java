package day12;

import java.util.Scanner;

public class ÄÃÌ¸¹ý {
	static int[] max = new int[Integer.MAX_VALUE];
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		max[0] = max[1] = max[2] = max[3] = 0;
		
	}
	
	public static int yu(int m, int n) {
		if (max[m] > 0) {
			return max[m] + n;
		}
		int maxx = 0;
		for (int i = 0; i < Math.sqrt(m); i++) {
			if (m%i == 0 && isZS(i)) {
				int t = yu(m - 2*i, i);
				maxx = maxx > t ? maxx : t;
			}
		}
		max[m] = maxx;
		return maxx + n;
	}
	
	public static boolean isZS(int i) {
		for (int j = 2; j < Math.sqrt(i); j++) {
			if (i%j==0) {
				return false;
			}
		}
		return true;
	}
}
