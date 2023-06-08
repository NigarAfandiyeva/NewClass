package Ders2;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        System.out.println("Please enter 1 number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int  absolut = (num > 0) ? num : num * -1;
        System.out.println(absolut);

    }
}
