package sample;
import java.util.*;
public class armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		
		String str=Integer.toString(n);
		int power=str.length();
		
		int sum=0;
		int current=n;
		
		while(current>0) {
			int r=current%10;
			sum+=Math.pow(r,power);
			current=current/10;
		}
		
		if(sum==n) {
			System.out.println("armstrong number");
		}else {
			System.out.println("NOT AN ARMSTRONG NUMBER");
		}
		
	}

}
