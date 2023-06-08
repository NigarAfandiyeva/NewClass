package Ders2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Please insert 2 numbers: ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        double num2 = sc.nextDouble();

        float sum = (float) (num1 + num2);
        double subs = (num1 - num2);
        int multp = (int) (num1 * num2);
        double div = num2 / num1;


        System.out.println("Sum: " + sum + ", " + "Substraction: " + subs + ", " + "Multiplication: " + multp + ", " + "Division: " + div + ".");

    }
}
