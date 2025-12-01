import java.util.*;
public class Palindromeofstring
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String str=sc.nextLine();
	    int len=str.length();
	    int count=0;
	    for(int i=0;i<len/2;i++)
	    {
	        if(str.charAt(i)==str.charAt(len-i-1))
	        {
	            count++;
	        }
	    }
	    if(count==len/2)
	    {
	        System.out.print("yes");
	    }
	    else{
	        System.out.print("no");
	    }
	}
}