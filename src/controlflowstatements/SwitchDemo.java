package controlflowstatements;

public class SwitchDemo {

	public static void main(String[] args) {
		
		String foodItem = "burger";
		
		switch(foodItem) {
		
			case "pasta":
				System.out.println("Here is your Pasta.");
				break;
			case "burger":
				System.out.println("Here is your Burger.");
				break;
			case "noodles":
				System.out.println("Here are your noodles.");
				break;
			case "pizza":
				System.out.println("Here is your pizza.");
				break;
			default:
				System.out.println("We only serve pasta/burger/noodles/pizza");
		
		}

	}

}
