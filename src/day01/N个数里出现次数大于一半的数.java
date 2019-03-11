package day01;

import java.util.HashMap;
import java.util.Scanner;

public class N个数里出现次数大于一半的数 {
	public static void main(String[] args) {
		HashMap<Integer,Integer> hashMap = new HashMap();
		Scanner scanner =  new Scanner(System.in);
		String string = scanner.nextLine();
		String[] strs = string.split(" ");
		
		System.out.println(string);
		for (String string2 : strs) {
			System.out.println(string2);
		}
		
		
		int leng = strs.length;
		for (String s : strs) {
			int i = Integer.parseInt(s);
			if (hashMap.get(i) == null) {
				hashMap.put(i, 1);
			}
			else {
				hashMap.put(i, hashMap.get(i) + 1);
			}
		}
		
		
		
		for (String s : strs) {
			int i = Integer.parseInt(s);
			if (hashMap.get(i) >= leng / 2) {
				System.out.println(i);
				break;
			}
		}
	}
}
