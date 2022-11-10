public class Account {
	// 필드를 작성해 주세요
	// 생성자를 만들어 주세요
	// 메소드를 구현해 주세요
	private int id;
	private String password;
	private String ownerName;
	private int balance;

	public Account(int id, String password, String name) {
		this.id = id;
		this.password = password;
		ownerName = name;
		balance = 0;
	}

	public void deposit(int money) {
		balance += money;
	}

	public int withdraw(int money, String password) {
		if (!isCorrectPassword(password)) {
			System.out.println("Wrong Password");
			return 0;
		} else {
			if (balance >= money) {
				balance -= money;
				return money;
			} else {
				System.out.println("Not Enough Money");
				return 0;
			}
		}
	}
	
	public int checkBalance(String password) {
		if(!isCorrectPassword(password)) {
			System.out.println("Wrong Password");
			return 0;
		} else {
			return balance;
		}
	}
	
	private boolean isCorrectPassword(String password) {
		if(this.password.equals(password))
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		// 계좌 생성
		Account account = new Account(1, "password!@#", "Park");
		// 10만원 입금
		account.deposit(100000);
		// 잔액 확인
		System.out.println(account.checkBalance("password!@#"));
		// 2만원 출금
		account.withdraw(20000, "password!@#");
		// 잔액 확인
		System.out.println(account.checkBalance("password!@#"));
	}
}