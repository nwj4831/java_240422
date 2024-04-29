package question;

import java.util.Scanner;

public class scanner2 {
	public static void main(String[] args) {
		System.out.println("가로,세로 길이를 입력하세요");
		Scanner scanner = new Scanner(System.in);
//		첫번째 정수를 가로 변수로 입력받음
		int a = scanner.nextInt();
//		두번째 정수를 세로 변수로 입력받음
		int b = scanner.nextInt();
		int cc = a*b;
		System.out.println("사각형의 면적은"+cc+"입니다");
		scanner.close();
		
		
		
	}

}
