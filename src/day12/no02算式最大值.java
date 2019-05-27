package day12;

import java.util.Arrays;
import java.util.Scanner;

public class no02算式最大值 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int P = scanner.nextInt();
		int Q = scanner.nextInt();
		int K = scanner.nextInt();
		int[] arr = new int[N];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		
		Arrays.sort(arr);
		
		int max = 0;
		// P个加号，Q个减号
		if(K > 0) {
			
			for (int i = arr.length - 1; i >= 0; i--) {
				max += arr[i];
				if (i == 0) {
					max -= 2 * arr[i];
				}
			}
		} else {
			for (int i = arr.length - 1; i >= 0; i--) {
				if (i < Q) {
					max -= arr[i];
				}else {
					max += arr[i];
				}
			}
		}
		
		System.out.println(max);
	}
}
