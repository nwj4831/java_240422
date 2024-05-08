package chapter04;

class Circle4{}
class Circle3{
//	4.멤버 저장됨
	int radius;
	public double getArea() {
		return 3.14*radius*radius;
	}
//	2. i를 radius=0
	public Circle3(int radius) {
//		3.매개변수를 멤버에 저장
		this.radius = radius;
	}
}
public class CircleArray {
	public static void main(String[] args) {
		Circle3[] c;//객체배열 Circle3을 참조변수 c로 선언
		c= new Circle3[5];//객체배열 생성 -> 참조변수5개 크기(c[0]~c[4])
//		c.length = 5
		for (int i = 0; i < c.length; i++) {
//			1.i=0 => 객체생성->생성자호출
			c[i] = new Circle3(i);//객체 생성(c[0]~c[4]참조 변수가 객체를 가리킴)
		}
		for (int i = 0; i < c.length; i++) {
//			5개 객체의 각각의 메소드 호출해서 다른 원의 넓이를 구함
			System.out.println(c[i].getArea());
		}
	}
}
/*
 * jvm ->CircleArray ->
 * CircleArray : 현대자동차
 * 투싼: circle3 => 자동차를 만든다 (객체생성)
 * Circle3[] c : 투싼 자동차 이름
 * c= new Circle3[5]: 5개의 자동차 생산하는 라인
 * c[i] = new Circle3(i) : 자동차 생산
 * c[i].getArea() : 검정색 도색
 * c[i].getArea2() : 빨간색 도색
 * 
 * circle4 : 아반떼
 * 
 * 
 */







