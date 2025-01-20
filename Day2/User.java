package Project;

public class User {
	private String name;
	private String email;
	private String dob;
	
	public User(String name,String email,String dob) {
		this.name=name;
		this.email=email;
		this.dob=dob;
	}
	
	public String getName() {
		return name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getDOB() {
		return dob;
	}
}
