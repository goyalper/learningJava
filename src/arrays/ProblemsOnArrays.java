package arrays;

public class ProblemsOnArrays {
    public static void main(String[] args) {
        int num[] = {23, 12, 6, 7, 15, 3, 2, 56};

        int sum=0;
        for (int n : num){
            sum+=n;
        }
        System.out.println("Sum is : "+sum);

//        get minimum num
        int min = Integer.MAX_VALUE;
        for (int n : num){
            if(n<min){
                min = n;
            }
        }
            System.out.println("Minimum is: "+min);


//        get the maximum
        int max = Integer.MIN_VALUE;
        for (int n: num){
            if (n>max){
                max=n;
            }
        }
            System.out.println("Max is: "+max);


    }
}
