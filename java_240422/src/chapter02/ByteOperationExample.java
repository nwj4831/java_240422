package chapter02;

public class ByteOperationExample {
	public static void main(String[] args) {
//		연산식을 변수로 저장
		byte result1=10+20;
		System.out.println(result1);
		
		byte x=10;
		byte y=20;
		
//		byte result2 = x+y; //오류
//		연산되어서 int로 자동 변환되어서 byet로 casting함
		byte result2 =(byte) (x+y);
		System.out.println(result2);
		
	}

}
