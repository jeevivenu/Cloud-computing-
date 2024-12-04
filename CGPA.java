import java.util.Scanner;

public class CGPACalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numSubjects = 5;
        double[] grades = new double[numSubjects];
        double sum = 0;

        // Input: Get the grades for 5 subjects
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter grade for subject " + (i + 1) + ": ");
            grades[i] = scanner.nextDouble();
            sum += grades[i];
        }

        // Calculate CGPA
        double cgpa = sum / numSubjects;

        // Output: Display the CGPA
        System.out.println("CGPA: " + cgpa);
        
        scanner.close();
    }
}
