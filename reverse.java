import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input: Get the string from the user
        System.out.print("Enter a string to reverse: ");
        String originalString = scanner.nextLine();
        
        // Reverse the string using StringBuilder
        StringBuilder reversedString = new StringBuilder(originalString);
        reversedString.reverse();
        
        // Output: Display the reversed string
        System.out.println("Reversed string: " + reversedString.toString());
        
        scanner.close();
    }
}
