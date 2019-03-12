package day02;

import java.util.Scanner;

public class 不要二 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int h1,h2,w1,w2;
		int w = scanner.nextInt();	// 列号0 - w-1,长
		int h = scanner.nextInt();	// 行号0 - h-1,宽
		if (w%4 <= 2) {
			w1 = w / 4 * 2 + w % 4;
			w2 = w / 4 * 2;
		}
		else {
			w1 = w / 4 * 2 + 2;
			w2 = w / 4 * 2 + w % 4 - 2;
		}
		if (h%4 <= 2) {
			h1 = h / 4 * 2 + h % 4;
			h2 = h / 4 * 2;
		}
		else {
			h1 = h / 4 * 2 + 2;
			h2 = h / 4 * 2 + h % 4 - 2;
		}
		System.out.println(w1*h1 + w2*h2);
	}
}
