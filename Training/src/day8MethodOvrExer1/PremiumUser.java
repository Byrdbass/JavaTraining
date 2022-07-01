package day8MethodOvrExer1;

public class PremiumUser extends User {
	private int rewardPoints;

	public PremiumUser(int id, String userName, String emailId, double walletBalance) {
		super(id, userName, emailId, walletBalance);
		this.rewardPoints = rewardPoints;
	}


	public boolean makePayment(double billAmount) {
		if(super.makePayment(billAmount)) {
			this.rewardPoints+=.1*billAmount;
			return true;
		}
		return false;
	}
	
	public int getRewardPoints() {
		return rewardPoints;
	}
	public void setRewardPoints(int rewardPoints) {
		this.rewardPoints = rewardPoints;
	}
	
	

}
