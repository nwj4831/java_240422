package question06;

import java.util.Random;
import java.util.Scanner;

public class guessNumber {
	public static void main(String[] args) {
		int n =0;
		int  guess=0;
		Scanner scanner = new Scanner(System.in);
		n = (int)(Math.random()*10)+1;
		
		System.out.print("추측한 숫자를 입력하세요");
//		while(guess!=n){
//		System.out.println("틀릿4다");
		
		while (true) {
			guess=scanner.nextInt();
			if (guess>n) {
				System.out.println("추측한 숫자가 크다");
				System.out.print("추측한 숫자를 입력하세요");
			}
			if (guess<n) {
				System.out.println("추측한 숫자가 작다");
				System.out.print("추측한 숫자를 입력하세요");
			}
			if (guess==n) {
			System.out.println("맞추셨습니다");
			break;
			}
		}
		scanner.close();
	}
}