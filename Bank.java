public class Bank {
	int checking;
	int savings;
	
	Bank(int checking, int savings){
		this.checking = checking;
		this.savings = savings;
	}
	
	
	public void depositSavings(int amount) {
		this.savings += amount;
	}
	
	public void depositChecking(int amount) {
		this.checking += amount;
	}
	
	public int getChecking(){
		System.out.println(checking);
		return this.checking;
	}
	
	public int getSavings() {
		System.out.println(savings);
		return savings;
	}
	
	public void getAccBalance() {
		System.out.println("Savings: " + this.checking);
		System.out.println("Checking: " + this.savings);
	}


	public static void main(String[] args) {
		Bank CC = new Bank(0, 0);
		CC.depositChecking(50);
		CC.depositChecking(100);
		CC.getAccBalance();
		CC.depositSavings(100);
		CC.getAccBalance();

	}

}
