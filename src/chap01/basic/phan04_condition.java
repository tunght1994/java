package chap01.basic;

public class phan04_condition {
	public static void main(String[] args) {
		int number = 2;
		switch(number) {
		case 1:
			System.out.println("Thu 2");
			break;
		default:
			System.out.println("Chu nhat");
		}
			
}
		
		
	// 002 cau dieu kien if else
	public static void main002(String[] args) {
		int number = 20;
		
		if(number > 18) {
			System.out.println("ban duoc un bia");
		}else {
			System.out.println("ban phai un nuoc ngot");
		}
	}
	
	// 001 cau dieu kien if
	private void main001() {
		// TODO Auto-generated method stub
		int number = 11;
		String result = "So chan";
		// Cach 1
//		if(number % 2 == 0) {
//			System.out.println(number + " la so chan ");
//		}		
//		if(number % 2 == 1) {
//			System.out.println(number + " la so le ");
//		}
		
		if(number % 2 == 1) {
			result = "So le";
		}
		
		System.out.println(result);
	}
}
