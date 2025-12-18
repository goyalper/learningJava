package Loops;

import java.util.Scanner;

public class SumOfN {
    public static void main(String[] args){
//        Sum of n numbers
        Scanner get = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = get.nextInt();
        int sum = 0;
        for (int i=1; i<=n; i++){
            sum += i;
        }
        System.out.println("Sum of 0 to "+n+" is = "+sum);

    }
}
