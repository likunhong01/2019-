package day12;

import java.util.ArrayList;
import java.util.Scanner;

public class no03路径之谜 {
	static int bei[];
	static int xi[];

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		bei = new int[N];
		xi = new int[N];

		for (int i = 0; i < bei.length; i++) {
			bei[i] = scanner.nextInt();
		}
		for (int i = 0; i < xi.length; i++) {
			xi[i] = scanner.nextInt();
		}
		
		int[][] zouguode = new int[N][N];
		int[] beia = new int[N];
		int[] xia = new int[N];
		ArrayList<Integer> arrayList = new ArrayList();

		arrayList.add(0);
		zouguode[0][0] = 1;
		zou(0,0,zouguode,beia,xia,N,arrayList);
		
		
	}
	
	public static void zou(int i, int j, int[][] zouguode, int[] beia, int[] xia,int n, ArrayList<Integer> arrayList) {
		
		
		if (i==n-1 && j == n-1) {
//			// 走到终点了
//			for (Integer integer : arrayList) {
//				System.out.print("n"+ integer + " ");
//			}
//			System.out.println('\n');
			
			int[] x = new int[n];
			int[] b = new int[n];
			for (int k = 0; k < n; k++) {
				for (int k2 = 0; k2 < n; k2++) {
					if (zouguode[k][k2] == 1) {
						x[k]++;
						b[k2]++;
					}
				}
			}
			
			boolean f1 = comarr(x, xi);
			boolean f2 = comarr(b, bei);
			if(f1 && f2) {
				// 找到了路径
				for (Integer integer : arrayList) {
					System.out.print(integer + " ");
				}
				System.out.println('\n');
				
			}
			return;
		}
		
		
//		beia[j] += 1;
//		xia[i] += 1;
		// 上下左右走
		if (i+1 < n && zouguode[i+1][j]==0) {
			qianchuli(i+1, j, beia,xia,zouguode,arrayList,n);
			
			zou(i+1, j, zouguode, beia, xia, n,arrayList);
			houchuli(i+1, j, beia,xia,zouguode,arrayList,n);
			
		}
		if (j+1 < n && zouguode[i][j+1]==0) {
			qianchuli(i, j+1, beia, xia, zouguode, arrayList, n);
			zou(i, j+1, zouguode, beia, xia, n,arrayList);
			houchuli(i, j+1, beia, xia, zouguode, arrayList, n);
		}
		if (i-1 >=0 && zouguode[i-1][j]==0) {
			qianchuli(i-1, j, beia, xia, zouguode, arrayList, n);
			zou(i-1, j, zouguode, beia, xia, n,arrayList);
			houchuli(i-1, j, beia, xia, zouguode, arrayList, n);
		}
		if (j-1 >=0 && zouguode[i][j-1]==0) {
			qianchuli(i, j-1, beia, xia, zouguode, arrayList, n);
			zou(i, j-1, zouguode, beia, xia, n,arrayList);
			houchuli(i, j-1, beia, xia, zouguode, arrayList, n);
		}
	}
	
	public static void houchuli(int i, int j, int[] beia, int[] xia, int[][] zouguode, ArrayList<Integer> arrayList, int n) {
		zouguode[i][j] = 0;
		arrayList.remove(arrayList.size()-1);
		beia[j] -= 1;
		xia[i] -= 1;
	}
	
	
	public static void qianchuli(int i, int j, int[] beia, int[] xia, int[][] zouguode, ArrayList<Integer> arrayList,int n) {
		beia[j] += 1;
		xia[i] += 1;
		zouguode[i][j] = 1;
		arrayList.add((i)*n+j);
	}
	
	public static boolean comarr(int[] arr1, int[] arr2) {
		int len1 = arr1.length;
		int len2 = arr1.length;
		if (len1!=len2) {
			return false;
		}
		for (int i = 0; i < len1; i++) {
			if (arr1[i] != arr2[i]) {
				return false;
			}
		}
		return true;
	}

}
