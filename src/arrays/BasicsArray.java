package arrays;

public class BasicsArray {
    public static void main(String[] args) {
//        int age[];  //c style declaration
//        int[] age2;   //JAVA style declaration

        int age[] = new int[5];

        age[0] = 20;
        age[1] = 30;
        age[2] = 40;
        for (int i = 0; i < 5; i++) {
//            System.out.println(age[i]);
        }
        System.out.println("Length age: "+age.length);

    }
}
