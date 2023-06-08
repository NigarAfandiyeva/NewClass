package Ders2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("Please insert 2 numbers: ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        if (num1 > num2){
            System.out.println("1st number is greater than the second one");
        }else if (num1 < num2){
            System.out.println("1st number is less that the second one");
        }else{
            System.out.println("Numbers are equal.");

        }
    }
}
