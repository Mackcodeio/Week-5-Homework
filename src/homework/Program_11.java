package homework;

import java.util.Scanner;

public class Program_11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Input first number: ");
        int num1 = in.nextInt();

        System.out.print("Input second number: ");
        int num2 = in.nextInt();

        for(int i=1; i<=num2; i++) {
            System.out.println(num1 + " x " + i + " = " + num1 * i);
        }
    }
}
