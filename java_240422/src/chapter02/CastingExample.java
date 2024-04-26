package chapter02;

public class CastingExample {
	public static void main(String[] args) {
		int intvalue=44032;
//		int 타입을 char 로 바로 저장할려고 하면 오류
//		char charvalue =intvalue;
//		char 로 변환(casting)해서 변환
//		44032 유니코드에 해당하는 '가' 문자가 저장
		char charvalue = (char)intvalue;
		System.out.println(charvalue);
		
//		정수 작은타입에서 큰 타입으로 변환(자동 변환=> 묵시적 변환)
//		long longvalue=500;
//		5000999888L 에서 L을 안붙이면 int로 인식해서 오류
		long longvalue=5000999888L;
//		정수 큰타입에서 작은 타입으로 변환(변환 안하면 오류)
		intvalue = (int) longvalue;
//		long 타입 숫자가 int로 변환할때 잘려서 706032592로 저장
		System.out.println(intvalue);
		
		double doublevalue=3.14;
//		실수에서 정수로 변환(변환 안하면 오류)
		intvalue = (int) doublevalue;
//		3.14에서 소수점이 잘려서 3으로 저장
		System.out.println(intvalue);
		
	}
}
