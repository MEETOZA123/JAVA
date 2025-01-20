package Project;
import java.util.regex.*;
public class Validator {
//	first validate name=>
	public static boolean validateName(String name) {
		if(name==null) {
			return false;
		}
		int n=name.length();
		for(int i=0;i<n;i++) {
			char ch=name.charAt(i);
			if((ch>='a'&&ch<='z')||(ch>='0'&&ch<='9')||(ch>='A'&&ch<='Z')) {
				continue;
			}else {
				return false;
			}
		}
		return true;
	}
	
// validate dob=>
	public static boolean validateDOB(String dob) {
		if(dob==null) {
			return false;
		}
		int n=dob.length();
		if(dob.length()!=8) {
			return false;
		}
		int date=Integer.parseInt(dob.substring(0,2));
		int month=Integer.parseInt(dob.substring(2,4));
		int year=Integer.parseInt(dob.substring(4));
		
		if(year>2024) {
			return false;
		}
		if(month>12 || month<1) {
			return false;
		}else {
			if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12) {
				if(date>31 || date<=0) {
					return false;
				}
				return true;
			}else if(month==2) {
				if(date>28 || date<=0) {
					return false;
				}
				return true;
				
			}else {
				if(date>30 || date<=0) {
					return false;
				}
				return true;
			}
		}
		
	}
	
	  // Method to validate the email using regular expression
    public static boolean validateEmail(String email) {
        if (email == null) return false;
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}
