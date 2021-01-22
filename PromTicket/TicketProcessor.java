package ticketBooth;

public class TicketProcessor {
	String name, grade, confirmationCode;
	private String[] ticketTypes = {"solo", "couple", "group", "group"};
	// ^Pulls a keyword from the array based on the number of guests
	// (Ex: ticketTypes[numGuests - 1] = "solo" when numGuests == 1.)
	double ticketPrice;
	int numGuests;
	
	public TicketProcessor(String fullName, String gradeLevel, int numberOfGuests) {
		name = fullName;
		grade = gradeLevel.toLowerCase();
		numGuests = numberOfGuests;
		ticketPrice = getPrice();
		confirmationCode = generatePassword();
		printStatus();
	}
	
	
	// Calculates Price
	public double getPrice() {
		double price = 0;
		if (grade.equals("senior")) { // Senior ticket prices
			if (numGuests == 1) price = 40;
			else if (numGuests == 2) price = 60;
			else if (numGuests <= 4) price = 100;
		}
		
		else if (grade.equals("junior")) { // Junior ticket prices
			if (numGuests == 1) price = 45;
			else if (numGuests == 2) price = 68;
			else if (numGuests <= 4) price = 113;
		}
		
		else if (grade.equals("sophomore")) { // Sophomore ticket prices
			if (numGuests == 1) price = 55;
			else if (numGuests == 2) price = 83;
			else if (numGuests <= 4) price = 138;
		}
		
		else if (grade.equals("freshman")) { // Freshman ticket prices
			if (numGuests == 1) price = 65;
			else if (numGuests == 2) price = 98;
			else if (numGuests <= 4) price = 163;
		}
		
		return price;
	}
	
	
	// Generates a confirmation password for the student
	public String generatePassword() {
		String password = "";
		String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		
		// Generates each random character of password
		int rand;
		for (int i = 0; i < 6; i++) {
			rand = (int) (Math.random() * characters.length());
			password += characters.substring(rand, rand + 1);
		}
		
		return password;
	}
	
	
	//prints student's ticket price and confirmation number
	public void printStatus() {
		System.out.println(name + " purchased a " + grade + " " + ticketTypes[numGuests - 1] + " ticket for $" + ticketPrice + "0. The confirmation number for this sale is " + confirmationCode + ".");
	}

}
