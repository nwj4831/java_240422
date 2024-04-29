package question;

import java.util.Scanner;

public class ScannerifTriangle {
	public static void main(String[] args) {
		System.out.print("정수 3개를 입력하시오>>");
		Scanner scaneer=new Scanner(System.in);
		
		int a = scaneer.nextInt();
		int b = scaneer.nextInt();
		int c = scaneer.nextInt();
		
		
		if ((a+b)<=c||(a+c)<=b||(b+c)<=a) {
			 System.out.println("삼각형이 안됩니다");
		} else  {
			System.out.println("삼각형이 됩니다");
		}
		scaneer.close();
	}
}
