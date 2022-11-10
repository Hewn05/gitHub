package threadPrac;

class Result {
	int result = 100;

	public void calResult() {
		int temp = result;

		try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {
		}
		result /= 2;
	}
}

class CalThread extends Thread {
	Result result;

	public CalThread(Result result) {
		this.result = result;
	}

	public void run() {
		result.calResult();
		System.out.println(getName() + " " + result.result);
	}
}

class SyncCalThread extends Thread{
	Result result;
	
	public SyncCalThread(Result result) {
		this.result = result;
		System.out.println(getState());
	}
	public void run() {
		result.calResult();
		System.out.println(getName() +  + result.result);
		System.out.println(getState());
	}
}

public class NonSyncThreadRun {
	public static void main(String[] args) {
		Result res = new Result();
		
		Thread cal1 = new CalThread(res);
		cal1.setName("1번 쓰레드");
		cal1.start();
		
		Thread cal2 = new CalThread(res);
		cal2.setName("2번 쓰레드");
		cal2.start();
	}
}
