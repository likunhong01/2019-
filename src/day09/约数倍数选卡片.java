package day09;

import java.util.ArrayList;
import java.util.Scanner;

public class Լ������ѡ��Ƭ {
//	static boolean iswin;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s1 = scanner.nextLine();
		String s2 = scanner.nextLine();
		String[] s1s = s1.split(" ");
		String[] s2s = s2.split(" ");
		ArrayList<Integer> all = new ArrayList();
		int[] now = new int[s2s.length];
		for (int i = 0; i < s1s.length; i++) {
			all.add(Integer.parseInt(s1s[i]));
		}
		for (int i = 0; i < s2s.length; i++) {
			now[i] = Integer.parseInt(s2s[i]);
		}
		
		for (int i = 0; i < now.length; i++) {
			int tmp = all.get(all.lastIndexOf(now[i]));
			int index = all.lastIndexOf(now[i]);
			all.set(index , -1);
//			all.remove(all.lastIndexOf(now[i]));
			int iswin = dfs(now[i],all);
			if (iswin == 1) {
				System.out.println(now[i]);
				break;
			}
//			all.add(now[i]);
			all.set(index , tmp);
		}
	}
	
	public static int dfs(int x, ArrayList<Integer> all) {
		// ��ǰ�õ�����x
		for (int i = all.size() - 1; i >= 0 ; i--) {
			// ��������ã�
			int nownumber = all.get(i);
			if (nownumber >0 && (nownumber % x == 0 || x % nownumber == 0 )) {
//				all.remove(all.lastIndexOf(nownumber));
				int tmp = all.get(all.lastIndexOf(nownumber));
				int index = all.lastIndexOf(nownumber);
				all.set(index , -1);
				int t = dfs(nownumber, all);
//				all.add(nownumber);
				all.set(index , tmp);
				// �����һ���Ǳ�ʤ̬����ǰ���Ǳظ�̬
				if (t == 1) {
					return -1;
				}
			}
		}
		// ���û�����õģ����Ǳ���̬
		return 1;
	}
}
