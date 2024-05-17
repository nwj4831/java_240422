package question07;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListEx {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("이름을 입력하세요>>");
		
		List<String> list = new ArrayList<>();
		list.add(scanner.next());
		list.add(scanner.next());
		list.add(scanner.next());
		list.add(scanner.next());
		
		for (int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.print(str+" ");
			}
		System.out.println("가장 긴 이름은");
		}
}
