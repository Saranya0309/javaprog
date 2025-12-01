import java.util.*;
public class Strongnum
{
	public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   int num=sc.nextInt();
	   int temp=num;
	   int sum=0;
	   while(num>0)
	   {
	       int digit=num%10;
	       int result=1;
	       for(int i=1;i<=digit;i++)
	       {
	           result=result*i;
	       }
	       sum+=result;
	       num/=10;
	   }
	   if(temp==sum)
	   {
	       System.out.print("yes");
	   }
	   else
	   {
	       System.out.print("no");
	   }
	}
}