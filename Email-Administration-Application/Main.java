package EmailApp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter your First Name: ");
        String first = scn.next();
        System.out.print("Enter your Last Name: ");
        String last = scn.next();
        Email em1 = new Email(first,last);
        System.out.println(em1.showInfo());

    }
}
