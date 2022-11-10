package customerManage;

public class GoldCustomer extends Customer{
	
	private double saleRatio;
	
	public GoldCustomer(String customerName) {
		super(customerName);
		customerGrade = "GOLD";
		bonusRatio = 0.03;
		saleRatio = 0.05;
		bonusPoint = 300; 
		System.out.println("GoldCustomer cons");
	}
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio);
	}
}
