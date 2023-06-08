package Ders2;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        System.out.println("Please insert 1 number: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        String result = (number > 0) ? "Positive" : "Negative";
        System.out.println(result);

    }
}
