import java.util.*;
public class Perfectsqprod {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int mul=num1*num2;
        int root=(int)Math.sqrt(mul);
        if(root*root==mul)
        {
            System.out.print("yes");
        }
        else
        {
            System.out.print("no");
        }
    }
}