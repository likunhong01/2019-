package day11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class ȡ���� {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}
		
		int[] arrcopy = arr.clone();
		
		// ��һ��hashmap�����Ƿ���ֹ���0����û���ֹ����������ֱ�ʾ�ϴγ��ֵ��±�
		HashMap<Integer, Integer> hashMap = new HashMap();
		
		for (int i = 0; i < arr.length; i++) {
			if (hashMap.get(arr[i]) == null) {
				hashMap.put(arr[i], i);	// �������λ��
				arr[i] = -arr[i];
			}else {
				int start = hashMap.get(arr[i]) + 1;
				int end = i;
				ArrayList<Integer> arrayList = new ArrayList();
				for (int j = start; j < end; j++) {
					if (arrayList.indexOf(arrcopy[j]) == -1 ) {
						arrayList.add(arrcopy[j]);
					}
				}
				hashMap.put(arr[i], i);	// �����������λ��
				arr[i] = arrayList.size();
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
			
		}
	}
}
