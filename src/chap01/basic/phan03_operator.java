package chap01.basic;

public class phan03_operator {
	public static void main(String[] args) {
		int max = 200;
		int min = 150;
		int range = (max - min) + 1;
		int randomNumber = 0;
		
		randomNumber = (int)(Math.random() * range) + min;
		
		System.out.println(randomNumber);
	}
	
	// 007 tim so MAX
	private void main007() {
		// TODO Auto-generated method stub
		int numberOne = 20;
		int numberTwo = 1022;
		int numberThree = 200;
		int numberFor = 1200;
		int numberFive = 2200;
		
		int numberMax = Math.max((Math.max(numberOne, numberTwo)), (Math.max(numberThree, numberFor)));
		int numberMax1 = Math.max(numberMax,numberFive);
		
		
		System.out.println(numberMax1);
	}
	
	
	
	// 006 toan tu so hoc Math
	private void main006() {
		// TODO Auto-generated method stub
		int numberOne = 20;
		int numberTwo = 10;
		double numberThree = 123.456;
		
		int numberMax = Math.max(numberOne, numberTwo); // 20
		
		int nunberMin = Math.min(numberMax, numberMax); // 10
		
		double numberCeli = Math.ceil(numberThree); // 124 lam tron len
		System.out.println(numberCeli);
		
		double numberFloor = Math.floor(numberThree); // 123 lam tron xuong
		System.out.println(numberFloor);
		
		double numberRound = Math.round(numberThree); // 123
		System.out.println(numberRound);
		
		double numberRandom = Math.random();
		System.out.println(numberRandom);
	}
	
	
	// 005 toan tu logic && || !
	private void main005() {
		// TODO Auto-generated method stub
		int numberOne = 20;
		int numberTwo = 10;
		boolean result = false;
		
		result = (numberOne > numberTwo) && (numberOne >= numberTwo); // true
		
		result = (numberOne > numberTwo) || (numberOne >= numberTwo); // true
		
		result = !(numberOne > numberTwo); // false
	}
	
	
	// 004 toan tu so sanh >, <, >=, <=, ==, ===, !==
	private void main004() {
		// TODO Auto-generated method stub
		int numberOne = 10;
		int numberTwo = 20;
		boolean result = false;
		
		result = numberOne > numberTwo; // false
		System.out.println(numberOne + " > " + numberTwo +" is " + result);
		
	}
	
	
	// 003 toan tu ++ va --
	private void main003() {
		// TODO Auto-generated method stub
		/*
		 * nummberStart++ trả về giá trị numberStart ban đầu, sau đó mới tăng giá trị lên 1
		 * nummberStart-- trả về giá trị numberStart ban đầu, sau đó mới giảm giá trị xuống 1
		 * ++nummberStart tăng giá trị nummberStart lên 1, sau đó trả về giá trị mới của nummberStart
		 * --nummberStart giảm giá trị nummberStart xuống 1, sau đó trả về giá trị mới của nummberStart
		 * */
		int nummberStart = 20;
		int numberEnd = 0;
		
		// numberEnd = nummberStart++; // nummberStart = 21 va nummberEnd = 20
		// numberEnd = nummberStart--; // nummberStart = 19 va nummberEnd = 20
		// numberEnd = ++nummberStart; // nummberStart = 21 va nummberEnd = 21
		// numberEnd = --nummberStart; // nummberStart = 19 va nummberEnd = 19
		
		System.out.println("nummberStart" + " = " + nummberStart);
		System.out.println("nummberEnd" + " = " + numberEnd);
	}
	
	// 002 Toan tu gan += , -=, *=, /=, %=
	private void main002() {
		// TODO Auto-generated method stub
		int number = 10;
		
		System.out.println("Start" + " = " + number);
		number += 10;
		number -= 10;
		System.out.println("End" + " = " + number);
	}
	
	// 001 Toán tử số học
	private void main001() {
		// TODO Auto-generated method stub
		int numberOne = 13;
		int numberTwo = 20;
		int result;
			
		result = numberOne + numberTwo; // KQ = 33
		System.out.println(numberOne + " + " + numberTwo + " = " + result);
		
		result = numberOne - numberTwo; // KQ = -7
		System.out.println(numberOne + " - " + numberTwo + " = " + result);
		
		result = numberOne * numberTwo; // KQ = 260
		System.out.println(numberOne + " * " + numberTwo + " = " + result);
		
		result = numberOne / numberTwo; // Chia không lấy dư (KQ = 0)
		System.out.println(numberOne + " / " + numberTwo + " = " + result);
	
		result = numberOne % numberTwo; // chia lấy dư (KQ = 13)
		System.out.println(numberOne + " % " + numberTwo + " = " + result);
	}
	
}
