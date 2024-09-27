package lab8;
import java.util.Scanner;

//caden finley

public class Driver {
	static Scanner in = new Scanner(System.in);
	static int input;
	static String nameInput;
	static String addressInput;
	static String phoneNumberInput;
	static String emailInput;
	public static void main(String[] args) {
		firstInput();
	}	
	private static void firstInput() {
		System.out.println("ENTER");
		System.out.println("(1)To create a Student");
		System.out.println("(2)To create an Employee");
		input = in.nextInt();	
		if (input == 1) {	
			takeBasicInput();
			createStudent();
		}
		else {
			System.out.println("Enter"); 
			System.out.println("(1)To enter a Faculty Member"); 
			System.out.println("(2)To enter a Staff Member"); 
			input = in.nextInt();
			
			if (input ==1) {	
				takeBasicInput();
				createFaculty();			
			}
			else {		
				takeBasicInput();
				createStaff();
			}		
		}

	}
	private static void createStudent() {	
		System.out.println("Enter student's·status:"); 
		String statusInput = in.nextLine();		
		in.close();
		Student a = new Student(nameInput,addressInput,phoneNumberInput,emailInput,statusInput);
		System.out.print(a);
	}
	private static void createFaculty() {	
		
		System.out.println("Enter office number:"); 
		int officeNumber = in.nextInt();
		System.out.println("Enter salary:"); 
		int salary = in.nextInt();
		System.out.println("Enter office Hours:");	
		String clearLine = in.nextLine();
		String officeHours = in.nextLine();
		System.out.println("Enter rank:"); 
		String rank = in.nextLine();
		System.out.println("Enter Date Hired: ");
		String dateHired = in.nextLine();
		in.close();
		Faculty a = new Faculty(nameInput,addressInput,phoneNumberInput,emailInput,officeNumber,salary,officeHours,rank,dateHired);
		System.out.print(a);
	}
	private static void createStaff() {	
		System.out.println("Enter office number:"); 
		int officeNumber = in.nextInt();
		System.out.println("Enter salary:"); 
		int salary = in.nextInt();
		System.out.println("Enter title:"); 
		String clearLine = in.nextLine();
		String title = in.nextLine();
		System.out.println("Enter Date Hired: ");
		String dateHired = in.nextLine();
		in.close();
		Staff a = new Staff(nameInput,addressInput,phoneNumberInput,emailInput,officeNumber,salary,title,dateHired);
		System.out.print(a);
	}
	private static void takeBasicInput() {
		System.out.println("Enter name:"); 
		nameInput = in.nextLine();
		nameInput = in.nextLine();
		System.out.println("Enter address:"); 
		addressInput = in.nextLine();
		System.out.println("Enter phone·number:"); 
		phoneNumberInput = in.nextLine();
		System.out.println("Enter email:"); 
		emailInput = in.nextLine();
	}
}

