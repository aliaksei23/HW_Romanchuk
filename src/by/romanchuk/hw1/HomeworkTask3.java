package by.romanchuk.hw1;

import java.util.Scanner;

public class HomeworkTask3 {
    public static void main(String[] args) {
        System.out.print("Enter number: ");
        Scanner s1 = new Scanner(System.in);
        double a = s1.nextDouble();
        double b = s1.nextDouble();
        double c = s1.nextDouble();
        double min = a;
        double average=(a+b+c)/3;
        double max = a;
        if (min > b) {
            min = b;
        } else if (max<b){
            max = b;
        }
        if (min > c) {
            min = c;
        } else if (max<c){
            max = c;
        }

        System.out.println("min:" + min);
        System.out.println("max:" + max);
        System.out.println("average:" + average);


    }
}
