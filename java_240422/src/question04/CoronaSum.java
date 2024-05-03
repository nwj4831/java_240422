package question04;

public class CoronaSum {
	public static void main(String[] args) {
//		int n[][]=new int [12][3]; 
		  int n[][] = {{11,12,13},
					{21,22,23},
					{31,32,33},
					{41,42,43},
					{51,52,53},
					{61,62,63},
					{71,72,73},
					{81,82,83},
					{91,92,93},
					{101,102,103},
					{111,112,113},
					{121,122,123}};
				
		int sum=0;
//		행 기준 (1월~12월), n.length:12
		for (int i = 0; i < n.length; i++) {
//			열 기준(3개의 도시, n[i].length : 3
			for (int j = 0; j < n[i].length; j++) {
//				n[i][j]=(i+1)*1+j;
//				System.out.print(n[i][j]+" ");
				sum += n[i][j];
			}
			System.out.println();
		}
		System.out.print("1년 전체 코로나 환자수는 "+sum);
	}
}
