import java.util.*;
public class timecomplexityforfiboseries{
    public static int fibonacci(int n) {
        if (n <= 1)
            return n;
        return fibonacci(n - 1) + fibonacci(n - 2); // Two recursive calls
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        sc.close();
        long startTime = System.currentTimeMillis(); // Start time
        int result = fibonacci(n);
        long endTime = System.currentTimeMillis();   // End time
        System.out.println("Fibonacci(" + n + ") = " + result);
        System.out.println("Start Time : " + startTime + " ms");
        System.out.println("End Time   : " + endTime + " ms");
        System.out.println("Execution Time: " + (endTime - startTime) + " ms");
    }
}
