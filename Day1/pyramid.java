package sample;
import java.util.*;
public class pyramid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		
		int spaces=n-1,stars=1;
		
		while(spaces>=0) {
			for(int i=0;i<spaces;i++) {
				System.out.print(" ");
			}
			for(int i=0;i<stars;i++) {
				System.out.print("*"+" ");
			}
			System.out.println();
			spaces--;
			stars++;
		}
	}

}
