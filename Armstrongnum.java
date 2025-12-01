import java.util.*;
public class Armstrongnum
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int num=sc.nextInt();
	    int temp=num;
	    int safe=num;
	    int count=0;
	    while(num>0)
	    {
	        count++;
	        num/=10;
	    }
	    int sum=0;
	    while(temp>0)
	    {
	        int digit=temp%10;
	        int result=1;
	        for(int i=0;i<count;i++)
	        {
	            result=result*digit;
	        }
	        sum+=result;
	        temp/=10;
	    }
	    if(sum==safe)
	    {
	        System.out.print("yes");
	    }
	    else
	    {
	        System.out.print("no");
	    }
	}
}