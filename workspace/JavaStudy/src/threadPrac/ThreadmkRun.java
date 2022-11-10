package threadPrac;

class DdukThread extends Thread {
	public void run() {
		String[] lman = { "짝", "떡", "짝", "떡", "짝", "떡", "짝", "떡" };

		for (int i = 0; i < lman.length; i++) {
			System.out.println("왼쪽 " + lman[i]);
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
			}
		}
	}
}

class DdukRunable implements Runnable{
	@Override
	public void run() {
		String[] lman = { "쿵", "쿵", "쿵", "쿵", "쿵", "쿵", "쿵", "쿵" };
		
		for (int i = 0; i < lman.length; i++) {
			System.out.println("오른쪽 " + lman[i]);
			try {Thread.sleep(300);} catch (InterruptedException e) {}
		}
	}	
}

public class ThreadmkRun {

	public static void main(String[] args) {
		Thread ldduk = new DdukThread();
		ldduk.start();
		
		Runnable rman = new DdukRunable();
		Thread rdduk = new Thread(rman);
		rdduk.start();
		
		Thread tdduk = new Thread(new Runnable() {
			@Override
			public void run() {
				String[] lman = { "핫", "핫", "핫", "핫", "핫", "핫", "핫", "핫" };				
				for (int i = 0; i < lman.length; i++) {
					System.out.println("가운데 " + lman[i]);
					try {Thread.sleep(300);} catch (InterruptedException e) {}
				}			
			}			
		});
		tdduk.start();

	}
}
