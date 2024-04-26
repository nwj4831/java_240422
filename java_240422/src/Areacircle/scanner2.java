package Areacircle;

import java.util.Scanner;

public class scanner2 {
	public static void main(String[] args) {
		System.out.println("가로,세로 길이를 입력하세요");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		int cc = a*b;
		System.out.println("사각형의 면적은"+cc+"입니다");
		scanner.close();
		
		
		
		
	}

}
