package customerManage;

public class Customer {

	static int seqNum = 1000;
	protected int customerID;
	String customerName;
	String customerGrade;
	int bonusPoint;
	double bonusRatio;

	public Customer(String customerName) {
		customerID = seqNum++;
		this.customerName = customerName;
		customerGrade = "SILVER";
		bonusPoint = 100;
		bonusRatio = 0.01;
		System.out.println("Customer cons");
	}

	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}

	public String getCustomerInfo() {
		return "이름 : " + customerName + " | 등급 : " + customerGrade + "| 보너스포인트 : " + bonusPoint;
	}
	
	public int getCustomerID() {
		return customerID;
	}
	
	public void setCustomerID(String customerName) {
		this.customerName = customerName;
	}

	public static int getSeqNum() {
		return seqNum;
	}

	public String getCustomerName() {
		return customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public int getBonusPoint() {
		return bonusPoint;
	}

	public double getBonusRatio() {
		return bonusRatio;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}

	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}

	public void setBonusRatio(double bonusRatio) {
		this.bonusRatio = bonusRatio;
	}
	
	
	
	
	
	
}
