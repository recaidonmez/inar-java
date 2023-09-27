package week_05.assignments;

import java.util.Scanner;

public class Question_05_08 {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner input = new Scanner(System.in);

        int highestScore = 0;            // Holds the highest student score
        String highestScoreName = ""; // Holds the student name with the highest score

        // Prompt the user to enter the number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();

        // Prompt the user to enter each student's name and score
        System.out.println("Enter each student’s name and score");
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Student: " + (i + 1) + "\n   Name: ");
            String name = input.next();

            System.out.print("   Score: ");
            int score = input.nextInt();

            // Test if score is higher than the highest score
            if (score > highestScore) {
                highestScore = score;
                highestScoreName = name;
            }
        }
        // Display the name of the student with the highest score
        System.out.println("Student with the highest score: " + highestScoreName);
    }
}
