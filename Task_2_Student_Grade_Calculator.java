package codesoft;

import java.util.*;

public class Task_2_Student_Grade_Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count, i;
        float totalMarks = 0, percentage;
        
        System.out.println("Enter Number of Subjects:");
        count = in.nextInt();

        System.out.println("Enter Marks of " + count + " Subjects:");
        for (i = 0; i < count; i++) {
            totalMarks += in.nextInt();
        }
        in.close();

        System.out.println("Total Marks: " + totalMarks);
        percentage = (totalMarks / (count * 100)) * 100;

        System.out.println("Percentage: " + percentage);

        switch ((int) percentage / 10) {
            case 10:
            case 9:
                System.out.println("Grade : A+");
                break;
            case 8:
                System.out.println("Grade : A");
                break;
            case 7:
                System.out.println("Grade : B");
                break;
            case 6:
                System.out.println("Grade : C");
                break;
            case 5:
                System.out.println("Grade : D");
                break;
            default:
                System.out.println("Grade : F");
                break;
        }
    }
}
