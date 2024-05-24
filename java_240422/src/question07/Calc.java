package question07;

import java.util.Scanner;
class Add {
	int a,b;
	void setValue(int a, int b) {
		this.a=a; 
		this.b=b;
	}
	int calculate() {
		return a+b;
	}
}
class Sub {
	int a,b;
	void setValue(int a, int b) {
		this.a=a; 
		this.b=b;
	}
	int calculate() {
		return a-b;
		}
}
class Mul {
	int a,b;
	void setValue(int a, int b) {
		this.a=a; 
		this.b=b;
	}
	int calculate() {
		return a*b;
	}
}
class Div{
	int a,b;
	void setValue(int a, int b) {
		this.a=a; 
		this.b=b;
	}
	int calculate() {
		@SuppressWarnings("unused")
		int res=0;
		try {
			res=a/b;
		} catch (Exception e) {
			System.out.println("0으로 나눌수 없습니다.");
		}
		return a/b;
	}
}
public class Calc {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("두 정수와 연산자를 입력하시오>>");
		int a = scanner.nextInt();
        int b = scanner.nextInt();
        char operator = scanner.next().charAt(0);
        
        switch (operator) {
        case '+':
            Add add = new Add();
            add.setValue(a, b);
            System.out.println("결과: " + add.calculate());
            break;
        case '-':
            Sub sub = new Sub();
            sub.setValue(a, b);
            System.out.println("결과: " + sub.calculate());
            break;
        case '*':
            Mul mul = new Mul();
            mul.setValue(a, b);
            System.out.println("결과: " + mul.calculate());
            break;
        case '/':
            Div div = new Div();
            div.setValue(a, b);
            System.out.println("결과: " + div.calculate());
            break;
        default:
            System.out.println("잘못된 연산자 입력");
    }

    scanner.close();
        
	}
}
