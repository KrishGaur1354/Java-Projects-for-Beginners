import java.util.Scanner;

public class NumberGuessing {

    public static void guessingNumberGame() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter maximum value till you can choose: " ); //To choose no from 1 to the no. choosen by the user
        int gui = sc.nextInt(); //Input-1
        int number = 1 + (int) (gui * Math.random());
        System.out.println("Enter in how many attempts you think you can guess:" ); //No of attempts the thinks they can guess in
        int num = sc.nextInt(); //Input-2
        int i, guess;

        System.out.println("A number is chosen between 1 to " + gui + ". Guess the number within " + num + " trials." );

        for (i = 0; i < num; i++) {
            System.out.println("Guess the number:");
            guess = sc.nextInt(); //Input-3

            if (number == guess) {
                System.out.println("Congratulations! You guessed the number in " + i + " attempts" );
                break;
            } else if (number > guess && i != num - 1) {
                System.out.println("The number is greater than " + guess );
            } else if (number < guess && i != num - 1) {
                System.out.println("The number is less than " + guess );
            }
        }

        if (i == num) {
            System.out.println("You have exhausted the no. of trials.");
            System.out.println("The number to guess was " + number );
        }

    }

    public static void main(String[] args) {
        {
            guessingNumberGame();
        }
    }
}


