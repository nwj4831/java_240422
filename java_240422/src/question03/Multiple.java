package question03;

import java.util.Scanner;
// 3의 배수(아닌 경우(5의 배수or not(8의 배수 or not)))
//	if else if(if else(if else))
// if else if if else가 만능은 아니다
// if 문만 사용
public class Multiple {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		Boolean multiple=false;
		System.out.print("정수를 입력하세요: ");
		int number=scanner.nextInt();
		if (number%3==0) {
			System.out.println("3의배수이다");
			multiple=true;
		}
		if (number%5==0) {
			System.out.println("5의배수이다");
			multiple=true;
		}
		if (number%8==0) {
			System.out.println("8의배수이다");
				multiple=true;
		}if(multiple == false) {
			System.out.println("어느 배수도 아니다");			}
	scanner.close();
	}
}
