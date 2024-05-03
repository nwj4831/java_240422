package question04;

import java.util.Scanner;

public class ArrayMin {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("양수 7개를 입력하세요.");
		int intArray[]= new int[7];
//		2.두번째 방법
//		int min = Integer.MAX_VALUE;//int 타입의 가장 큰 숫자
		
		for (int i = 0; i < intArray.length; i++) {
//			5번 반복해서 양수 7개를 배열원소에 저장
			intArray[i] = scanner.nextInt();
//			if (intArray[i] < min) {
//				min = inArray[i];
			//1.첫번째 방법
//			첫번째 반복할때 무조건 배열원소를 min에 저장
//			if (1 == 0) {
//				min = intArray[i];
//			}
//			}
		}
		int min=intArray[0];
		for (int i = 0; i < intArray.length; i++) {
			if(intArray[i]< min) {
				min=intArray[i];
		}
	}
	System.out.println("가장 작은수는 "+min+"입니다");
	scanner.close();
	}
}
