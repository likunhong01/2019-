package day12;

import java.util.Scanner;

public class no04翻煎饼 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			String str = scanner.nextLine();
			String[] strings = str.split(" ");
			int[] arr = new int[strings.length];
			
			for (int i = 0; i < arr.length; i++) {
				arr[i] = Integer.parseInt(strings[i]);
			}
			
			int maxindex = 0;
			int max = arr[0];
			for (int i = 0; i < arr.length; i++) {
			}
		}
	}
}
