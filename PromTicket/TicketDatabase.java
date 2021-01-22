package ticketBooth;
import java.util.Scanner;

public class TicketDatabase {

	public static void main(String[] args) {
		String fullName, gradeLevel;
		int numberOfGuests;
		TicketProcessor student;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("--- PROM TICKET DATABASE ---");
		while (true) {
			System.out.println("Enter student's first and last name:");
			fullName = input.nextLine();
			
			System.out.println("Enter student's grade level (Freshman, Sophomore, Junior, or Senior):");
			gradeLevel = input.nextLine();
			
			System.out.println("Enter number of guests, incuding the student (max 4):");
			numberOfGuests = input.nextInt(); input.nextLine();
			
			student = new TicketProcessor(fullName, gradeLevel, numberOfGuests);
			
			System.out.println("\nWould you like to complete another submission? (Y or N):");
			if (input.nextLine().substring(0, 1).toLowerCase().equals("y")) System.out.println();
			else break;
		}

	}

}
