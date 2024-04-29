package question;

import java.util.Scanner;

class Aaa{}
class Baa{}
//public class: 자바파일 안에 두개이상 존재시 오류
//1. JVM이 수많은 class 에서 public class를 찾아감

public class ScannerEx {
//	메소드 여러개 사용해도 무관
	public static void aaa(){}
//	JVM 이 수많은 메소드 에서 main 메소드를 찾아감
	public static void main(String[] args) {
	
	System.out.println("2개의 숫자를 입력하세요");
	Scanner scanner = new Scanner(System.in);
	double a = scanner.nextDouble();
	double b = scanner.nextDouble();
	
	
	System.out.println("두 수의 덧셈은 "+(a+b)+"입니다");
	System.out.println("두 수의 뺄셈은 "+(a-b)+"입니다");
	System.out.println("두 수의 곱셈은 "+(a*b)+"입니다");
	System.out.println("두 수의 나눗셈은 "+(a/b)+"입니다");
	scanner.close();
	
	}
}

