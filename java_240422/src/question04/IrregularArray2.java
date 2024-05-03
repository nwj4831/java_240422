package question04;

public class IrregularArray2 {
	public static void main(String[] args) {
//		1번째 방법
//		int n[][] = {{35,36,37},
//				{45},
//				{55,56,57,58},
//				{65,66},
//				{75,76,77}};
		int n[][] =new int [5][];
		n[0]=new int[5];
		n[1]=new int[1];
		n[2]=new int[4];
		n[3]=new int[2];
		n[4]=new int[3];
		
//		n.length : 5 (5번 반복)
		for (int i = 0; i < n.length; i++) {
			for (int j = 0; j < n[i].length; j++) {
//				n[i].length(5,1,4,2,3)
				n[i][j]=(i+3)*10+5+j;
				System.out.print(n[i][j]+" ");
			}
			System.out.println("");
		}		
	}
}
