package day06;

public class 构建乘积数组 {
	public static void main(String[] args) {
		
	}
	public static int[] multiply(int[] A) {
		int length = A.length;
		int[] B = new int[length];
		
		for (int i = 0; i < length; i++) {
			B[i] = 1;
			for (int j = 0; j < length; j++) {
				if (i==j) {
					continue;
				}
				B[i] *= A[j];
			}
		}
		return B;
		
    }
}
