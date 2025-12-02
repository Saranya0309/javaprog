import java.util.Scanner;
public class Modulomul {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int a=sc.nextInt();
       int b=sc.nextInt();
       int c=sc.nextInt();
       int mul=a*b;
       int val=mul%c;
       System.out.print(val);
    }
}