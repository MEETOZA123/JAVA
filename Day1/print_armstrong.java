package sample;
import java.util.*;
public class print_armstrong {
	static void helper(int n) {
		int current=n;
		int sum=0;
		
		String str=Integer.toString(n);
		int power=str.length();
		
		while(current>0) {
			int r=current%10;
			sum+=Math.pow(r, power);
			current=current/10;
		}
		
		if(sum==n) {
			System.out.println(n);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=1000;i++) {
			helper(i);
		}

	}

}
