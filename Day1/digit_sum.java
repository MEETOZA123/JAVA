package sample;
import java.util.*;
public class digit_sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		
		int n=scanner.nextInt();
		int sum=0;
		while(n>0) {
			int r=n%10;
			sum+=r;
			n=n/10;
		}
		System.out.println(sum);
	}

}
