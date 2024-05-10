package chapter05;
/*
 * point 클래스: (x,y) 한점을 표현
 * point 클래스 상속받는 ColorPointEx 클래스(색을 가진점)
 */
class point{
	private int x,y; // 4.(1,2)
	public void set(int x, int y) {//2(1.2)
	this.x = x; this.y = y;
	}
	public void showPoint() {
		System.out.println("("+x+","+y+")");
	}
}	
//	서브 클래스(자식)
class ColorPoint extends point{// 슈퍼 클래스(부모)
	private String color; //4.("red")
	public void setColor(String color) {//setter 2.("red")
		this.color = color;//3.("red")
	}
	public void  showColorPoint() {
		System.out.print(color);
		showPoint();	
	}
}
public class ColorPointEx {
	public static void main(String[] args) {
			point p =new point(); // 객체를 생성, 멤버는 4개, 생성자 호출(기본)
//			1.메소드호출
			p.set(1, 2);
			p.showPoint();
			
			//객체를 생성, 멤버는  7개, 생성자 호출(기본):point(슈퍼) -> ColorPoint(서브)
			ColorPoint cp = new ColorPoint();
			cp.set(3, 4);
			cp.showPoint();
//			1.red 값을 가지고 메소드 호출
			cp.setColor("red");
			cp.showColorPoint();
			
	}
}
