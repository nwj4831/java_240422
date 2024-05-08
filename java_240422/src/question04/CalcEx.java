package question04;

//default 접근제한자
class Calc {
//	static(클래스)멤버는 객체 생성없이 클래스 이름으로 사용 가능
//	public static int abs(int a) {
//	non static(인스턴스)멤버는 객체 생성해야 사용됨
//	public int abs(int a) {
//	private 접근지정자는 같은 클래스 안에서만 접근 가능
//	private int abs(int a) {
//	protected int abs(int a) {접근 지정자는 같은 클래스 패키지만 + 다른패키지(상속)에서만 접근가능
	protected static int abs(int a) {
		return a>0?a:-a;//절대값 반환 
	}
	static int max(int a, int b) {
		return a>b?a:b;//둘중에 큰수 반환 
	}
	public static int min(int a, int b) {
		return a>b?b:a;//절대값 반환 
		
	}
}
public class CalcEx {
	public static void main(String[] args) {
//		스테틱 멤버로서 객체 생성없이 접근 가능
		System.out.println(Calc.abs(-5));
		System.out.println(Calc.max(10,8));
		System.out.println(Calc.min(-3,-8));
	}

}
