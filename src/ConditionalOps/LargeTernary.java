package ConditionalOps;

import java.util.Scanner;

public class LargeTernary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any foru nums : ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();

        System.out.println("Max is: "+max(a,b,c,d));

    }
    public static int max(int a,int b,int c,int d){
        int max = a>b?(a>c?(a>d?a:d):(c>d?c:d)):(b>c?(b>d?b:d):(c>d?c:d));
        return max;
    }
}
