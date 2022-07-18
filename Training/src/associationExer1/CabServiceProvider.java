package associationExer1;

class CabServiceProvider{
	private String cabServiceName;
	private int totalCabs;
	public CabServiceProvider(String cabServiceName, int totalCabs) {
		this.cabServiceName = cabServiceName;
		this.totalCabs = totalCabs;
	}
	
	double calculateRewardPrice(Driver driver) {
		float driverRating = driver.getAverageRating();
		double rewardPrice = 0;
		
		if(this.cabServiceName.equals("Halo")) {
			if(driverRating >= 4.5f && driverRating <= 5f) {
				rewardPrice = 10 * driverRating;
			}
			else if (driverRating >=4.0f && driverRating < 4.5f) {
				rewardPrice = driverRating *5;
			}
		}
		else if(this.cabServiceName.equals("Aber")) {
			if(driverRating >= 4.5f && driverRating<=5f) {
				rewardPrice = driverRating *8;
			}
			else if (driverRating >=4 && driverRating <4.5) {
				rewardPrice = driverRating *3;
			}
		}
		else {
			rewardPrice = 0;
		}
		
		
		return Math.round(rewardPrice*100)/100.0;
	}


	public String getCabServiceName() {
		return cabServiceName;
	}
	public void setCabServiceName(String cabServiceName) {
		this.cabServiceName = cabServiceName;
	}
	public int getTotalCabs() {
		return totalCabs;
	}
	public void setTotalCabs(int totalCabs) {
		this.totalCabs = totalCabs;
	}
}