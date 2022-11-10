package threadPrac;

import java.time.LocalTime;

class JoinThread extends Thread {
	@Override
	public void run() {
		System.out.println(LocalTime.now() + "Thread start");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			System.out.println("Interrupt발생");
		}
		;
		System.out.println(LocalTime.now() + "Thread end");
	}
}

public class JoinThreadRun {
	public static void main(String[] args) throws InterruptedException {
		Thread thread = new JoinThread();
		System.out.println(LocalTime.now() + "쓰레드 시작");
		thread.start();
		System.out.println(LocalTime.now() + "쓰레드 종료 대기");
		thread.join(3000);
		System.out.println(LocalTime.now() + "쓰레드 종료 확인" + thread.isAlive());

	}

}
