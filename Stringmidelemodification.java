import java.util.*;
public class Stringmidelemodification {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String nn=sc.next();
        int n=nn.length();
        StringBuilder sb=new StringBuilder(nn);
        if(n%2!=0)
        {
            int mid=n/2;
            sb.setCharAt(mid,'*');
        }
        else
        {
            int mid1=n/2;
            int mid2=mid1-1;
            sb.setCharAt(mid1,'*');
            sb.setCharAt(mid2,'*');
        }
        System.out.print(sb.toString());
    }
}