package chap01.basic;

public class phan08_shape {
	public static void main(String[] args) {
		
		
	}
	// 005 Shape05
	private void main005() {
		// TODO Auto-generated method stub
		int number = 1;
		while(number <= 5) {
		for(int i = 1; i <= number; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		number++;
		}
	}
	
	// 004 Shape04
	private void main004() {
		// TODO Auto-generated method stub
		int number = 5;
		while(number >= 1) {
			for(int i = 1; i <= 5 - number; i++) System.out.print("  ");
			for(int j = 1; j <= number; j++) System.out.print("* ");
			System.out.println();
			number--;
		}
	}
	
	
	// 003 Shape03
	private void main003() {
		// TODO Auto-generated method stub
		int number = 1;
		while(number <= 5) {
			for(int i = 1; i <= 5 - number; i++) System.out.print("  ");
			for(int j = 1; j <= number; j++) System.out.print("* ");
			System.out.println();
			number++;
		}
	}
	
	// 002 Shape02
	private void main002() {
		// TODO Auto-generated method stub
		int number = 5;
		while(number >= 1) {
		for(int i = 1; i <= number; i++) {
			System.out.print("* ");
		}
		System.out.println();
		number--;
		}
	}
	
	
	// 001 Shape01
	private void main001() {
		// TODO Auto-generated method stub
		int number = 1;
//		while(number <= 5) {
//			for(int i = 1; i <= number; i++) {
//				System.out.print("*");
//			}
//			System.out.println();
//			number++;
//		}
		
		for(int i = 1; i <= 5; i++) {
			for(int j = 1 ; j <= number; j++) {
				System.out.print("*");				
			}
			number++;
			System.out.println();	
		}
	}
}
