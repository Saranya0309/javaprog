import java.util.*;
public class Dec_to_Bin
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int num=sc.nextInt();
	    StringBuilder binary=new StringBuilder();
	    while(num>0)
	    {
	        int remainder=num%2;
	        binary.append(remainder);
	        num/=2;
	    }
	    binary.reverse();
	    System.out.print(binary);
	}
}