package verify.exam19;

public class Account {
	// 작성 위치
	/*
	 * static final double MIN_BALNCE = 0; static final double MAX_BALNCE = 1000000;
	 * private int balance;
	 * 
	 * public int getBalance() { return balance; }
	 * 
	 * public void setBalance(int balance) { if (balance < MIN_BALNCE || balance >
	 * MAX_BALNCE) { this.balance = 0; return;// } else { this.balance =+balance; }
	 * }
	 */
	
	private int balance;
	
	void setBalance(int balance) {
		if (balance<0||balance>1000000) return;
		this.balance= balance;
	}
		int getBalance(){
			return balance;}
		}//
//}//