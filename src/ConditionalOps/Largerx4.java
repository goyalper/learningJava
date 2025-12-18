package ConditionalOps;

import java.util.Scanner;

public class Largerx4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter any four number : ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        System.out.println(a + " " + b + " " + c + " " + d);
        System.out.println("__________________________________");
        checkLarge(a,b,c,d);
    }
    public static void checkLarge(int a,int b,int c,int d){
        if(a>b){
            System.out.println(a+" is larger than "+b);
            if (a>c){
                System.out.println(a+" is larger than "+c);
                if (a>d){
                    System.out.println(a+" is larger than "+d);
                    System.out.println(a +" is the largest");
                }else{
                    System.out.println(d+" is larger than "+a);
                    System.out.println(d+" is the largest");}
            }else{
                    System.out.println(c+" is larger than "+a);
                    if (c>d){
                        System.out.println(c+" is larger than "+d);
                        System.out.println(c+" is the largest");
                    }else{
                        System.out.println(d+" is larger than "+c);
                        System.out.println(d+" is the largest");}
                    }

            }else{
            System.out.println(b+" is larger than "+a);
            if (b>c){
                System.out.println(b+" is larger than "+d);
                if (b>d){
                    System.out.println(b+" is larger than "+a);
                    System.out.println(b+" is the largest");
                }else{
                    System.out.println(d+" is larger than "+b);
                    System.out.println(d+" is the largest");
                }
            }else{
                System.out.println(c+" is larger than "+b);
                if (c>d){
                    System.out.println(c+" is larger than "+d);
                    System.out.println(c+" is the largest");
                }
            }
        }
        }
    }
