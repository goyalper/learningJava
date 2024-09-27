import java.util.Scanner;
//only works for integers or no. values
public class SwapTwoNumWo3 {
    public static void main(String[] args) {
        int a = 4, b = 6;
        a = a+b;
        b = a-b;
        a = a-b;


        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }

}
