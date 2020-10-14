package by.romanchuk.hw1;

import java.util.Scanner;

public class HomeworkTask2 {
    public static void main(String[] args) {
        System.out.print("Enter number: ");
        Scanner s1 = new Scanner(System.in);
        int a = s1.nextInt();
        if (a < -100) {
            System.out.println("...;-100");
        } else if (a >= -100 && a <= 100) {
            System.out.println("-100;100");
        } else if (a > 100)
            System.out.println("100;...");

    }
}
