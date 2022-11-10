package throwable;

public class ArithmeticRun {

	public static void main(String[] args) {
		try {
			byte[] list = { 'a', 'b', 'c' };
			System.out.println(list[5]);
			System.out.println(5 / 0);
		} catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println("+++\n" + e.getMessage() + "\n+++");
			System.out.println("+++\n" + e.toString() + "\n+++");
		} catch (ArrayIndexOutOfBoundsException e) {
			
		}
		
		finally {
			System.out.println("finally");
		}

	}

}
