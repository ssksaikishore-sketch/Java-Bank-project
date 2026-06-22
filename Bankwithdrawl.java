import java.util.Scanner;

// Step 1: Define a custom exception for insufficient funds
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

public class BankWithdrawal {

    // Step 2: Method to process the withdrawal logic
    public static void checkWithdrawal(double balance, double withdrawalAmount) throws InsufficientFundsException {
        if (withdrawalAmount > balance) {
            // Throw the exception if funds are too low
            throw new InsufficientFundsException("Error: Insufficient funds! You cannot withdraw more than your current balance.");
        } else {
            // Deduct the amount and show the updated balance
            double updatedBalance = balance - withdrawalAmount;
            System.out.printf("Withdrawal successful! Remaining balance: $%.2f%n", updatedBalance);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Step 3: Read account balance
            System.out.print("Enter your initial account balance: ");
            double balance = scanner.nextDouble();

            // Step 4: Read withdrawal amount
            System.out.print("Enter the amount you want to withdraw: ");
            double withdrawalAmount = scanner.nextDouble();

            // Step 5: Call the withdrawal method inside a try block
            checkWithdrawal(balance, withdrawalAmount);

        } catch (InsufficientFundsException e) {
            // Step 6: Catch and handle the custom exception
            System.err.println(e.getMessage());
        } catch (Exception e) {
            // Catch-all for basic input errors (like entering letters instead of numbers)
            System.err.println("Invalid input. Please enter numbers only.");
        } finally {
            scanner.close();
        }
    }
}
