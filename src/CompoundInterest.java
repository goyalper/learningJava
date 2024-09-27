//Q. Accept the parameters and calculate the Compound Interest & print it on STDOUT

import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[]args){
        double cI, principal, rateOfInt, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculate Compound Interest");
        System.out.println("----------------------------------------------");
        System.out.println("Please Enter Principal Ammount : ");
        principal = sc.nextFloat();
        System.out.println("Please Enter Rate Of Interest : ");
        rateOfInt = sc.nextFloat();
        System.out.println("Please Enter Time Period in Years : ");
        n = sc.nextFloat();

//        Calculation:
        cI = principal * Math.pow(((100+rateOfInt)/100), n);

        System.out.println("-----------------------------------------");
        System.out.println(" Compound Interest Is : " + cI);


    }
}
