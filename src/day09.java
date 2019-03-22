import java.util.Scanner;

public class day09 {
	public static byte[][] contact;
	public static int mincount;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		mincount = n;
		contact = new byte[n+1][n+1];
		
		for (int i = 0; i < m; i++) {
			int x = scanner.nextInt();
			int y = scanner.nextInt();
			contact[x][y] = 1;
			contact[y][x] = 1;
		}
		
//		LinkedList<ArrayList<Integer>> linkedList = new LinkedList<ArrayList<Integer>>();
		int[][] kaochang = new int[n+1][n+1];
		
		
		name(kaochang, n, 1, 1);
		System.out.println(mincount);
	}
	
	public static void name(int[][] kaochang, int n, int input, int nowcount) {
		if (input > n) {
			mincount = Math.min(mincount, nowcount - 1);
			return;
		}
		for (int j = 1; j < nowcount ; j++) {
			for (int i = 1; i < n+1; i++) {
				if (contact[kaochang[j][i]][input] == 1) {
					// 如果有关系,就看下一个考场
					break;
				}
				if (kaochang[j][i]==0) {
					// 如果和里面的都没有关系，就放在这个考场
					kaochang[j][i] = input;
					name(kaochang, n, input + 1,nowcount);
					kaochang[j][i] = 0;
					break;
				}
			}
		}
		// 否则新建一个考场
		kaochang[nowcount][1] = input;
		name(kaochang, n, input+1,nowcount + 1);
	}
	
	public static void display(byte[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				System.out.print(array[i][j]);
			}
			System.out.println();
		}
	}
}
