package question08;
class Point4 {
	 private int x, y;
	 public Point4(int x, int y ) {this.x = x; this.y = y;}
	 public int getX() {return x;}
	 public int getY() {return y;}
	 protected void move(int x, int y) {this.x = x; this.y = y;}
}
public class PositivePoint extends Point4{
	private int z;
	public int getZ() {return z;}
	public PositivePoint(int x, int y) {
        super(x, y);
        if (x<0 || y<0) {
			super.move(0, 0);
		}
	}
	public PositivePoint() {
		super(0,0);
	}
	@Override
    public String toString() {
        return   "(" + getX() + "," + getY() +")의 점";
	}
	protected void move(int x, int y) {
		if (x>0 && y>0) {
			super.move(x, y);
		}
	}

	public static void main(String[] args) {
		PositivePoint p = new PositivePoint();
		p.move(10, 10);
		System.out.println(p.toString() + "입니다.");
		
		p.move(-5, 5);
		// 음수 때문에 실행되지 않아서 위에값이 나오게됨
		System.out.println(p.toString() + "입니다.");
		
		PositivePoint p2 = new PositivePoint(-10, -10);
		System.out.println(p2.toString() + "입니다.");
	}
}
