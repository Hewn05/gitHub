package throwable;

public class CustomExceptionRun {

	public static void main(String[] args) throws Exception {
		Sample s = new Sample();
		try {
			s.sayNic("바보");
			s.sayNic("말미잘");
		} catch (FoolException e) {	
			System.err.println("foolexcpt");
		}

	}

}

class Sample {
	public void sayNic(String nick) throws Exception {
//		try {
			if (nick.equals("바보")) {
				throw new FoolException();
			} else {
				System.out.println("당신의 별명은 <" + nick + "> 입니다.");
			}
//		} catch (FoolException e) {
//			System.err.println("FoolException");
//		}
	}
}

class FoolException extends Exception {

}