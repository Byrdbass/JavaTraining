package assignmentSet7Exception;

public class BusBooking {
	private int bookingId;
	private String destination;
	private String tripPackage;
	private double totalAmount = 0;
	
	public BusBooking(int bookingId, String destination, String tripPackage) {
		this.bookingId = bookingId;
		this.destination = destination;
		this.tripPackage = tripPackage;
	}
	
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getTripPackage() {
		return tripPackage;
	}
	public void setTripPackage(String tripPackage) {
		this.tripPackage = tripPackage;
	}
	
	public String bookTrip(String couponCode, int numberOfMembers) {
		if(
				this.destination.equals("Washington DC")|| 
				this.destination.equals("Philadelphia")||
				this.destination.equals("Orlando")||
				this.destination.equals("Boston")||
				this.destination.equals("Atlanta")
				) 
		{
			InvalidDestinationException wrongDest = new InvalidDestinationException();
		}
		
		return "completed trip booking";
	}
	
	public boolean validateCouponCode(String couponCode, int numberOfMembers) {
		try {
			this.validateCouponCode(couponCode, numberOfMembers);
			return true;
		}
		catch(Exception e){
			return false;
		}
	}

}
