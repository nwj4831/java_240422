package question;
import java.util.Scanner;

public class ScannerExArea {
	public static void main(String[] args) {
		System.out.println("정수를 입력하시오>>");
		
		Scanner scanner = new Scanner(System.in);
		int a =scanner.nextInt();
		int b =scanner.nextInt();
		int c =scanner.nextInt();
		
//		마지막 숫자가 0이면 삼각형의 넓이
		if (c==0) {
			float 삼각형 =(a*b/2);
			System.out.println("삼각형의 넓이는 "+삼각형);
		} else  {
			float 사다리꼴 =(a+b)*c/2;
			System.out.println("사다리꼴의 넓이는 " +사다리꼴);
		}
		scanner.close();
	}
}
