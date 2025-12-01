import java.util.*;
public class Multiplicationtable
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
        int val;
        for(int i=1;i<=10;i++)
        {
            val=n*i;
            System.out.print(val+" ");
        }
	}
}