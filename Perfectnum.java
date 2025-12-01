import java.util.*;
public class Perfectnum
{
	public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   int num=sc.nextInt();
	   int sum=0;
	   for(int i=1;i<num;i++)
	   {
	       if(num%i==0)
	       {
	           sum+=i;
	       }
	   }
	   if(sum==num)
	   {
	       System.out.print("yes");
	   }
	   else
	   {
	       System.out.print("no");
	   }
	}
}