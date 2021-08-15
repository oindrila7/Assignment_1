package assignment;

import java.util.Scanner;
public class Square {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input value of a: ");
        int a = in.nextInt();
        System.out.println("Input value of b : ");
        int b = in.nextInt();

        int c = (a*a)+(b*b)+2*a*b;
        System.out.println(c);
        System.out.println("The result of (a+b)^2= "+ c);
    }
}