package throwable;

class CustomResources implements AutoCloseable{

	public CustomResources() {
		System.out.println("CustomResources 생성자");
	}

	public void printMessage() {
		System.out.println("CustomResources 실행메소드");
	}
	
	public void close() throws Exception {
		System.out.println("CustomResources 요소 반환");
		
	}
		
}

class CustomResources2 implements AutoCloseable{

	public CustomResources2() {
		System.out.println("CustomResources2 생성자");
	}

	public void printMessage() {
		System.out.println("CustomResources2 실행메소드");
	}
	
	public void close() throws Exception {
		System.out.println("CustomResources2 요소 반환");
		
	}
		
}

public class CustomResourceClose {

	public static void main(String[] args) {
		try(CustomResources cus = new CustomResources();
				CustomResources2 cus2 = new CustomResources2();){
			cus.printMessage();
			cus2.printMessage();
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
