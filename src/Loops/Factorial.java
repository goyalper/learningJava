package Loops;

import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Add Number : ");
        int n = sc.nextInt();
//        System.out.print("!\n");
        System.out.println("_______________________________________");
        BigInteger fact = BigInteger.ONE;

    for(int i=n; i>=1; i--){
        fact = fact.multiply(BigInteger.valueOf(i));

    }
        System.out.println("Factorial of "+n+" is : "+fact);

    }
}
