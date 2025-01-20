package Project;
import java.util.*;
public class UserinputValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		
//		take name as input->
		System.out.println("Enter Name => ");
		String name=scanner.nextLine();
		
//		take email as input->
		System.out.println("Enter your email =>");
		String email=scanner.nextLine();
		
//		take dob as input->
		System.out.println("Enter your Date of birth (DD/MM/YYYY) =>");
		String dob=scanner.nextLine();
		
//		create a new user by using above details;
		User user=new User(name,email,dob);
		
//		validate users
		boolean validatename=Validator.validateName(user.getName());
		boolean validateemail=Validator.validateEmail(user.getEmail());
		boolean validatedob=Validator.validateDOB(user.getDOB());
		
		System.out.println("The valiation Results are =>");
		
		System.out.print(" Name: ");
		if(validatename) {
			System.out.println(user.getName());
		}else {
			System.out.println("Invalid Input. You can only enter AlphaNumeric letters");
		}
		
		
		System.out.print(" Email: ");
		if(validateemail) {
			System.out.println(user.getEmail());
		}else {
			System.out.println("Invalid Input. Enter email address in a valid format.");
		}
		
		
		System.out.print(" Date of Birth (DD/MM/YYYY): ");
		if(validatedob) {
			System.out.println(user.getDOB());
		}else {
			System.out.println("Invalid Input. Enter DOB in a valid format, DD/MM/YYYY");
		}
		
		scanner.close();
	}

}
