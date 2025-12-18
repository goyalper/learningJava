package Loops;

import java.util.Scanner;

public class SumOfNNatural {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of terms : ");
        int n = input.nextInt();
        int sum = 0;
        for(int i = 1; i <= n; i++ ){
            sum+=(2*i);
            System.out.print(sum+" ");
        }

        System.out.println("\nSum is = "+ sum);
    }
}
