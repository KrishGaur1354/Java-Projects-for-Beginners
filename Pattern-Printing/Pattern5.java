import java.util.Scanner;

public class Pattern5 {
 
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows you want to print: ");

        int input = Integer.parseInt(sc.nextLine()); // Converts the input to an integer

        System.out.println();

        for (int i = 1; i <= input; i++) {
          
            for (int j = 1; j <= input - i; j++) {
              
                System.out.print(" ");
                
            }
            
            for (int k = 1; k <= i; k++) {
              
                System.out.print("*");
                
            }
            
            System.out.println("");
            
        }

    }
    
}