package strangeCalc;
import java.util.*;
public class input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		
		 ArrayList<Integer> arr = new ArrayList<>();
		 
		 int n=scanner.nextInt();
		 for(int i=0;i<n;i++) {
			 int num=scanner.nextInt();
			 arr.add(num);
		 }
		 
//		 System.out.println("sum of all elements is -> "+Functions.sum(arr));
//		 System.out.println("Product of all elements is -> "+Functions.multiply(arr));
//		 System.out.println("Largest of all elements is -> "+Functions.largest(arr));
//		 System.out.println("Smallest of all elements is -> "+Functions.smallest(arr));
//		 System.out.println("Avg of all elements is -> "+Functions.avg(arr));
		 
		 boolean flag=false;
		 
		 while(flag==false) {
			 System.out.println("choose from 1-5 :");
			 int choice=scanner.nextInt();
			 if(choice==1) {
				 System.out.println("sum of all elements is -> "+Functions.sum(arr));
			 }else if(choice==2) {
				 System.out.println("Product of all elements is -> "+Functions.multiply(arr));
			 }else if(choice==3) {
				 System.out.println("Largest of all elements is -> "+Functions.largest(arr));
			 }else if(choice==4) {
				 System.out.println("Smallest of all elements is -> "+Functions.smallest(arr));
			 }else if(choice==5) {
				 System.out.println("Avg of all elements is -> "+Functions.avg(arr));
			 }else {
				 break;
			 }
		 }
		

	}

}
