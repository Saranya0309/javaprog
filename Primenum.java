import java.util.*;
public class Primenum
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int num=sc.nextInt();
	    int count=0;
	    for(int i=1;i<=Math.sqrt(num);i++)
	    {
	        if(num%i==0)
	        {
	            count++;
	            if(num/i!=i)
	            {
	                count++;
	            }
	        }
	    }
	    if(count==2)
	    {
	        System.out.print("It is a prime num");
	    }
	    else
	    {
	        System.out.print("It is not a prime num");
	    }
	}
}