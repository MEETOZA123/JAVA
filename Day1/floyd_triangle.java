package sample;
import java.util.*;
public class floyd_triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		
		int n=scanner.nextInt();
		
		int i=1;
		int line=1;
		while(line<=n) {
			for(int j=0;j<line;j++) {
				System.out.print(i+" ");
				i++;
			}
			System.out.println();
			line++;
		}

	}

}
