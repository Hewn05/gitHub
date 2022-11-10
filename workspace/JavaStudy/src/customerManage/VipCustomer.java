package customerManage;

public class VipCustomer extends Customer {
	private Manager manager;
	private double saleRatio;

	public VipCustomer(String customerName, String managerName) {
		super(customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		bonusPoint = 500;
		manager = new Manager(managerName);
		System.out.println("VipCustomer cons");
	}

	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int) (price * saleRatio);
	}

	public String getCustomerInfo() {
		return super.getCustomerInfo() + "|매니저 : " + manager.getManagerName();
	}

	public Manager getManagerID() {
		return manager;
	}
}
