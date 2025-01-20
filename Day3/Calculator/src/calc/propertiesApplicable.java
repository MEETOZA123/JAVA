package calc;

public class propertiesApplicable {
	protected int a;
	protected int b;
	
	public propertiesApplicable(int a,int b) {
		this.a=a;
		this.b=b;
	}
	
	public static int sum(int a,int b) {
		return a+b;
	}
	
	public static int subtract(int a,int b) {
		return b-a;
	}
	 public static int multiply(int a,int b) {
		 return a*b;
	 }
	 public static int divide(int a,int b) {
		 return b/a;
	 }
	 
	 public static int modulo(int a,int b) {
		 return b%a;
	 }
	 public static int largest(int a,int b) {
		 return Math.max(a, b);
	 }
	 public static int smallest(int a,int b) {
		 return Math.min(a, b);
	 }
	 public static double avg(int a,int b) {
		 return (double) (a+b)/2;
	 }
}
