import java.util.Scanner;

public class Pattern7 {
 
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows you want to print: ");

        int input = Integer.parseInt(sc.nextLine()); // Converts the input to an integer

        System.out.println();

        for (int i = 0; i < input; i++) {

            if (i == 0 || i == 6) {

                for (int j = 0; j < input; j++) {

                    System.out.print("*");

                }

                System.out.println();

            }

            if (i >= 1 && i <= 5) {

                for (int j = 0; j < input; j++) {

                    if (j == 0 || j == 6) {

                        System.out.print("*");

                    }
                    
                    else if (j >= 1 && j <= 5) {

                        System.out.print(" ");

                    }
                }
                System.out.println();
            }
        }

    }
    
}