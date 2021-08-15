package assignment;
import java.util.Scanner;

public class hello {
    public static void main(String[] args)
    {
        Scanner input = new Scanner (System.in);
        System.out.print("Input your  name: ");
        String name = input.next();
        System.out.print("Input your university name: ");
        String uname = input.next();
        System.out.println();
        System.out.println("Hello, I am "+name+". I passed from "+uname+" university");
    }
}