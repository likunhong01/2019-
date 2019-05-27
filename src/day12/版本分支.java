package day12;

import java.util.LinkedList;
import java.util.Scanner;

class Point{
	public int id;
	public LinkedList<Point> childs = new LinkedList();
	public Point parent;
	
}

public class �汾��֧ {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int Q = scanner.nextInt();
		Point[] points = new Point[N];
		// ��ʼ������n����
		for (int i = 0; i < N; i++) {
			Point now_point = points[i];
			now_point = new Point();
			now_point.id = i;
		}
		// �����Ĺ�ϵ��ã�˭��˭�ĸ��ף�
		for (int i = 0; i < N-1; i++) {
			// u��v�ĸ��汾
			int u = scanner.nextInt() - 1;
			int v = scanner.nextInt() - 1;
			points[v].parent = points[u];
		}
		// �ҵ�root
		int rootIndex = 0;
		for (int i = 0; i < points.length; i++) {
			if (points[i].parent == null) {
				rootIndex = i;
				break;
			}
		}
		
		
		for (int i = 0; i < Q; i++) {
			// ��x�ǲ���y������
			int x = scanner.nextInt();
			int y = scanner.nextInt();
			boolean flag;
			Point nowp = points[y];
			while (true) {
				if (nowp.parent.id == rootIndex) {
					flag = false;	
					break;
				}
				nowp = nowp.parent;
				if (nowp.parent.id == x) {
					flag = true;
					break;
				}
			}
			if (flag) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}
	}
}
