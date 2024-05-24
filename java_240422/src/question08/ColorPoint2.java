package question08;
class Point2 {
//	 public Point2() {}
	 private int x, y;
	 public Point2(int x, int y) {this.x = x; this.y = y;}
	 public int getX() {return x;}
	 public int getY() {return y;}
	 protected void move(int x, int y) {this.x = x; this.y = y;}
}
public class ColorPoint2 extends Point2 {
	private String color;  // ="BLACK";
    public ColorPoint2(int x, int y) {
        super(x, y);
        this.color="BLACK"; 
    }
	public ColorPoint2() {
		this(0,0); //이렇게 하면 부모클래스 매개변수2개짜리 생성자호출됨
	}
	public void setXY(int x, int y) {
    	super.move(x, y);
    }
    public void setColor(String color) {
        this.color = color;
    }
    @Override
    public String toString() {
        return color + "색의 (" + getX() + "," + getY() + ")";
    }
	public static void main(String[] args) {
		ColorPoint2 zeroPoint = new ColorPoint2();
		System.out.println(zeroPoint.toString() + "입니다.");
		ColorPoint2 cp = new ColorPoint2(10, 10);
		cp.setXY(5, 5);
		cp.setColor("RED");
		System.out.println(cp.toString() + "입니다.");
	}
}

//String str = cp.toString();
//		ColorPoint2 cp = new ColorPoint2(5, 5, "YELLOW");
//		cp.setXY(10, 20);
//		cp.setColor("RED");