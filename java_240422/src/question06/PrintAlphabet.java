package question06;

import java.util.Scanner;

public class PrintAlphabet {
	public static void main(String[] args) {
//		String s = "abcdefghijklmnopqrstuvwxyz";
		Scanner scanner=new Scanner(System.in);
		System.out.print("소문자 알파벳 하나를 입력하시오>>");
		String s = scanner.next();
		char c = s.charAt(0);
		char count=0;
		for (int i = 0; i > c; i--) {
			count++;
			System.out.println(count);
			
//			for (int j = 0; j < c; j++) {
//			}
		}
		scanner.close();
	}
}
