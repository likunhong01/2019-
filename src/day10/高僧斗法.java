package day10;

import java.util.Scanner;

public class ��ɮ���� {
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner scanner = new Scanner(System.in);
		String string = scanner.nextLine();
		String[] strings = string.split(" ");
		int[] arr = new int[strings.length];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(strings[i]);
		}
		int[] arrcopy = arr.clone();
		
		int N = arr[arr.length-1];
		
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = arr[i]+1; j < arr[i+1]; j++) {
				arr = arrcopy.clone();
				int tmp = arr[i];
				arr[i] = j;
				int t = boyi(arr);
				if (t==1) {
					System.out.println(tmp + " " + j);
//					System.exit(0);
				}
			}
		}
	}
	
	public static int boyi(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = arr[i]+1; j < arr[i+1]; j++) {
				int temp = arr[i];
				arr[i] = j;
				int t = boyi(arr);
				arr[i] = temp;
				if (t == 1) {
					return -1;
				}
			}
			if (i == arr.length - 2) {
				return 1;
			}
		}
		return -1;
	}
}
