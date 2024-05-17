package chapter06;

class Point3{
	private int x,y;
	public Point3(int x, int y) {
		this.x = x;
		this.y = y;
	}
//	equals 오버라이딩해서 객체의 값을 비교
	@Override
	public boolean equals(Object obj) {
		Point3 p =(Point3) obj;
		if (x == p.x && y == p.y){
			return true;
		} else {
			return false;
		}
	}
}

public class EqualsEx {
	public static void main(String[] args) {
		Point3 a = new Point3(2, 3);
		Point3 b = new Point3(2, 3);
		Point3 c = new Point3(3, 4);
		
		if (a == b) {//객체비교
			System.out.println("a == b");
		} else {
			System.out.println("a != b");

		}
//		equals : 기본은 객체 비교
//		aai equal not to b\
//		a is equal to b(객체의 값을 비교)
		if (a.equals(b)) {//객체비교
			System.out.println("a is equal to b");
		} else {
			System.out.println("a is equal not to b");
		}
		if (a.equals(c)) {//객체비교
			System.out.println("a is equal to c");
		} else {
			System.out.println("a is equal not to c");
		}
	}
}
