
package carpracticeConstructor;

public class Car {
	 String brandName;
	 int carModel;
	 double carPrice;
	 String availability;
	 double taxes;
	
	 Car(String brandname, int carmodel, double carprice){
		 
		brandName=brandname;
		carModel=carmodel;
		carPrice=carprice;
	
	 }
	public Car(String availability) {
		
		this.availability = availability;
	}
	
	double calculatetaxes(double calculateTaxes) {
		taxes = ((carPrice/100)*calculateTaxes)+carPrice;
		
		return taxes;
		
	}
	 
	 
	 
}
