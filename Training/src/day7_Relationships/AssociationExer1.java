//package day7_Relationships;
//
//public class AssociationExer1 {
//
//	class CabServiceProvider{
//		private String cabServiceName;
//		private int totalCabs;
//		
//		double calculateRewardPrice(Driver driver) {
//			float driverRating = driver.getAverageRating();
//			double rewardPrice = 0;
//			
//			if(this.cabServiceName.equals("Halo")) {
//				if(driverRating >= 4.5f && driverRating <= 5f) {
//					rewardPrice = 10 * driverRating;
//				}
//				else if (driverRating >=4.0f && driverRating < 4.5f) {
//					rewardPrice = driverRating *5;
//				}
//			}
//			else if(this.cabServiceName.equals("Aber")) {
//				if(driverRating >= 4.5f && driverRating<=5f) {
//					rewardPrice = driverRating *8;
//				}
//				else if (driverRating >=4 && driverRating <4.5) {
//					rewardPrice = driverRating *3;
//				}
//			}
//			else {
//				rewardPrice = 0;
//			}
//			
//			
//			return Math.round(rewardPrice*100)/100.0;
//		}
//
//		public CabServiceProvider(String cabServiceName, int totalCabs) {
//			super();
//			this.cabServiceName = cabServiceName;
//			this.totalCabs = totalCabs;
//		}
//		public String getCabServiceName() {
//			return cabServiceName;
//		}
//		public void setCabServiceName(String cabServiceName) {
//			this.cabServiceName = cabServiceName;
//		}
//		public int getTotalCabs() {
//			return totalCabs;
//		}
//		public void setTotalCabs(int totalCabs) {
//			this.totalCabs = totalCabs;
//		}
//	}
//
//	class Driver {
//		
//		private String driverName;
//		private float averageRating;
//		
//		public Driver(String driverName, float averageRating){
//			this.driverName=driverName;
//			this.averageRating=averageRating;
//		}
//		
//		public String getDriverName(){
//			return this.driverName;
//		}
//		
//		public void setDriverName(String driverName){
//			this.driverName=driverName;
//		}
//		
//		public float getAverageRating(){
//			return this.averageRating;
//		}
//		
//		public void setAverageRating(float averageRating){
//			this.averageRating=averageRating;
//		}
//
//	    //DO NOT MODIFY THE METHOD
//	    //Your exercise might not be verified if the below method is modified
//	    public String toString(){
//	        return "Driver\ndriverName: "+this.driverName+"\naverageRating: "+this.averageRating;
//	    }
//	}
//
//	class Tester {
//		
//		public static void main(String args[]){
//		    CabServiceProvider cabServiceProvider1 = new CabServiceProvider("Halo", 50);
//
//			Driver driver1 = new Driver("Luke", 4.8f);
//			Driver driver2 = new Driver("Mark", 4.2f);
//			Driver driver3 = new Driver("David", 3.9f);
//			
//			Driver[] driversList = { driver1, driver2, driver3 };
//			for (Driver driver : driversList) {
//				System.out.println("Driver Name: "+driver.getDriverName());
//				double bonus = cabServiceProvider1.calculateRewardPrice(driver);
//				if (bonus>0)
//					System.out.println("Bonus: $"+bonus+"\n");
//				else
//					System.out.println("Sorry, bonus is not available!");
//			}
//			
//		    CabServiceProvider cabServiceProvider2 = new CabServiceProvider("Aber", 50);
//
////Create more objects of CabServiceProvider and Driver classes for testing your code
//		}
//	}
//
//
//}
