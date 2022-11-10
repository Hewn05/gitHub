package threadPrac;

class CommonUse {
	synchronized void commonMethod1() {
		for (int i = 0; i < 4; i++) {
			System.out.println(i + "|♬|");
			try { Thread.sleep(1000);} catch(InterruptedException e) {}
		}
	}
	
	synchronized void commonMethod2() {
		for (int i = 0; i < 4; i++) {
			System.out.println(i + "|♪|");
			try { Thread.sleep(3000);} catch(InterruptedException e) {}
		}
	}
	Object obj = new Object();
	void commonMethod3() {
		synchronized (obj) {
			for (int i = 0; i < 4; i++) {
				System.out.println(i + "|♩|");
				try { Thread.sleep(3000);} catch(InterruptedException e) {}
			}			
		}
	}

	void commonMethod4() {
		synchronized (obj) {
			for (int i = 0; i < 4; i++) {
				System.out.println(i + "|♭|");
				try { Thread.sleep(1000);} catch(InterruptedException e) {}
			}			
		}
	}
}

public class KeyThreadRun {
	public static void main(String[] args) {
		CommonUse cu = new CommonUse();
		
		new Thread() {
			public void run() {
				cu.commonMethod1();
			};
		}.start();
		
		new Thread() {
			public void run() {
				cu.commonMethod2();
			};
		}.start();

		new Thread() {
			public void run() {
				cu.commonMethod3();
			};
		}.start();
		
		new Thread() {
			public void run() {
				cu.commonMethod4();
			};
		}.start();

	}

}
