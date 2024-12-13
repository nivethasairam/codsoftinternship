package task1;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    
        System.out.print("Enter  total number of subjects: ");
        int totalSubjects = scanner.nextInt();

        
        int[] marks = new int[totalSubjects];
        int totalMarks = 0;

        
        for (int x = 0; x < totalSubjects; x++) {
            System.out.print("Enter marks for subject " + (x + 1) + " out of 100: ");
            marks[x] = scanner.nextInt();

            
            while (marks[x] < 0 || marks[x] > 100) {
                System.out.print("could you  Please enter marks between 0 and 100 only : ");
                marks[x] = scanner.nextInt();
            }

            totalMarks += marks[x];
        }

        
        double avgPercentage = (double) totalMarks / totalSubjects;

    
        char grade;
        if (avgPercentage >= 90) {
            grade = 'A';
        } else if (avgPercentage >= 80) {
            grade = 'B';
        } else if (avgPercentage >= 70) {
            grade = 'C';
        } else if (avgPercentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

      
        System.out.println("    ___Results___  ");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + avgPercentage + "%");
        System.out.println("Grade: " + grade);
          if (grade=='A'){
        System.out.println("Feedback: " + "Topper");}
         if (grade=='B'){
        System.out.println("Feedback: " + "Excellent");}
         if (grade=='C'){
        System.out.println("Feedback: " + "Good");}
         if (grade=='D'){
        System.out.println("Feedback: " + " Try Better");}
         if (grade=='F'){
        System.out.println("Feedback: " + "Work Hard");}
        System.out.println("ThankYou");

        scanner.close();
    }
}

    
