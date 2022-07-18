package practiceTestEx1;

import java.util.Arrays;

class BuildingForRent {
	private int buildingDimensions;
	private float advanceAmount;
	
	public BuildingForRent(int buildingDimensions){
		this.buildingDimensions=buildingDimensions;
	}
	
	public float getAdvanceAmount(){
		return this.advanceAmount;
	}
    
    public void setAdvanceAmount(float advanceAmount){
    	this.advanceAmount = advanceAmount;
    }
        
    public int getBuildingDimensions(){
    	return this.buildingDimensions;
    }
    
    public void calculateAdvanceAmount(){
        float advanceAmount = -1.0f;
        if(this.buildingDimensions>0){
            advanceAmount=this.buildingDimensions*10;
        }
        this.advanceAmount=advanceAmount;
  }

	@Override
	public String toString() {
		return "BuildingForRent (buildingDimensions=" + this.buildingDimensions
				+ ")";
	}
   
}

class HouseForRent extends BuildingForRent{
	
	private static String[][] facilitiesDetailsArr = {{"Security","Parking","Amusement-Park"},{"2000","3400","2900"}};
    private String[] facilities;
	private int noOfBedrooms;
	
    public HouseForRent(int buildingDimensions,int noOfBedrooms,String[] facilities){
    	super(buildingDimensions); 
    	this.noOfBedrooms=noOfBedrooms;
        this.facilities = facilities;
    }
          
    public int getNoOfBedrooms(){
    	return this.noOfBedrooms;
    }
    
    public String[] getFacilities(){
    	return this.facilities;
    }
    
    //To_Trainee
    public Boolean validateNoOfBedrooms(){
    	//write your code here  	
    	if (noOfBedrooms > 0 && noOfBedrooms < 6){
    	return true;
    	}
    	
		//change return statement accordingly
		return false;
    }
   
        

    //To_Trainee
    @Override
    public void calculateAdvanceAmount(){
    	float advanceAmount;
    	super.calculateAdvanceAmount();
       float basicAmount = getAdvanceAmount();
       boolean bedValidate = validateNoOfBedrooms();
       if(basicAmount == -1.0f || bedValidate == false || facilities == null) {
       advanceAmount = -1.0f;
       }
       else {
        for(int i = 0; i<facilities.length ; i ++){
        	System.out.println("facilities: " + i);
           for(int j = 0; j< facilitiesDetailsArr.length ; j++){
        	   System.out.println("facility details:" + j);
        	   if(String.valueOf(facilities[i]).equals(String.valueOf(facilitiesDetailsArr[i]))) {
        		   System.out.println(facilitiesDetailsArr[i][j]);
        		   float facilityCharge = Float.valueOf(facilitiesDetailsArr[i][j]).floatValue();
        		   float totalFacilityCharge = facilityCharge;
             }
        	   
        }
        
        }
       }
    	//write your code here   
       System.out.println(validateNoOfBedrooms());
    }


	@Override
	public String toString() {
		return "HouseForRent (BuildingForRent (buildingDimensions=" + this.getBuildingDimensions()
				+ ")facilities=" + Arrays.toString(this.facilities)
				+ ", noOfBedrooms=" + this.noOfBedrooms + ")";
	}	
}

class ShopForRent extends BuildingForRent{
	char shopType;
	
	public ShopForRent(int buildingDimensions,char shopType){
		super(buildingDimensions);
		this.shopType=shopType;
	}
	
	//To_Trainee
    public int identifyShopRent(){
    	int shopRent;
    	if(shopType == 'A') {
    		shopRent = 45000;
    	}
    	else if(shopType == 'B') {
    		shopRent = 30000;
    	}
    	else if(shopType == 'C') {
    		shopRent = 25000;
    	}
    	else shopRent = -1;

    	//write your code here

    	return shopRent;

    }
        
    //To_Trainee  
    @Override
    public void calculateAdvanceAmount(){
    	float advanceAmount;
    	super.calculateAdvanceAmount();
		int basicAmount = (int) getAdvanceAmount();
    	int shopRent = identifyShopRent();
    	if (basicAmount == -1.0f || shopRent == -1.0f) {
    		advanceAmount = -1;
    	}
    	else {
    		advanceAmount = shopRent + basicAmount;
    	}
    	
    	//write your code here
    	
    }

	@Override
	public String toString() {
		return "ShopForRent (BuildingForRent (buildingDimensions=" + this.getBuildingDimensions()
				+ ")shopType=" + this.shopType + ")";
	}	   
}

class Tester{
	public static void main(String[] args){
		
		String[] facilities = {"PArking","SecUrity"};
		HouseForRent obj1 = new HouseForRent(2000,5,facilities);
		obj1.calculateAdvanceAmount();
		System.out.println("House Rent Amount:" + obj1.getAdvanceAmount());
					
		ShopForRent obj2 = new ShopForRent(10000,'A');
		obj2.calculateAdvanceAmount();
		System.out.println("Shop Rent Amount:" +obj2.getAdvanceAmount());
	}
}