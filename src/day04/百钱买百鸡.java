package day04;

public class °ÙÇ®Âò°Ù¼¦ {
	public static void main(String[] args) {
		for(int i= 0 ;i < 21; i ++) {
			for(int j = 0; j < 34 ; j++) {
				for(int k=0; k < 301; k+=3) {
					if (i * 5 + j * 3 + k / 3 == 100) {
						System.out.println(i+ " "+ j + " " +k);
					}
				}
			}
			
		}
	}
}
