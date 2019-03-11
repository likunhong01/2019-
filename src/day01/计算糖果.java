package day01;

import java.util.Scanner;

public class 计算糖果 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner scanner = new Scanner(System.in);
		int i = scanner.nextInt();
		int j = scanner.nextInt();
		int k = scanner.nextInt();
		int l = scanner.nextInt();
		int a2 = i + k;
		int b2 = j + l;
		int c2 = l - j;
		if(a2 % 2 == 1 || b2 % a2 == 1 || c2 % a2 == 1 || j + l != k - i) 
			System.out.println("No");
		else {
			int a = a2 / 2;
			int b = b2 / 2;
			int c = c2 / 2;
			System.out.println(a + " " + b + " " + c);
		}
	}
}
