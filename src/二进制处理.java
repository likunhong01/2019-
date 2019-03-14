import java.util.Scanner;

public class 二进制处理 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		int j = scanner.nextInt();
		int i = scanner.nextInt();
		String s1 = Integer.toBinaryString(n).toString();
		String s2 = Integer.toBinaryString(m).toString();
		char[] cs = s1.toCharArray();
		for (int k = s1.length() - j - 1, l = s2.length() - 1; k >= s1.length() - i - 1; k--, l--) {
			char tmp = s2.charAt(l);
			cs[k] = tmp;
		}
		int a = Integer.parseInt(String.valueOf(cs), 2);
		System.out.println(a);
	}
}
