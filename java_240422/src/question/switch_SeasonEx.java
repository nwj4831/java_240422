package question;

import java.util.Scanner;

public class switch_SeasonEx {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("달을 입력하세요");
		int n = scanner.nextInt();
//		switch case 문자,정수,문자열만 허용
//		실수,리터럴,수식 안됨
		switch (n) {		
//		case 3,4,5: 자바17버전은 ,로 가능 
		case 3: case 4: case 5:
			System.out.println("봄");
		break;
		case 6: case 7: case 8:
			System.out.println("여름");
		break;
		case 9:
		case 10:
		case 11:
			System.out.println("가을");
		break;
		case 12:
		case 1:
		case 2:
			System.out.println("겨울");
		break;

		default:System.out.println("잘못입력");
			break;
		}
		scanner.close();
	}
}
