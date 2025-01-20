package calc;
import java.util.*;
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int a=scanner.nextInt();
		int b=scanner.nextInt();
		
		
		int sum=propertiesApplicable.sum(a,b);
		int subtract=propertiesApplicable.subtract(a,b);
		int multiply=propertiesApplicable.multiply(a,b);
		int divide=propertiesApplicable.divide(a,b);
		int modulo=propertiesApplicable.modulo(a,b);
		int largest=propertiesApplicable.largest(a,b);
		int smallest=propertiesApplicable.smallest(a,b);
		double avg=propertiesApplicable.avg(a,b);
		
		System.out.println("the sum is -> "+ sum);
		System.out.println("the subtraction is -> "+ subtract);
		System.out.println("the multiplication is -> "+ multiply);
		System.out.println("the divide is -> "+ divide);
		System.out.println("the remainder is -> "+ modulo);
		System.out.println("the largest out of two is -> "+ largest);
		System.out.println("the smallest out of two is -> "+ smallest);
		System.out.println("the average of the two numbers is -> "+ avg);
		
	}

}
