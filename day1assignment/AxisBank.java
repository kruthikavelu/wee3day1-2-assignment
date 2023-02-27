package week3.day1assignment;

public  class AxisBank  implements BankInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AxisBank bank=new AxisBank();
		bank.deposit();
		bank.Savings();
        bank.fixed();
	}

	public void Savings() {
		// TODO Auto-generated method stub
		System.out.println("Basic Saving Amount is 2000");
	}

	public void fixed() {
		// TODO Auto-generated method stub
		System.out.println("Fixed Deposits Are Avaliable Here");
	}

	public void deposit() {
		// TODO Auto-generated method stub
		System.out.println("Deposit Amount is Limited >5l");
	}

}
