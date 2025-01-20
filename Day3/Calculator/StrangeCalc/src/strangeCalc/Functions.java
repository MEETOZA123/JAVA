package strangeCalc;

import java.util.ArrayList;

public class Functions {
	public static int sum(ArrayList<Integer> arr) {
		int n=arr.size();
		int sum=0;
		for(int i=0;i<n;i++) {
			sum+=arr.get(i);
		}
		return sum;
	}
	
	public static int multiply(ArrayList<Integer> arr) {
		int n=arr.size();
		int prod=1;
		for(int i=0;i<n;i++) {
			if(arr.get(i)==0) {
				return 0;
			}
			prod*=arr.get(i);
		}
		return prod;
	}
	
	public static int largest(ArrayList<Integer> arr) {
		int n=arr.size();
		int ans=Integer.MIN_VALUE;
		
		for(int i=0;i<n;i++) {
			ans=Math.max(ans, arr.get(i));
		}
		return ans;
	}
	
	public static int smallest(ArrayList<Integer> arr) {
		int n=arr.size();
		int ans=Integer.MAX_VALUE;
		
		for(int i=0;i<n;i++) {
			ans=Math.min(ans, arr.get(i));
		}
		return ans;
	}
	
	public static double avg(ArrayList<Integer> arr) {
		int n=arr.size();
		int sum= sum(arr);
		
		return (double)sum/n;
	}
}
