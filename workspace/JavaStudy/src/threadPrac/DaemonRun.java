package threadPrac;

class CoThread extends Thread{
	public void run() {
		System.out.println(getName());
		if(isDaemon()) {
			for(int i = 0;i < 6;i++) {
				System.out.println("	|★|");
				try {Thread.sleep(1000);} catch (InterruptedException e) {}
			}
		}else {
			for(int i = 0 ; i< 6;i ++) {
				System.out.println("|☆|");
				try {Thread.sleep(1000);} catch (InterruptedException e) {}
			}
			
		}
	}
}

public class DaemonRun {
	public static void main(String[] args) {
		Thread normalTh = new CoThread();
		normalTh.setName("normal thread");
		normalTh.setDaemon(false);
		normalTh.start();
		
		Thread daemonTh = new CoThread();
		daemonTh.setName("daemon thread");
		daemonTh.setDaemon(true);
		daemonTh.start();
		
		try {Thread.sleep(4000);} catch (InterruptedException e){}
		System.out.println("main terminated");

		
		
		
		
		
		
	}
}
