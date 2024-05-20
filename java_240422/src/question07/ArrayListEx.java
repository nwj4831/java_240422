package question07;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		ArrayList<String> a = new ArrayList<>();
		
		for (int i = 0; i < 4; i++) {
			System.out.println("이름을 입력하세요>>");
			String s =(scanner.next());
			a.add(s);
		}
		for (int i = 0; i < a.size(); i++) {
			String name =a.get(i);
			System.out.print(name+" ");
			}
		int longestIndex=0;
		for (int i = 0; i < a.size(); i++) {
//			a.get(0).length()< a.get(0).length()
//			a.get(0).length()< a.get(1).length() = 참이면 longesIndex=i
//			a.get(0or1).length()< a.get(2).length() = 참이면 longesIndex=i
//			a.get(0or1or2).length()< a.get(3).length() = 참이면 longesIndex=i
			if (a.get(longestIndex).length() <a.get(i).length()) {
				longestIndex= i;
			}
		}
		System.out.println("가장 긴 이름은"+a.get(longestIndex));
		scanner.close();
		}
} 
