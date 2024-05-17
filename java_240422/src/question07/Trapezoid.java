package question07;

import java.util.Scanner;
class GetArea{
	public double getArea(int a, int b, int c) {
		return (a+b)*c/2;
	}
}

public class Trapezoid {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("밑변,아랫변,높이를 쓰세요");
		int down,up,height;
		down=scanner.nextInt();
		up=scanner.nextInt();
		height=scanner.nextInt();
		GetArea g = new GetArea();
		
		System.out.println(g.getArea(down, up, height));
		scanner.close();
	}
	
	
}
