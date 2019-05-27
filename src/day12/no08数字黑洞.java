package day12;

import java.util.Arrays;
import java.util.Scanner;

public class no08数字黑洞 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int n = new Scanner(System.in).nextInt();
		int count = 0;
		while (n != 6174) {
			String string = "" + n;
			int len = 4 - string.length();
			if (len != 0) {
				for (int i = 0; i < len; i++) {
					string = "0" + string;					
				}
			}
			String[] stings = string.split("");
			int[] s = new int[string.length()];
			for (int i = 0; i < stings.length; i++) {
				s[i] = Integer.parseInt(stings[i]);
			}
			Arrays.sort(s);
			int minn = 0;
			for (int i = 0; i < s.length; i++) {
				minn += s[i] * Math.pow(10, s.length - i - 1);
			}
			
			int maxn = 0;
			for (int i = s.length - 1; i >= 0; i--) {
				maxn += s[i] * Math.pow(10, i);
			}
			
			n = maxn - minn;
			count++;
		}
		System.out.println(count);
	}
	
}
