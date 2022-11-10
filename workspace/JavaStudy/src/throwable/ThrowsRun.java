package throwable;

public class ThrowsRun {

//	static void handleException() throws Exception {
//		try {
//			System.out.println("호출된 메소드");
//			Exception e = new Exception();
//			throw e;
//		}catch(Exception e) {
//			System.out.println("호출된 메소드에서 예외처리");
//		}
//	}

	static void handleException() throws Exception {
		throw new Exception();
	}

	public static void main(String[] args) throws Exception {
		try {
			handleException();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("메소드에서 발생한 예외회피를 main에서 예외처리함");
		}
	}

}
