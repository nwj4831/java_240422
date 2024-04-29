package chapter02;

import java.util.Scanner;

// 커피 주문을 받아서 커피명과 가격을 출력
public class CoffeePrice {
	public static void main(String[] args) {
		System.out.println("무슨 커피 드릴까요");
		Scanner scanner=new Scanner(System.in);
//		scanner.next(); 문자열 입력받는 메소드
		String order = scanner.next();
//		커피 가격 변수 선언
//		프라이스 초기값 지정
		int price=0;
		
		switch (order) {
		case "에스프레소":
		case "카푸치노":
		case "카페라떼":
			price=3500;
			break;
		case "아메리카노":
			price=2000;
			break;
		//생략가능
		
		default:
			System.out.println("안팝니다");
			break;
		}
		if (price !=0) {			
			System.out.println(order+"는 "+price+"원 입니다");
		}
		scanner.close();
	}
}
