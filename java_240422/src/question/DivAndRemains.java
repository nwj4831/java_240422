package question;

import java.util.Scanner;

public class DivAndRemains {
	public static void main(String[] args) {
		System.out.println("2자리 정수 입력(10~99)");
		Scanner scanner=new Scanner(System.in);
		int n = scanner.nextInt();
		
//		10의자리: 나누기 10을 해서 몫
//		1의자리 나누기 10을 해서 나머지
		int ten = n/10;
		int one = n%10;
		
		if(ten == one ) {
			System.out.println("Yes 10의 자리와 1의 자리가 같습니다");
		} else {
			System.out.println("no 10의 자리와 1의 자리가 다릅니다");
		}
		
		scanner.close();
	}
}
