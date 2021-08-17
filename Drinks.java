
public class Drinks {

	public static void main(String[] args) {
		Drink.printFullInfo();
		hotDrink.printInfo();
		coldDrink.printInfo();
		sportDrink.printInfo();
	}

}

// super class
class Drink {
	static String name = "Something new";
	static String type = "Drink";
	
	static void printType() {
		System.out.printf("|%23s |\n", type);
	}
	static void printInfo() {
		System.out.println("__________________________");
		System.out.printf("|%23s |\n", name);
		System.out.println("__________________________");
	}
	static void printFullInfo(){
		printType();
		printInfo();
		System.out.println("__________________________");
	}
}

//extended classes
class hotDrink extends Drink {
	static float temperature = 66.6f;
	static String type = "Hot Drink";

	static void printInfo() {
		System.out.printf("|%23s |\n", type);
		Drink.printInfo();
		System.out.printf("|%21.1f⁰С |\n", temperature);
		System.out.println("__________________________");
		System.out.println("__________________________");
	}
}

class coldDrink extends Drink {
	static float temperature = 11.11f;
	static String type = "Cold Drink";

	static void printInfo() {
		System.out.printf("|%23s |\n", type);
		Drink.printInfo();
		System.out.printf("|%21.2f⁰С |\n", temperature);
		System.out.println("__________________________");
		System.out.println("__________________________");
	}
}
class sportDrink extends Drink {
	static String peculiarity = "Electrolytes";
	static String type = "Cold Drink";

	static void printInfo() {
		System.out.printf("|%23s |\n", type);
		Drink.printInfo();
		System.out.printf("|%23s |\n", peculiarity);
		System.out.println("__________________________");
		System.out.println("__________________________");
	}
}
