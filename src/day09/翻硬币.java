package day09;

import java.util.Scanner;

public class ·­Ó²±Ò {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s1 = scanner.next();
		String s2 = scanner.next();
		
		char[] c1 = s1.toCharArray();
		int count = 0;
		
		for (int i = 0; i < c1.length - 1; i++) {
			if (c1[i] == s2.charAt(i)) {
				continue;				
			}
			c1[i] = (c1[i] == '*' ? 'o' : '*');
			c1[i+1] = (c1[i+1] == '*' ? 'o' : '*');
			count++;
		}
		System.out.println(count);
	}
}
