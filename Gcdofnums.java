import java.util.*;
public class Gcdofnums
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int a=sc.nextInt();
	    int b=sc.nextInt();
	    while(b!=0)
	    {
	        int temp=a%b;
	        a=b;
	        b=temp;
	    }
	    System.out.print(a);
	}
}