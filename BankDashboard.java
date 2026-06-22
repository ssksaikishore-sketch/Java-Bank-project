import java.util.Scanner;

public class BankDashboard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Welcome to the Campus Bank System ===");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit Money");
        System.out.println("3. Withdraw Money");
        System.out.println("4. Exit");
        System.out.print("Select an option (1-4): ");
        
        int choice = scanner.nextInt();
        System.out.println("You selected option " + choice + ". Thank you for banking with us!");
        scanner.close();
    }
}
