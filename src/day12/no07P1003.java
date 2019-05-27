package day12;

import java.util.Scanner;

public class no07P1003 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int m = scanner.nextInt();
		
		String[] strings = new String[m];
		
		for (int i = 0; i < m; i++) {
			int n = scanner.nextInt();
			int[][] arr = new int[n][2];
			for (int j = 0; j < n; j++) {
				for (int k = 0; k < 2; k++) {
					arr[j][k] = scanner.nextInt();
				}
			}
			
			// arr[][0]�������еģ�[][1]����Ҫ��
			
			int free = 0;
			boolean flag = true;
			while (!all(arr) && flag) {
				for (int j = 0; j < n; j++) {
					if (arr[j][0] == -1) {
						continue;
					}
					if (arr[j][0] + free >= arr[j][1]) {
						//�Ͱ������ɾ����ͬʱ�ó����Ļ�ľ
						free += arr[j][0];
						arr[j][0] = -1;
					}else if (j == n-1) {
						// ˵��������û��ɣ������µ�Ҳ������
//						System.out.println("NO");
						strings[i] = "NO";
						flag = false;
					}
				}
			}
//			System.out.println("YES");
			if (flag) {
				strings[i] = "YES";
			}
			
		}
		
		for (int i = 0; i < strings.length; i++) {
			System.out.println(strings[i]);
		}
		
	}
	
	public static boolean all(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i][0] != -1) {
				return false;
			}
		}
		return true;
	}
}
