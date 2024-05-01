package question02;

import java.util.Scanner;

public class ArithmeticOperator {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("정수를 입력하세요 :");
		int a= scanner.nextInt();
//		ex>5000/3600=1
		int b= (a/3600);//시간
		int c= ((a/60)%60);//분
		int d= (a%60);//초
//				System.out.println(c);
//				System.out.println(d);
		System.out.println(a+"초는"+b+"시간"+c+"분"+d+"초입니다");
		scanner.close();
	}

}
