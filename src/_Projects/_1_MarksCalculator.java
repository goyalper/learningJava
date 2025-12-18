//    Student Marks Calculator
    /* BluePrint
    Take student name
    take marks of Dynamic subs
    calculate total and percentages
    - decide grades
*/

package _Projects;
import java.util.Arrays;
import java.util.Scanner;

public class _1_MarksCalculator {

    static String  calculateGrade(double percentage ){
//        Decide Grades based on Obtained Percentile

        String obtainedGrade;
        if (percentage > 90){
            obtainedGrade = "A++";
        } else if (percentage>80) {
            obtainedGrade = "A+";
        } else if (percentage>70) {
            obtainedGrade = "A";
        } else if (percentage>65) {
            obtainedGrade = "B+";
        } else if (percentage>60) {
            obtainedGrade = "B";
        } else if (percentage>50) {
            obtainedGrade = "C+";
        } else if (percentage>45) {
            obtainedGrade = "C";
        } else if (percentage>40) {
            obtainedGrade = "D+";
        } else if (percentage>35) {
            obtainedGrade = "D";
        }else{
            obtainedGrade = "Fail";
        }

        return obtainedGrade;
    }

    public static void main(String[] args){
        System.out.print("Enter Your Name : ");
        Scanner getValue = new Scanner(System.in);
        String studentName = getValue.nextLine();
        System.out.println("-------------Hello "+studentName+",Welcome to Grade Calculator-----------------\n- We will calculate your marks for Given No. of Subjects\n- Marks will be out of 100\n-Grades decide factor is \n\t-> 90+ to 100 = A++\n\t-> 80+ to 90 = A+\n\t-> 70+ to 80 = A\n\t-> 65+ to 70 = B+\n\t-> 60+ to 65 = B\n\t-> 50+ to 60 = C+\n\t-> 45+ to 50 = C\n\t-> 40+ to 45 = D+\n\t-> 35+ to 40 = D\n\t-> Less Than 35 % than Fail\n- Start Using it :)\n-----------------------------------------------------------------------\n");

        System.out.println("Give me The No. of Subjects You Want To calculate marks for ? \n(Like 3, 4, 5 etc subjects)");
        int subjects = getValue.nextInt();
        System.out.print("Enter Total marks per Subject :");
        int subjectTotal = getValue.nextInt();

//        using array for storing the numbers of different subjects
        double[] marks = new double[subjects];
        String[] subGrades = new String[subjects];
        double[] subPercentile = new double[subjects];
        double totalMarks = 0;
        System.out.println("\nEnter  Marks Here (Out of 100):");
        for(int i = 0; i < subjects; i++ ) {
            System.out.print("Marks for Subject " + (i + 1) + " = ");
            marks[i] = getValue.nextDouble();
            if (marks[i] < 0 || marks[i] > subjectTotal) {
                System.out.println("Marks must be between 0 and " + subjectTotal);
                i--;
                continue;
            }

            totalMarks += marks[i];
            subPercentile[i] = (marks[i] / subjectTotal) * 100;
            subGrades[i] = calculateGrade(subPercentile[i]);
        }
//        (total obtained / grand total) x 100
        int grandTotal = subjects*subjectTotal;
        double percentage = (totalMarks / grandTotal)*100;
        boolean hasFail = Arrays.stream(subGrades).anyMatch("Fail"::equalsIgnoreCase);

        System.out.println("----------------------------------------------------------------------\nHere is Your Result "+studentName+":");
        System.out.println(Arrays.toString(marks));
        System.out.println("Total Obtained Marks : "+ totalMarks);
        System.out.println("Grand Total : "+grandTotal);
        System.out.printf("Obtained Percentage : %.2f %%\n", percentage);
        String grade = calculateGrade(percentage);
        String finalResult;
        if(hasFail){
            finalResult="Supplementary !!! \nGot Failed with Supplementary! Best of Luck For Exams :)";
        }else if(grade.equals("Fail")) {
            finalResult= "Got Failed ! Best of Luck For Future :)";
        }else {
            finalResult="Your Grade is : "+grade;}
        System.out.println(finalResult);


        System.out.print("------------------------------------------------------------------------------\nDo you want know more : \n\t- Press 1 to get Subject Wise Grades\n\t Press 0 to Exit\n\t Enter Here : ");
        int n = getValue.nextInt();
        if (n != 1) {
            return;
        }

        System.out.println("--------------------------------------------------------------------------\n\nDear "+studentName+", Your Subject Wise Grades are here :");
        for (int i = 0; i < subjects; i++){
//            System.out.println("Subject "+(i+1)+"\t"+marks[i]+"\t"+subPercentile[i]+"% \t"+calculateGrade(marks[i]));
            System.out.printf(
                    "Subject %d\t%.2f\t%.2f %%\t%s%n",
                    i + 1,
                    marks[i],
                    subPercentile[i],
                    calculateGrade(subPercentile[i])
            );

        }
        System.out.println("\nTotal Obtained Marks : "+ totalMarks);
        System.out.println("Grand Total : "+grandTotal);
        System.out.printf("Obtained Percentage : %.2f %%\n", percentage);
        System.out.println(finalResult);

        getValue.close();



    }


}
