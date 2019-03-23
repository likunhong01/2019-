package day10;

public class Test {
	public static void main(String[] args) {
		double a = 90;
		double x = Math.toRadians(a);
		System.out.println(x);
		double b = Math.tan(x);
		double res = 5/b;
//		java.text.DecimalFormat df = new java.text.DecimalFormat("#0.00");
//		String temp = df.format(res);
//		System.out.println(temp);
		
		System.out.println(Math.toDegrees(Math.asin(0.5)));
	}
}
