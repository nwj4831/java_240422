package question02;

import java.util.Scanner;

public class if_elseArithmeticExlf {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("연산>>");
		int a= scanner.nextInt();
		String c=scanner.next();
		int b= scanner.nextInt();
		int res=0;
		
		if (c.equals("+")) {
			res = a + b;
		}else if (c.equals("-")){
			res = a-b;
		}else if (c.equals("*")){
			res = a*b;
		}else if(c.equals("/")) {
			if (b == 0) {
				System.out.println("0으로 나눌 수 없습니다.");
				//프로그램 종료
				return;
			}else {
				res = a/b;				
			}
		}else {
			System.out.println("입력 오류");
			return;
		}
		System.out.println(a+c+b+"의 계산결과는"+res);
		scanner.close();
	}
	
}
