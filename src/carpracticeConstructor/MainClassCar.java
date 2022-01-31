package carpracticeConstructor;

public class MainClassCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Car Brand Information");
		
		Car obj = new Car("Audi", 2022, 60000);
		System.out.println("Car Brand Name: " + obj.brandName + "\n" + "Car Model: " + obj.carModel + "\n" + "Price: "
				+ obj.carPrice );	
		double calculateTaxes = obj.calculatetaxes(13.0);
		System.out.println("After Taxes: " +calculateTaxes);
		
		
		
		/**Car obj2 = new Car("Mercedes", 2021, 68000);
		System.out.println("Car Brand Name: " + obj2.brandName + "\n" + "Car Model: " + obj2.carModel + "\n" + "Price: "
				+ obj2.carPrice );
		double calCulateTaxes = obj2.calculatetaxes(13.0);
		System.out.println("After Taxes" +calCulateTaxes);**/
		
		
		/**Car obj3 = new Car("BMW", 2020, 50000);
		System.out.println("Car Brand Name: " + obj3.brandName + "\n" + "Car Model: " + obj3.carModel + "\n" + "Price: "
				+ obj3.carPrice);
		double calculatetaxes = obj3.calculatetaxes(13.0);
		System.out.println("After Taxes: " +calculatetaxes);**/
		
		
		Car obj4 =new Car("Yes");
		System.out.println("Models availablity: " +obj4.availability);
		
		
		
	
	

	}

}
