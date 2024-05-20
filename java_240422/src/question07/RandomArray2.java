package question07;

import java.util.Scanner;

public class RandomArray2 {
//	난수의 중복체크하는 메소드
//	a[]; array, to:0 r:23
	public static boolean exists(int a[],int to, int r) {
		//0: 반복안함
//		0<1
//		0<2
		for (int i = 0; i < to; i++) {
//			a[0]:23 r:33
//			a[0]:23 r:33, a[1]:33, r=33
			if (a[i] == r) {
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("정수 몇개?");
		int n = scanner.nextInt();
		int array[] = new int[n];
		
		for (int i = 0; i < array.length; i++) {
			int r =(int)(Math.random()*100+1);
			if (exists(array, i, r)) {
				i--;
				continue;
			}
//			array[0]=23
//			array[1]=33
			array[i]=r;
			if (i==0) {
				System.out.print(array[i]+" ");
			} else {
				if (i%10 == 0) {
					System.out.println();
				}
				System.out.print(array[i]+" ");
			}
		}
		scanner.close();
	}
}

//		Scanner scanner=new Scanner(System.in);
//		System.out.print("정수 몇개?");
//		int a = scanner.nextInt();
//		
//		int n[] = new int[a];
//		Set<Integer> set = new HashSet<>();
//        Random random = new Random();
//        
//        while (set.size() < a) {
//            set.add(random.nextInt(100) + 1);
//        }
//        
//        int index = 0;
//        for (int num : set) {
//            System.out.print(num + " ");
//            if (++index % 10 == 0) {
//                System.out.println();
//            }
//        }