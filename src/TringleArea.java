//Q. Accept the three sides of triangle and calculate the area using herons formula (Home Work)

import java.util.Scanner;

public class TringleArea {
    public static void  main(String[]args)  {
        float a, b, c, s, area;
        System.out.println("Calculate Area Of A Triangle Using Herons Formula");
        System.out.println("------------------------------------------------------------------------------");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Values of a, b, c with a Space Between them : ");
        a = scan.nextFloat();
        b = scan.nextFloat();
        c = scan.nextFloat()
        ;

//      calculations

        s = (a+b+c)/2;
        area = (float) Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.println("---------------------------------------------------------------");
        System.out.println(" Area of the Triangle Is : " + area);

    }
}






















