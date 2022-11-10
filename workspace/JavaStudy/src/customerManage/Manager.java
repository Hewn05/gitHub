package customerManage;

public class Manager {
	static int seqNum2 = 2000;

	private int managerID;
	private String managerName;

	public Manager(String managerName) {
		managerID = seqNum2++;
		this.managerName = managerName;
	}

	public int getManagerID() {
		return managerID;
	}

	public String getManagerName() {
		return managerName;
	}

	public void setManagerID(int managerID) {
		this.managerID = managerID;
	}

	public void setMangerName(String mangerName) {
		this.managerName = mangerName;
	}

}
