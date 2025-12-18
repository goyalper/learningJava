package arrays;

public class TwoDArray {
    public static void main(String[] args) {


        int marks[][] = {{12, 32, 43}, {23, 4, 56}, {234, 465, 21, 231}};

        System.out.println(marks.length);
//        getmax marks
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int[] roll:marks){
            for (int n: roll){
                max=n>max?n:max;
                min =n<min?n:min;

            }
        }
        System.out.println(" Max is : "+max);
        System.out.println(" Min is : "+min);



    }
}
