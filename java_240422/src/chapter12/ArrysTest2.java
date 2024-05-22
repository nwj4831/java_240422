package chapter12;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrysTest2 {
	public static void main(String[] args) {
		String[] a= {"a","b","c","d"};
		int[] b = {1,5,5,7,3,3,42,6,8,4523,4,63,2,1};
		System.out.println(Arrays.asList(a)); //List 로
		List<String> list = Arrays.asList(a);
		System.out.println("@# list.get(0)==>"+list.get(0));
		
		Arrays.sort(b, 4, 14); //인덱스 정렬 (4~13)
		System.out.println(Arrays.toString(b)); // string으로
//		{1,5,5,7,3,3,42,6,8,4523,4,63,2,1} 
//		                  ||
//		[1, 5, 5, 7, 1, 2, 3, 3, 4, 6, 8, 42, 63, 4523]
		Arrays.sort(b); //오름차순 정렬
//		[1, 1, 2, 3, 3, 4, 5, 5, 6, 7, 8, 42, 63, 4523]
		System.out.println(Arrays.toString(b)); // string으로
		
		Arrays.sort(a, Collections.reverseOrder()); //문자열 내림차순
//		[d, c, b, a]
		System.out.println(Arrays.toString(a)); // string으로
		
		Arrays.sort(a); 
//		[a, b, c, d]
		System.out.println(Arrays.toString(a)); // string으로
		
		Arrays.sort(a,2,4,Collections.reverseOrder());; 
//		[a, b, d, c]
		System.out.println(Arrays.toString(a)); // string으로
		
		String[] cc = {"11","12","13","23","53","223","145","53"};
		Arrays.sort(cc,Collections.reverseOrder());
//		[53, 53, 23, 223, 145, 13, 12, 11]
		System.out.println(Arrays.toString(cc)); // string으로
		
		int[] c =Arrays.copyOf(b, b.length);
//		[1, 1, 2, 3, 3, 4, 5, 5, 6, 7, 8, 42, 63, 4523]
		System.out.println(Arrays.toString(c)); // string으로
		
		String[] d =Arrays.copyOf(a,3); // a배열 객체를 크기 3인 배열로 복사
//		[a, b, d]
		System.out.println(Arrays.toString(d)); // string으로
		
	}
}
