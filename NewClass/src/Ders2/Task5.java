package Ders2;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        System.out.println("Please enter your garde to check: ");
        Scanner sc = new Scanner(System.in);
        double grade = sc.nextDouble();

        if (grade > 50){
            System.out.println("Congratulations! You passed");
        }else{
            System.out.println("Oops, you failed.");
            System.out.println("N");
        }
    }
}
