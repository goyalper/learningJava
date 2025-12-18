package Basics_2;


import java.util.Scanner;

public class ScannerOps {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        /*System.out.print("Enter your age: ");
        int age = scan.nextInt();
        System.out.println("Your age is: " + age);
        scan.close();*/

        int firstNumber = scan.nextInt();
        int secondNumber = scan.nextInt();
        int result = firstNumber + secondNumber;
        System.out.println("The sum is: " + result);
        scan.close();

    }
}
