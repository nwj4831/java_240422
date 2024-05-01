package question03;

import java.util.Scanner;

public class ContinueExample {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("정수 5개 입력 하세요.");
		int n, sum=0;
		
		for (int i = 0; i <5; i++) {
			n=scanner.nextInt();
//			양수일때
			if(n<=0) {
//				i++증강쪽으로 이동
				continue;
			}else {
				sum += n;
			}
		}
		System.out.println("양수의 합은 "+sum);
	scanner.close();
	}

}
