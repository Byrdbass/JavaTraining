package IntefaceExer1;

public class Seller implements Tax {
	private String location;
	private double taxPercentage;
	

	public Seller(String location) {
		this.location = location;
	}
	
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public double getTaxPercentage() {
		return taxPercentage;
	}
	public void setTaxPercentage(double taxPercentage) {
		this.taxPercentage = taxPercentage;
	}



	@Override
	public double calculateTax(double price) {
		if (this.location.equals("Middle east")) {
			this.taxPercentage = 15;
		}
		else if (this.location.equals("Europe")) {
			this.taxPercentage = 25;
		}
		else if (this.location.equals("Canada")) {
			this.taxPercentage = 22;
		}
		else if (this.location.equals("Japan")) {
			this.taxPercentage = 12;
		}
		else
			System.out.println("Invalid location");
		double taxToBePaid = price * (this.taxPercentage/100);

		return taxToBePaid;
	}

}
