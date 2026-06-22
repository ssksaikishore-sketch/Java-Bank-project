import java.util.Scanner;

public class AccountVerification {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int correctPin = 1234;
        
        System.out.print("Enter your 4-digit Account PIN: ");
        int enteredPin = scanner.nextInt();
        
        if (enteredPin == correctPin) {
            System.out.println("PIN Verified Successfully. Access Granted.");
        } else {
            System.out.println("Invalid PIN. Access Denied.");
        }
        scanner.close();
    }
}
