package sample;
import java.util.*;
public class palindrome_upto_n {

	static void helper(int n) {
		String str=Integer.toString(n);
		
		int i=0,j=str.length()-1;
		int flag=0;
		while(i<=j) {
			if(str.charAt(i)!=str.charAt(j)) {
				flag=1;
				break;
			}
			i++;
			j--;
		}
		
		if(flag==0) {
			System.out.println(n);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		
		for(int i=1;i<=n;i++) {
			helper(i);
		}

	}

}
