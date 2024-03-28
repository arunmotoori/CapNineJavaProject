package objectsandclasses;

public class Demo {

	public static void main(String[] args) {
		
		Car bmwX1 = new Car("BMW", "X1", 6000000); // Constructor calling
		bmwX1.startCar();
		bmwX1.stopCar();
		bmwX1.carDetails();

		Car benzAClass = new Car("Benz", "AClass",7000000);
		benzAClass.startCar();
		benzAClass.stopCar();
		benzAClass.carDetails();
		
		Car toyatoHybrid = new Car("Toyato", "Hybrid",3800000);
		toyatoHybrid.startCar();
		toyatoHybrid.stopCar();
		toyatoHybrid.carDetails();
		
		Car mXUV700 = new Car("Mahindra", "XUV700",3100000);
		mXUV700.startCar();
		mXUV700.stopCar();
		mXUV700.carDetails();

	}

}
