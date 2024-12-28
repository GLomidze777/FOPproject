public class InterpreterTest {
    public static void main(String[] args) {
        // Test: Sum of First N Numbers
        int sum = Interpreter.sumOfFirstNNumbers(10);
        System.out.println("Sum of first 10 numbers: " + sum); // Expected: 55

        // Test: Factorial of N
        int factorial = Interpreter.factorial(5);
        System.out.println("Factorial of 5: " + factorial); // Expected: 120

        // Test: GCD of Two Numbers
        int gcd = Interpreter.gcd(48, 18);
        System.out.println("GCD of 48 and 18: " + gcd); // Expected: 6

        // Test: Prime Check
        boolean isPrime = Interpreter.isPrime(13);
        System.out.println("Is 13 prime? " + isPrime); // Expected: true

        // Test: Palindrome Check
        boolean isPalindrome = Interpreter.isPalindrome(121);
        System.out.println("Is 121 a palindrome? " + isPalindrome); // Expected: true
    }
}
