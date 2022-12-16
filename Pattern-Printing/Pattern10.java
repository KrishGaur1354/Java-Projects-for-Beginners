import java.util.Scanner;

public class Pattern10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows you want to print: ");

        int input = Integer.parseInt(sc.nextLine()); // Converts the input to an integer

        System.out.println();

        int i, j;

        for (i = 1; i <= input; i++) {

          for (j = input; j > i; j--) {

              System.out.print(" ");

          }

          System.out.print("*");

          for (j = 1; j < (i - 1) * 2; j++) {

              System.out.print(" ");

          }

          if (i == 1) {

            System.out.println("");

          }

          else {

            System.out.println("*");
            
          } 
          
        }

        for (i = (input - 1); i >= 1; i--) {

          for (j = input; j > i; j--) {

            System.out.print(" ");

          }

          System.out.print("*");

          for (j = 1; j < (i - 1) * 2; j++) {

            System.out.print(" ");

          }

          if (i == 1) {

            System.out.println("");
            
          }

          else {

            System.out.println("*");

          }

        }

    }
    
}