package day07;

public class ÎÞ»º´æ½»»» {
	public static int[] exchangeAB(int[] AB) {
        // write code here
		AB[0] = AB[0] ^ AB[1];
		AB[1] = AB[0] ^ AB[1];
		AB[0] = AB[0] ^ AB[1];
		return AB;
    }
}
