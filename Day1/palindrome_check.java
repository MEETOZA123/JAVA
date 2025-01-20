package sample;

import java.util.Scanner;

public class palindrome_check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		String str=Integer.toString(n);
		int i=0,j=str.length()-1;
		int flag=0;
		while(i<j) {
			if(str.charAt(i)!=str.charAt(j)) {
				flag=1;
				System.out.println("NOT A PALINDROME");
			}
			i++;
			j--;
		}
		if(flag==0) {
			System.out.println("GIVEN NUMBER IS PALINDROME");
		}
	}

}
