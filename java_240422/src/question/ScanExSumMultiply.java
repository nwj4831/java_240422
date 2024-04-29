package question;

import java.util.Scanner;

public class ScanExSumMultiply {
	public static void main(String[] args) {
		System.out.print("3자리수 정수 입력(100~999)>>");
		Scanner scanner =new Scanner(System.in);
		int n = scanner.nextInt();
//		100자리수: 나누기 100의몫
		int h = n/100;
//		
		int t = n%100/10;
		int q = n%10;
		int w = n%10;
		System.out.println("100의 자리와 10의 자리의 합은"+(h+t));
		System.out.println("10의자리와 1의 자리의 곱은"+(t*w));
		System.out.println("10의자리와 1의 자리의 곱은"+(q));
		scanner.close();
	}

}
