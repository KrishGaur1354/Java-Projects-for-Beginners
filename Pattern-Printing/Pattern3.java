import java.util.Scanner;

public class Pattern3 {
 
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows you want to print: ");

        int input = Integer.parseInt(sc.nextLine()); // Converts the input to an integer

        int count = input - 1;

        System.out.println();

        for (int k = 1; k <= input; k++) {

            for (int i = 1; i <= count; i++) {

                System.out.print(" ");

            }

            count--;

            for (int i = 1; i <= 2 * k - 1; i++) {

                System.out.print("*");

            }

            System.out.println();
 
        }

    }
    
}