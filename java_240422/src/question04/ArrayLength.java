package question04;

import java.util.Scanner;

public class ArrayLength {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("정수 5개를 입력하세요.>>");
		double sum=0;
		int intArray[]= new int[5];
		
		for (int i = 0; i < intArray.length; i++) {
//			5번 반복해서 배열원소에 정수를 저장
			intArray[i] = scanner.nextInt();
			sum += intArray[i];
		}
		
		System.out.println("평균은 "+(sum/intArray.length));
	scanner.close();
	}
}
