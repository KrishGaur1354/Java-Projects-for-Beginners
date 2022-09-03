import java.util.Scanner;

public class Fibonacci_Code {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;

        while (count <= num) {
            int fib = b;
            b = a + b;
            a = fib;
            count++;
        }
        System.out.println(b);
    }
}
