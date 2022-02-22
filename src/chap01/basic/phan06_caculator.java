package chap01.basic;

import java.util.Scanner;

public class phan06_caculator {
	public static void main(String[] args) {
		int numberFrist;
		int numberSecond;
		String caculate;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("numberFrist: ");
		numberFrist = sc.nextInt();
		sc.nextLine();
		
		System.out.println("numberSecond: ");
		numberSecond = sc.nextInt();
		sc.nextLine();
		
		
		System.out.println("caculate: ");
		caculate = sc.nextLine();
		
		sc.close();
		
		System.out.println("numberFrist: " + numberFrist);
		System.out.println("caculate: " + caculate);
		System.out.println("numberSecond: " + numberSecond);
		
		
		switch (caculate) {
		case "*":
		case "x": {
			int result = numberFrist * numberSecond;
			System.out.println("Total: " + result);
			break;
		}
		case "+": {
			int result = numberFrist + numberSecond;
			System.out.println("Total: " + result);
			break;
		}
		case ":":
		case "/": {
			int result = numberFrist / numberSecond;
			System.out.println("Total: " + result);
			break;
		}
		case "%": {
			int result = numberFrist % numberSecond;
			System.out.println("Total: " + result);
			break;
		}
		default:
			int result = numberFrist - numberSecond;
			System.out.println("Total: " + result);
		}
		
	}
}
