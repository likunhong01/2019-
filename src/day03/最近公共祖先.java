package day03;

public class 最近公共祖先 {

	public static int getLCA(int a, int b) {
		while(a != b) {
			if (a > b) {
				a /= 2;
			}
			else {
				b /= 2;
			}
		}
		return b;
	}
}
