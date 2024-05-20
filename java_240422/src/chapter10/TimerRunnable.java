package chapter10;

//Runnable인터페이스 사속 받아서 스레드 구현
public class TimerRunnable implements Runnable {
	int n=0;
	@Override
	public void run() {
		while (true) {
			System.out.println(n);
			n++;
			try {
				Thread.sleep(1000);//1초마다 실행
//				예외 발생할때 e로 catch 해서
			} catch (InterruptedException e) {
//				printStackTrace 메소드로 예외처리 기본 메시지를 출력
				e.printStackTrace();
			}
		}
	}
}