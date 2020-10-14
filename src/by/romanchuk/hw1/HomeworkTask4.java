package by.romanchuk.hw1;

import java.util.Scanner;

public class HomeworkTask4 {
    public static void main(String[] args) {
        System.out.print("Enter two numbers: ");
        Scanner s1 = new Scanner(System.in);
        int a = s1.nextInt();
        int b = s1.nextInt();
        if (a < 0 && b < 0) {
            a = a * -1;
            b = b * -1;
        }
        if (b >= a * 0.9 && b <= a * 1.1) {
            System.out.println("b in 10% of a");
        } else {
            System.out.println("b is not in 10% of a");
        }
    }
}
