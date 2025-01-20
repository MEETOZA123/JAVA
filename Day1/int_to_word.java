package sample;
import java.util.*;
public class int_to_word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		
		HashMap<Character,String> m=new HashMap<>();
		
		m.put('1',"One");
		m.put('2',"Two");
		m.put('3',"Three");
		m.put('4',"Four");
		m.put('5',"Five");
		m.put('6',"Six");
		m.put('7',"Seven");
		m.put('8',"Eight");
		m.put('9',"Nine");
		m.put('0',"Zero");
		
		String str=Integer.toString(n);
		for(int i=0;i<str.length();i++) {
			Character ch=str.charAt(i);
			System.out.print(m.get(ch)+" ");
		}

	}

}
