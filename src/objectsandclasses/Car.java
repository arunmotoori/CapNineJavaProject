package objectsandclasses;

public class Car {
	
	String company; // Global Instance Variable
	String model; // Global Instance variable
	double price; // Global Instance variable
	static int wheels = 4; // Global static variable
	
	public Car(String company,String model,double price) {
		this.company = company;
		this.model = model;
		this.price=price;
	}

	public void startCar() {
		System.out.println("Car from "+company+" and model:"+model+" has started");
	}
	
	public void stopCar() {
		System.out.println("Car from "+company+" and model:"+model+" has stopped");
	}
	
	public void carDetails() {
		System.out.println("Company of the Car is:"+company);
		System.out.println("Model of the Car is:"+model);
		System.out.println("Price of the Car is:"+price);
		System.out.println("Number of wheels of the car are:"+wheels);
		System.out.println("----------------------");
	}
	
}
