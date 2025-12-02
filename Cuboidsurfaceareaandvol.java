import java.util.Scanner;
public class Cuboidsurfaceareaandvol {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int L=sc.nextInt();
        int B=sc.nextInt();
        int H=sc.nextInt();
        int tsa=2*((L*B)+(L*H)+(B*H));
        int vol=L*B*H;
        System.out.printf("%d %d",tsa,vol);
    }
}