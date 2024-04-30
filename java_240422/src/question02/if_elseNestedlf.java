package question02;

import java.util.Scanner;

public class if_elseNestedlf {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("점수를 입력하세요(0~100):");
		int a= scanner.nextInt();
		System.out.print("학년을 입력하세요(1~4):");
		int b= scanner.nextInt();
		if (a >=60) {
			if(b !=4) {
				System.out.println("합격!");
			}else if (a>=70) {
				System.out.println("합격!");				
			}else {
				System.out.println("불합격");
			}
		}else {
			System.out.println("불합격!");
		}
		scanner.close();
		
//		if (a>=70 && b>3) {
//			System.out.println("합격");
//		} else if(a<70 && b>3){
//			System.out.println("불합격");
//		} 
//		
//		if(a>60 && b<=3){
//			System.out.println("합격");
//		} else if(a<60 && b<=3){
//			System.out.println("불합격");
//		}
	}
}
