package question;

import java.util.Scanner;

public class scannerWon2Dllar {
	public static void main(String[] args) {
//		int rate=1100;
//		환율 고정할때 상수 사용(관습적으로 대문자)
//		final int RATE=1100;
		final double RATE=1100;
		System.out.println("원화를 입력하세요(단위 원)>>");
		Scanner scanner = new Scanner(System.in);
		int won = scanner.nextInt();
//		int dollar = won / RATE ;
		double dollar = won / RATE ;
//		int won = scanner.nextInt();
//		double dollar = a/1100;
		
		System.out.println(won+"원은 $"+dollar+"입니다");
		
		scanner.close();
	}
	
}
