package by.romanchuk.hw1;

import java.util.Scanner;

public class HomeworkTask1 {
    public static void main (String[] args){
        System.out.print("Enter number");
        Scanner s1 = new Scanner(System.in);
        int a =s1.nextInt();

        switch (a) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("no day today");
        }
    }
}
