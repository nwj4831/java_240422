package chapter02;

import java.util.Scanner;

//숫자를 입력받아서 3의 배수여부를 출력
public class MultipleOfThree {
	public static void main(String[] args) {
		System.out.println("수를 입력하시오 :");
		Scanner scanner = new Scanner(System.in);
		int numbur = scanner.nextInt();
		
		if (numbur % 3 == 0) {
			System.out.println("3의 배수입니다.");
		} else {
			System.out.println("3의 배수가 아닙니다.");

		}
		scanner.close();
	}
}
