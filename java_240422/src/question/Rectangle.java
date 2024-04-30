package question;

import java.util.Scanner;

public class Rectangle {
	public static void main(String[] args) {
		System.out.println("점(x,y)의 좌표를 입력하시오");
		Scanner scan = new Scanner(System.in);
		int x =scan.nextInt();
		int y =scan.nextInt();
//		x>=100 ,x <=200 
//		y>=100 ,y <=200 
//  	|| = or  &&= and
//		if ((100 <=x =<200 ) && (100<= y <= 200) ) 이건 안됨
		if ((x>=100 && x<=200)&&(y>=100 && y<=200)) {
			System.out.println("("+x+","+y+") 안에 있다");
		} else {
			System.out.println("안에 없다");
		}
	scan.close();
	}
}
