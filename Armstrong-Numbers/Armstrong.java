/*What is a Armstrong Number?*/
/*Well in case of an Armstrong number of 3 digits, the sum of cubes of each digits is equal to the number itself.*/

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int inp = input.nextInt();
        boolean ans = IsArmstrong(inp);
        System.out.println(ans);


        for (int i = 0 ; i < 1000 ; i++) {
            if (IsArmstrong(i)) {
                System.out.println(i + " ");
            }


        }
    }
    static boolean IsArmstrong(int inp) {
        int num = inp;
        int sum = 0;

        while (inp > 0) {
            int remain = inp % 10;
            inp = inp / 10;
            sum = sum + remain * remain * remain;
            }
        return sum == num;
    }
}

