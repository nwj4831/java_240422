package question;

import java.util.Scanner;

public class ScannerSumMultiply {
	public static void main(String[] args) {
		System.out.println("2개의 정수를 입력하세요");
		Scanner scanner = new Scanner(System.in);
//		nextInt할때 항상 대문자인지 확인!
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		System.out.println("두 수의 합은 "+(a+b)+"입니다");
		System.out.println("두 수의 곱은 "+(a*b)+"입니다");
		scanner.close();
	}
}
