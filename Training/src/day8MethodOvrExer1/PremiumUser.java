package day8MethodOvrExer1;

public class PremiumUser extends User {
	int rewardPoints;
	boolean makePayment(double billAmount) {
		if(super.makePayment(billAmount)) {
			this.rewardPoints+=
		}
		
		return false;
	}
	public PremiumUser(int rewardPoints) {
		super(id,userName,emailId,walletBalance);
		this.rewardPoints = rewardPoints;
	}
	
	public int getRewardPoints() {
		return rewardPoints;
	}
	public void setRewardPoints(int rewardPoints) {
		this.rewardPoints = rewardPoints;
	}
	
	

}
