package ConditionalOps;

//you r given three numbers, find the maximum number

import java.util.Scanner;

public class LargerNum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Three Numbers Here : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("__________________________________________");
        largest(a, b, c);
    }
    public static void largest(int a, int b, int c) {
        if(a>b){
            System.out.println(a+" is larger than "+b);
            if (a>c){
                System.out.println(a+" is larger than "+c);
                System.out.println(a+" is largest");
            }else {
                System.out.println(c+ " is larger than "+a);
                System.out.println(c+" is largest");
            }
        }else {
            System.out.println(b+" is larger than "+a);
            if (b>c){
                System.out.println(b+" is larger than "+c);
                System.out.println(b+" is largest");
            }else{
                System.out.println(c+ " is larger than "+b);
                System.out.println(c+" is largest");
            }
        }

    }
}