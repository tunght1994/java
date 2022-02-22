package chap01.basic;

public class phan05_loop {
	public static void main(String[] args) {
		int number = 2;
		for(int i = 1; i <= 10; i++) {
			int resulut = number * i;
			System.out.printf("%d x %d = %d %n", number , i, resulut);
			
		}
		
		
	}
	
	// 002 BCC basic
	private void main002() {
		// TODO Auto-generated method stub
		// FOR
		int number = 3;
		for(var i = 1; i <= 10; i++) {
			int result = number * i;
//			System.out.println(number + " x " + i + " = " + result);
			System.out.printf("%d x %d = %d %n", number,i, result);
		}
		
		// WHILE
//		int j = 1;
//		while(j <= 10) {
//			int result = j * number;
//			System.out.println(number + " x " + j + " = " + result);
//			j++;
//		}
	}
	
	// 001 LOOP
	private void main001() {
		// TODO Auto-generated method stub
		int number = 1;
		for(var i = 1; i <= number ; i++) {			
			System.out.println(i + " - JAVA is not difficult!");
		}
		
		//WHILE
		int j = 1;
		while(j <= 10) {
			System.out.println(j + " - JAVA is not difficult!");
			j++;
		}
		
		// DO WHILE
		int k = 1;
		do {
			System.out.println(k + " - JAVA is not difficult!");
			k++;
		}while( k < 5);
	}
}
