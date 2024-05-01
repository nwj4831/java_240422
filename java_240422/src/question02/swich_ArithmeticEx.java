package question02;

import java.util.Scanner;

public class swich_ArithmeticEx {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("연산>>");
		int a= scanner.nextInt();
		String c=scanner.next();
		int b= scanner.nextInt();
		float res=0;
		scanner.close();
		
		switch (c) {
		case ("+"):
			res = a + b;
			break;
		case "-":
			res = a - b;
			break;
		case "*":
			res = a * b;
			break;
		case "/":
			if (b == 0) {
				System.out.println("0으로 나눌 수 없습니다.");
				return;
			}else {
				res = a/b;				
			}
			break;

		default:
			System.out.println("사칙연산이 아닙니다");
//			break;
			return;
		}		
		System.out.println(a+c+b+"의 계산결과는"+res);
	}
	
}
