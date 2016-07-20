package guvi;
import java.util.*;
public class Digits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		int a;
		int r=0;
		System.out.println("Enter a number");
		a=s.nextInt();
		while(a!=0)
		{
			r=r*10;
			r=r+a%10;
			a=a/10;
		}
		System.out.println("Reversed number is "+r);

	}

}
