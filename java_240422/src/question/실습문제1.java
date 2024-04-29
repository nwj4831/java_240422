package question;

import java.util.Scanner;

public class 실습문제1 {
	public static void main(String[] args) {
		System.out.println("원의 반지름을 입력하시오>>");
//		입력받기 위해서 Scanner 객체 생성
		Scanner scanner = new Scanner(System.in);
		double radius = scanner.nextDouble();
//		원의 면적 공식
		double a = radius*radius*3.14;
		System.out.println("원의 면적은"+a+"입니다");
		scanner.close();
	}
}
