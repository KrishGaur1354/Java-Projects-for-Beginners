import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter no. to view FizzBuzz : ");
        int nums = input.nextInt();

        for (int i = 1; i <= nums; i++)
        {
            if (i%5 == 0 && i%3 == 0)
                System.out.println("FizzBuzz");
            else if (i%5==0)
                System.out.println("Buzz");
            else if (i%3==0)
                System.out.println("Fizz");
            else
                System.out.println(i);
        }
    }
}
