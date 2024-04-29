package chapter02;

// 1. JVM이 public class 찾아감
// 2. main 메소드 찾아감

public class Square {
//	void : 리턴 타입(리턴[반환] 할것이 없다)
	public static void main(String[] args) {
// ***3. 메소드 호출
		int n=4;
//		square();//메소드 호출부
//		square(4);//메소드 호출부
//		square(n);//메소드 호출부
		int s = square(n);//메소드 호출부
		System.out.println("한변의 길이가 "+n+ "인 정사각형의 넓이 : " +s);
	}
//	square : 메소드명(호출부에서 파라미터가 있으면 오류)
//	public static void square() {//메소드 정의부
//	public static void square(int n) {//메소드 정의부
//	int length : int 타입의 매개변수(인자,파라미터)n->length로 받음
//	public static void square(int length) {//메소드 정의부
//	메소드 호출됨
	public static int square(int length) {//메소드 정의부
//	int : 리턴 타입
//		return; (int)
//		return; 타입 불일치시 오류 (string)
//		return 0; //타입 불일치시 오류(int)
// 5. length 를 제곱해서 반환 
		return length * length;
	}

}
