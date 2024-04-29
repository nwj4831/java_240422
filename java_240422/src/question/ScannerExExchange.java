package question;

import java.util.Scanner;

public class ScannerExExchange {
	public static void main(String[] args) {
		final double RATE=1200;
		final double RATE2=1500;
		System.out.print("원화를 입력하세요(단위 원)>>");
		Scanner scanner = new Scanner(System.in);
		int won = scanner.nextInt();
				
		double dollar = won / RATE;
		double eur = won / RATE2;
		
		System.out.println(won+"원은 $"+dollar+"입니다");
		System.out.println(won+"원은 E"+eur+"입니다");
		scanner.close();
	}
}
