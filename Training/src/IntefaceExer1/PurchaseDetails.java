package IntefaceExer1;

public class PurchaseDetails implements Tax {
	
	private String purchaseId;
	private String paymentType;
	private double taxPercentage;
	

	public PurchaseDetails(String purchaseId, String paymentType) {
		this.purchaseId = purchaseId;
		this.paymentType = paymentType;
	}
	

	public String getPurchaseId() {
		return purchaseId;
	}
	public void setPurchaseId(String purchaseId) {
		this.purchaseId = purchaseId;
	}
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	public double getTaxPercentage() {
		return taxPercentage;
	}
	public void setTaxPercentage(double taxPercentage) {
		this.taxPercentage = taxPercentage;
	}


	@Override
	public double calculateTax(double price) {
		
		if (this.paymentType.equals("Debit Card")) {
			this.setTaxPercentage(.02);
		}
		else if (this.paymentType.equals("Credit Card")) {
			this.setTaxPercentage(.03);
		}
		else {
			this.setTaxPercentage(.04);
		}
		double priceAfterTax = this.taxPercentage * price + price;
		return priceAfterTax;
	}

}
