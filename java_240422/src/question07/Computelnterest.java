package question07;

import java.util.Scanner;

public class Computelnterest {
	public static void main(String[] args) {
		int principal,//원금 
			years; //
		double rate, //연이율
		balance; // 원리금
		Scanner scanner=new Scanner(System.in);
		System.out.print("원금을 입력하세요");
		principal = scanner.nextInt();
		System.out.print("연이율을 입력하세요");
		rate = scanner.nextDouble();
		years=0;
		balance=principal;
//		System.out.println("연도수     원리금");
		do {
			years++;
			balance=balance * (1.0 + rate / 100.0);
		System.out.println(years+"\t"+balance);
		} while (balance <= principal*2.0);
		System.out.println("\n 필요한 연도수"+years);
		
		//내가 만든거
//		while (true) {
//			balance=balance * (1.0 + rate / 100.0);
//			years = years+1;
//			System.out.println(years +"    "+balance);
//			if (balance >= principal*2) {
//				break;
//			}
//		}
//		System.out.println("\n필요한 연도수 = "+years);
		
		scanner.close();
	}
}
