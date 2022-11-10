package threadPrac;

class BlockedClass {
	CommonClass cc = new CommonClass();
	
	Thread t1 = new Thread("thread1") {
		public void run() {
			cc.syncMethod();
		};
	};
	
	Thread t2 = new Thread("thread2") {
		public void run() {
			cc.syncMethod();
		};
	};
	
	Thread t3 = new Thread("thread3") {
		public void run() {
			cc.syncMethod();
		};
	};
	
	void startThread() {
		t1.start();
		t2.start();
		t3.start();
	}
	
	class CommonClass {
		synchronized void syncMethod() {
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {}
			System.out.println(Thread.currentThread().getName());
			System.out.println("thread1 : " + t1.getState());
			System.out.println("thread2 : " + t2.getState());
			System.out.println("thread3 : " + t3.getState());
			for(long i = 0;i < 999999999999L;i++) {}
			
		}
	}
}

public class BlockedThreadRun {
	public static void main(String[] args) {
		BlockedClass bc = new BlockedClass();
		bc.startThread();
		
		
	}
}
