import java.util.Scanner;

public class Pattern1 {
 
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows you want to print: ");

        int input = Integer.parseInt(sc.nextLine()); // Converts the input to an integer

        System.out.println();

        for (int row = input; row >= 1; --row) {

            for (int col = 1; col <= row; ++col) {

                System.out.print("*");

            } 

            System.out.println();

        }

    }
    
}