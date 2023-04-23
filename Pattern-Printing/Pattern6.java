import java.util.Scanner;

public class Pattern6 {
 
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows you want to print: ");

        int input = Integer.parseInt(sc.nextLine()); // Converts the input to an integer

        System.out.println();

        for (int i = 0; i < input; ++i) {

            for (int j = 0; j <= i; ++j) {

                System.out.print("*");

            }

 
            if (i != input - 1) {

                System.out.print(" ");

            }

             else {

                System.out.print(" *");

            }

            for (int j = 0; j <= i; ++j) {

                System.out.print("*");

            }
 
            System.out.println();
            
        }

    }
    
}