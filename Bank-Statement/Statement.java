import java.util.Scanner;

public class Statement {
    public static void main(String[] args) {
        Scanner scrn = new Scanner(System.in);
        System.out.print("Enter your Registered Name : ");
        String reginame = scrn.next();
        System.out.print("Enter your Assigned user password : ");
        String passname = scrn.next();
        state first = new state(reginame , passname);
        first.menu();
    }
}

class state {
    Scanner stat = new Scanner(System.in);
    String nam;
    String ids;

    state(String names, String identity) {
        nam = names;
        ids = identity;
    }


    void menu() {
        int option;
        System.out.println("Welcome " + nam);

        do {
            System.out.println("=====================================================");
            System.out.print("Enter your Account No: ");
            option = stat.nextInt();
            System.out.println("=====================================================");

            switch (option) {
                case 1 -> {
                    System.out.println("======================================================");
                    System.out.println("Balance: 10000 ");
                    System.out.println("======================================================");
                    System.out.println("\n");
                }
                case 2 -> {
                    System.out.println("======================================================");
                    System.out.println("Balance: 20000 ");
                    System.out.println("======================================================");
                    System.out.println("\n");
                }
                case 3 -> {
                    System.out.println("======================================================");
                    System.out.println("Balance: 30000 ");
                    System.out.println("======================================================");
                    System.out.println("\n");
                }
                case 4 -> {
                    System.out.println("======================================================");
                    System.out.println("Balance: 50000 ");
                    System.out.println("======================================================");
                    System.out.println("\n");
                }
                default -> System.out.println("Invalid Account Number");
            }
        } while(option == 0);
        System.out.println("Kindly Re-Run to View Details about other account");
    }
}
