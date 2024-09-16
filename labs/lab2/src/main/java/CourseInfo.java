import java.util.InputMismatchException;
import java.util.Scanner;

public class CourseInfo {
    private String courseTitle;
    private String instructor;
    private int enrollment;
    private double studentScores;
    double averageScore;

    public void printInfo() {
        System.out.println("Course title: " + courseTitle);
        System.out.println("Instructor: " + instructor);
        System.out.println("Enrollment: " + enrollment);
        System.out.printf("Average student scores: %.2f %n", averageScore);
        System.out.println();
    }

    public void readInfo() {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter course title: ");
        courseTitle = keyboard.nextLine( );
        System.out.print("Enter instructor name: ");
        instructor = keyboard.nextLine( );
        System.out.print("Enter enrollment: ");
        enrollment = keyboard.nextInt( );

        System.out.println("Enter Student scores (1-100)");
        for (int i = 0; i < enrollment; i++) {
            System.out.println("Enter a score: ");
            try {
                double score = keyboard.nextDouble();
                studentScores += score;
            } catch(InputMismatchException e){
                System.out.println("Please enter a numerical score: ");
                keyboard.next();
                double score = keyboard.nextDouble();
                studentScores += score;
            }

        }

        averageScore = studentScores / enrollment;

    }
}
