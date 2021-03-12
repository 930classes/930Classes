package myinheritancepackage;

public class MyChlidClass extends MyParantClass{
	
	private int money;
	
	public void pocketMoney() {
		money = 5000;
		super.money = 60000;
		super.job();
	}
	
	public void living() {
		super.living();
	}


}
