package chap01.basic;

import java.util.Scanner;

public class phan07_find {
	public static void main(String[] args) {
		final int MAX_NUMBER = 100;
		final int MIN_NUMBER = 1;
		int range = (MAX_NUMBER - MIN_NUMBER) + 1;
		int secrentNumber = (int)(Math.random() * range + MIN_NUMBER);
		int scope = 0;
		
		Scanner sc = new Scanner(System.in);
		
//		int yourNumber = 0;
//		int scope = 0;
//		while (yourNumber != secrentNumber) {
//			System.out.println("Vui long nhap tu 1 den 100: ");
//			yourNumber = sc.nextInt();
//			sc.nextLine();
//			
//			if(yourNumber > secrentNumber) {
//				System.out.println("So ban nhap lon hon so bi mat ");
//			}else if (yourNumber < secrentNumber) {
//				System.out.println("So ban nhap nho hon so bi mat ");
//			}else {
//				System.out.println("Chuc mung ban da dung ");
//			}
//			scope++;
//		}
		
		for(int i = 0; i != secrentNumber ; i++) {
			System.out.println("Vui long nhap tu 1 den 100: ");
			i = sc.nextInt();
			sc.nextLine();
			
			if(i > secrentNumber) {
				System.out.println("So ban nhap lon hon so bi mat ");
			}else if (i < secrentNumber) {
				System.out.println("So ban nhap nho hon so bi mat ");
			}else {
				System.out.println("Chuc mung ban da dung ");
			}
			scope++;
		}
		sc.close();
		System.out.println("scope: " + scope);
	}
}
