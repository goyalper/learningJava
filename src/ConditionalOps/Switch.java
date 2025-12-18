package ConditionalOps;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("choose the no. 1-7 : ");
        int n = in.nextInt();

        day(n);

    }
    public static void day(int n){
        switch (n){
            case 1:
                System.out.println("Congrats Its Monday...");
                break;
                case 2:
                    System.out.println("Congrats Its Tuesday...");
                    break;
                    case 3:
                    System.out.println("Congrats Its Wednesday...");
                    break;
                    case 4:
                    System.out.println("Congrats Its Thursday...");
                    break;
                    case 5:
                    System.out.println("Congrats Its Friday...");
                    break;
                    case 6:
                    System.out.println("Congrats Its Saturday...");
                    break;
                    case 7:
                    System.out.println("Congrats Its Sunday...");
                    break;
                    default:
                        System.out.println("Invalid input");
        }
    }
}
