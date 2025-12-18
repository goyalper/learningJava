package Loops;

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        System.out.println("_____________________________________");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " x " + num + " => " + num * i);
        }
    }
}
