import java.util.Scanner;

public class Pattern9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows you want to print: ");

        int input = Integer.parseInt(sc.nextLine()); // Converts the input to an integer

        System.out.println();

        int i, j;

        for (i = 1; i <= input; i++) {

          for (j = 1; j <= i; j++) {

            if (j == 1 || j == i || i == input) {

              System.out.print("*");

            }

            
            else {

              System.out.print(" ");

            }

        }

        System.out.println("");

        }

    }
    
}