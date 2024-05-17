package question07;
//중상급 b6
import java.util.StringTokenizer;
  
public class StringTokenizerEx {
		
	
	public static void main(String[] args) {
		String a = "홍길동/장화/홍련/콩쥐/팥쥐";
		//st객체는 홍길동,장화,홍련,콩쥐,팥쥐 5개의 토큰을 가진다
		StringTokenizer st = new StringTokenizer(a,"/");
		while (st.hasMoreTokens()) { // 토큰이 있으면 참
			System.out.println(st.nextToken()); //토큰 꺼내온다
		}
	}
}
