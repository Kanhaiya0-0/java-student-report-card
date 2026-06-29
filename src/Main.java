import java.util.Scanner;

public class Main {

    public static String isPass(int marks) {
        if (marks >= 40) {
            return "Pass";
        } else {
            return "Fail";
        }
    }

    public static String getGrade(int marks) {
        if (marks >= 90) {
            return "A";
        } else if (marks >= 80) {
            return "B";
        } else if (marks >= 70) {
            return "C";
        } else if (marks >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    public static String isEligible(int marks, int attendance) {
        if (marks >= 40 && attendance >= 75) {
            return "Eligible";
        } else {
            return "Not Eligible";
        }
    }
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
    
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

    
        System.out.print("Enter your marks: ");
        int marks = scanner.nextInt();

    
        System.out.print("Enter your attendance: ");
        int attendance = scanner.nextInt();



        System.out.println("========= REPORT CARD =========");
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println("Attendance: " + attendance + "%");
        System.out.println();
        System.out.println("Result: " + isPass(marks));
        System.out.println("Grade: " + getGrade(marks));
        System.out.println("Eligibility for Exam: " + isEligible (marks, attendance));
        System.out.println("================================");

        scanner.close();
    }
}