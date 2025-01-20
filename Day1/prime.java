package sample;
import java.util.*;
public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		int count=n;
		int i=2;
		while(n>0) {
			int current=i;
			int flag=0;
			for(int j=2;j<=Math.sqrt(current);j++) {
				if(current%j==0) {
					flag=1;
					break;
				}
			}
			
			if(flag==0) {
				sum+=current;
				System.out.println(current);
				n--;
			}
			i++;
		}
		
		System.out.println("the sum is:"+sum);
		System.out.println("the average is:"+(double)sum/count);
		
	}

}
