package chap01.basic;

public class phan02_variable {
	public static void main(String[] args) {
		int var1 = 12;
		double var2 = 1.23;
		int var3 = var1 + (int)var2; // Sự thụ hep
		double var4 = (double)var1 + var2; // Sự nới rộng
		
		System.out.println("var3: " + var3);
		System.out.println("var4: " + var4);
		
	}
	
	
	// 003 Data Type
	private void main003() {
		// TODO Auto-generated method stub
		int var1 = 12;
		byte var2 = 20;
		boolean var3 = true;
		double var4 = 123.456;
		String var5 = "Thanh Tung";
		
		System.out.println("var1: " + var1);
		System.out.println("var2: " + var2);
		System.out.println("var3: " + var3);
		System.out.println("var4: " + var4);
		System.out.println("var5: " + var5);
	}
	
	// 002 Contant
	private void main002() {
		// TODO Auto-generated method stub
		final int YOUR_BIRTHDAY = 1994;
		System.out.println(YOUR_BIRTHDAY);
	}
	
	// 001 Variable
	private void main001() {
		// TODO Auto-generated method stub
		// Khai báo biến
		int age = 21;
		int year = 2022;
		char name = 'T';		
		System.out.print("age : " + age + "\n");
		// print in không xuống dòng
		System.out.println(year);
		// println in xuống dòng
		System.out.println("name: " + name);
		

	}
}
