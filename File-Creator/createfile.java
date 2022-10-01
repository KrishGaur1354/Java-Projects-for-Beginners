import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class createfile {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Your File Name : ");
        String names = scn.next();
        try{
            File myObj = new File( names +".txt");
            if (myObj.createNewFile()) {
                System.out.println("File Created : " + myObj.getName());
            } else {
                System.out.println("File Already Exist");
            }
        } catch (IOException e)  {
            System.out.println("An error Occurred");
            e.printStackTrace();
        }
    }
}
