import java.util.Scanner;
// The  Program to read a line of text from the user 
public class Scan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a text");
        String text = input.nextLine();
        System.out.println("------- Your Output------");
        System.out.println(text);
        input.close();
    }
}
