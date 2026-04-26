import java.util.*;
import java.io.*;
public class Marks
{
    public static void main(String[] args)
    {
        String name;
        double avg;
        char grade;
        double percentage;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the name of the student:");
        name = in.nextLine();
        System.out.print("Enter number of subjects: ");
        int n = in.nextInt();
        int tot=0;
         for (int i = 1; i <= n; i++)
         {
            System.out.print("Enter marks for subject " + i + ": ");
            int marks = in.nextInt();
            tot += marks;
        }
        avg= (double) tot / n;
        percentage = (double) tot / (n * 100) * 100;
        if (avg >= 90) grade = 'A';
        else if (avg >= 75) grade = 'B';
        else if (avg >= 60) grade = 'C';
        else if (avg >= 50) grade = 'D';
        else grade = 'F';
        System.out.print("Name:" +name);
        System.out.println("\nTotal Marks: " + tot);
        System.out.println("Average Percentage: " + avg);
        System.out.println("Overall Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);
    }
}

