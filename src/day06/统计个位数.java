package day06;

import java.util.HashMap;
import java.util.Scanner;

public class ͳ�Ƹ�λ�� {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		HashMap<Integer, Integer> hashMap = new HashMap();
		for(int i = 0; i < s.length(); i++) {
			int tmp = Integer.parseInt(String.valueOf(s.charAt(i)));
			if (hashMap.get(tmp) == null) {
				hashMap.put(tmp, 1);
			}else {
				hashMap.put(tmp, hashMap.get(tmp) + 1);
			}
		}
		for(int i = 0; i <= 9; i++) {
			if (hashMap.get(i) != null && hashMap.get(i) != -1) {
				System.out.println(i +":"+ hashMap.get(i));
				hashMap.put(i, -1);
			}
		}
	}
}
