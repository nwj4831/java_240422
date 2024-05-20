package chapter09;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample2 {
//	throws Exception : 파일이 없을 경우 예외 발생
	public static void main(String[] args) throws Exception {
//		InputStream : 바이트 단위 입력을 위한 최상위 스트림 클래스
//		FileInputStream : 바이트 단위 입력을 위한 하위 스트림 클래스
		InputStream is = new FileInputStream("D:\\test.txt");//upcasting
		int readByte;
		byte[] readBytes= new byte[3];
		String data="";
		
		while (true) {
//			readByte = is.read(); //1byte 단위로 읽는다.(정수로 받음) : 호미
			readByte = is.read(readBytes); //3byte 단위로 읽는다.(정수로 받음) : 삽(더빠르게) 
			if (readByte == -1) {
				break;
			}
//			문자3개를 형변환하면서 오류 ex> aaa-> char
//			System.out.print((char)readByte); //형변환
//			readBytes 를 0인덱스에서 readByte 길이만큼 읽는다.
			data+= new String(readBytes, 0, readByte);
		}
		System.out.println(data);

		is.close();
	}
}
