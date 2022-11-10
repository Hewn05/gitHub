package threadPrac;

class TimedThread extends Thread {
	public void run() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			System.out.println("Interrupted발생");
			for (long i = 0; i < 99999999L; i++) {
			}
		}
	}
}

public class TimedWaitingThreadRun {
	public static void main(String[] args) {
		
		Thread t = new TimedThread();
		t.start();
		
		try{
			Thread.sleep(200);
		}catch(InterruptedException e) {}
		System.out.println(t.getState());
		
		t.interrupt();
		try {
			Thread.sleep(100);
		}catch(InterruptedException e)
		{}
	}
}
