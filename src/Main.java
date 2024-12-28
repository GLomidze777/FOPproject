import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Sum of First N Numbers");
            System.out.println("2. Factorial");
            System.out.println("3. GCD of Two Numbers");
            System.out.println("4. Check if Prime");
            System.out.println("5. Check if Palindrome");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter N: ");
                    int n = scanner.nextInt();
                    System.out.println("Sum: " + Interpreter.sumOfFirstNNumbers(n));
                    break;
                case 2:
                    System.out.print("Enter N: ");
                    int factN = scanner.nextInt();
                    System.out.println("Factorial: " + Interpreter.factorial(factN));
                    break;
                case 3:
                    System.out.print("Enter first number: ");
                    int a = scanner.nextInt();
                    System.out.print("Enter second number: ");
                    int b = scanner.nextInt();
                    System.out.println("GCD: " + Interpreter.gcd(a, b));
                    break;
                case 4:
                    System.out.print("Enter number: ");
                    int primeN = scanner.nextInt();
                    System.out.println("Is Prime: " + Interpreter.isPrime(primeN));
                    break;
                case 5:
                    System.out.print("Enter number: ");
                    int palN = scanner.nextInt();
                    System.out.println("Is Palindrome: " + Interpreter.isPalindrome(palN));
                    break;
                case 0:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
