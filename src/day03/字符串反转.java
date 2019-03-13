package day03;

import java.util.Scanner;
public class 字符串反转 {
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner scanner = new Scanner(System.in);
		StringBuilder sb = new StringBuilder(scanner.nextLine());
		sb = sb.reverse();
		System.out.println(sb.toString());
	}
}
