import java.util.Scanner;
public class Arithmeticsumseries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        int B=sc.nextInt();
        int C=sc.nextInt();
        int total=(C*(2*A+(C-1)*B))/2;
        System.out.print(total);
    }
}