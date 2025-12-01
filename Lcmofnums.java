import java.util.*;
public class Lcmofnums
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int a=sc.nextInt();
	    int b=sc.nextInt();
	    int val=a*b;
	    while(b!=0)
	    {
	        int temp=a%b;
	        a=b;
	        b=temp;
	    }
	    int total=val/a;
	    System.out.print(total);
	}
}