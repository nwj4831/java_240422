package chapter11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientEx {
	public static void main(String[] args) {
		Socket socket=null; //클라이언트 소켓 선언
		BufferedReader in =null; //입력: 클라이언트에서 들어오는 데이터
		BufferedWriter out =null; // 출력: 서버에서 보내는 데이터
		Scanner scanner= new Scanner(System.in);
		
		try {
//			서버 ip와 포트를 가지고 소켓객체 생성
		// 소켓 객체로 데이터를 주고 받음
			socket = new Socket("localhost", 8888);
			//입력: 클라이언트에서 들어오는 데이터
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			//출력: 서버에서 보내는 데이터
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			while (true) {
				System.out.print("보내기>>");
				String outputMessage = scanner.nextLine();//클라이언트에서 보내는 메시지
				if (outputMessage.equals("bye")) {
					out.write(outputMessage+"\n");//서버로 메시지 보내기
					out.flush();// 비정상적인 종료일때 메시지 재전송
					break;
				}
				out.write(outputMessage+"\n"); //서버로 메시지 보내기
				out.flush();// 비정상적인 종료일때 메시지 재전송
				String inputMessage = in.readLine();
				System.out.println("서버: "+inputMessage);//서버에서 온 메시지
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
//		자동 반납(예외발생까지 고려)
			try {
				scanner.close();
				socket.close();
			} catch (Exception e2) {// 서버와 클라이언트 간에 입출력시 예외 발생
			System.out.println("서버와 채팅 중 오류가 발생했습니다.");
			}
		}

	}
}
