import java.util.*;
public class Countvowels
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String str=sc.nextLine();
	    String str1="AEIOUaeiou";
	    int count=0;
	    for(int i=0;i<str.length();i++)
	    {
	        for(int j=0;j<str1.length();j++)
	        {
	            if(str.charAt(i)==str1.charAt(j))
	            {
	                count++;
	            }
	        }
	    }
	    System.out.print(count);
	}
}