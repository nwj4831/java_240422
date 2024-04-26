package chapter02;

public class PromotionExample {
	public static void main(String[] args) {
		byte bytevalue=10;
//		int bytevalue=1000;
//		작은 타입을 큰 타입으로 받음: 자동변 환
		int intvalue=bytevalue;
		
		System.out.println("intvalue: "+intvalue);
		
		char charvalue='가';
//		변수에 유니코드가 저장
		intvalue = charvalue;
		System.out.println("intvalue :" +intvalue);
		
		intvalue=50;
//		작은 타입을 큰 타입으로 받음: 자동변환
		long longvalue = intvalue;
		System.out.println("longvalue :" +longvalue);
		
		longvalue=100;
//		정수를 실수로 받음
		float floatvelue = longvalue;
		System.out.println("floatvelue :" +floatvelue);
		
		floatvelue=100.5f;
		double doublevelue = floatvelue;
		System.out.println("doublevelue :" +doublevelue);
		
	}
}
