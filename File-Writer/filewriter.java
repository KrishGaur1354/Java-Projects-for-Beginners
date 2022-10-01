import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class filewriter {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter File name to Write on.");
        System.out.print("File Name Here : ");
        String filesn = scn.next();
        System.out.println("Enter what you need add here : ");
        String writen = scn.next();
        try {
            FileWriter writer = new FileWriter(filesn + ".txt");
            writer.write(writen);
            writer.close();
            System.out.println("Successfully wrote to the file");
        } catch (IOException e) {
            System.out.println("An Error Occurred");
            e.printStackTrace();
        }
    }
}
