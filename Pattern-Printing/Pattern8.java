import java.util.Scanner;

public class Pattern8 {

  private static void forStars(int count) {

        for (int i = 0; i < count; ++i) {

            System.out.print("*");

        }

    }
 

    private static void forSpaces(int count) {

        for (int i = 0; i < count; ++i) {

            System.out.print(" ");

        }

    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows you want to print: ");

        int input = Integer.parseInt(sc.nextLine()); // Converts the input to an integer

        System.out.println();

        for (int i = 0; i < input; ++i) {

        	forStars(i + 1);

          forSpaces(input - i - 1);

          forStars(input - i + 1);

          forSpaces(2 * i);

          forStars(input - i);

          forSpaces(input - i - 1);

          forStars(i + 1);


          System.out.println();

        }

    }
    
}