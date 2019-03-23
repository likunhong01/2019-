package day10;

import java.util.Scanner;

public class ����ũ�� {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		float g = scanner.nextFloat();
		int n = scanner.nextInt();

		double[][] arr = new double[n][4];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j] = scanner.nextInt();
			}
		}
		
		double[] effectS = new double[arr.length];
		// �������ԲŲ����
		for (int i = 0; i < arr.length; i++) {
			//0x��1y��2z��3�뾶
			double tmp = Math.tan(Math.toRadians(g));
			arr[i][0] += arr[i][2] / tmp;
			arr[i][2] = 0;
			
			double x = arr[i][0];
			double y = arr[i][1];
			double z = arr[i][2];
			double r = arr[i][3];
			
			// ���ͶӰ���������
			if (x+r < a && x-r > 0 && y + r < b && y-r >0) {
				effectS[i] = Math.PI * r * r;
			}else {
				// �жϺ��������ཻ
				int[] xiangjiaoxian = {0,0,0,0};
				if (x+r>a) {
					xiangjiaoxian[0] = 1;
				}
				if (x-r<0) {
					xiangjiaoxian[1] = 1;
				}
				if (y+r>b) {
					xiangjiaoxian[2] = 1;
				}
				if (x-r<0) {
					xiangjiaoxian[3] = 1;
				}
				
				// �ҵ�����
				if (x+r>a) {
					double ttt = Math.sqrt(r*r+(a-x)*(a-x));
					double jiaodu = Math.toDegrees(Math.asin(ttt/r));
					// ��Ч���
					double ss = ttt*(a-x) + jiaodu/360 * Math.PI *r *r;
				}
				if (x-r<0) {
					xiangjiaoxian[1] = 1;
				}
				if (y+r>b) {
					xiangjiaoxian[2] = 1;
				}
				if (x-r<0) {
					xiangjiaoxian[3] = 1;
				}
			}
			
		}
		
		
	}
}
