package threadPrac;

class SaveBox {
	boolean isEmpty = true;
	int num;

	synchronized void inputNum(int num) {
		if (!isEmpty) {try {wait();	} catch (InterruptedException e) {	}}	
		
		this.num = num;
		System.out.println("input : " + num);		
		isEmpty = false;
		notify();
	}

	synchronized void outputNum() {
		if (isEmpty) {try {wait();	} catch (InterruptedException e) {	}}
		
		System.out.println("output : " + num);
		isEmpty = true;
		notify();
	}
}

public class ThreadWaitNotifyRun {
	public static void main(String[] args) {
		SaveBox sb = new SaveBox();

		Thread t1 = new Thread() {
			public void run() {
				for (int i = 0; i < 10; i++) {
					sb.inputNum(i);
				}
			}
		};

		Thread t2 = new Thread() {
			public void run() {
				for (int i = 0; i < 10; i++) {
					sb.outputNum();
				}
			}
		};
		t1.start();
		t2.start();
	}
}
