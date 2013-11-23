package ca.demo.salerstool;

public class Main {

	public static void main(String[] args) {
		SalersData data = new SalersData();
		
		displayGreeting();
		data.display();

	}
	
	private static void displayGreeting() {
		System.out.println("HELLO HAPPY SALERS PEOPLE!");
		System.out.println("THIS APP SHOW SALERS DATA");
	}

}
