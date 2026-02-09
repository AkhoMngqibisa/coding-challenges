package hackerrank.java.Introduction;

import java.util.Scanner;

public class ConditionalFormatting {
    private static final Scanner scanner = new Scanner(System.in);

    static void main(String[] args) {
        System.out.println("---------  Testing -----------");
        printCondition();
        dataTypes();
    }

    /**
     * Given an integer, perform the following conditional actions:
     * If  is odd, print Weird
     * If  is even and in the inclusive range of  to , print Not Weird
     * If  is even and in the inclusive range of  to , print Weird
     * If  is even and greater than , print Not Weird
     * <p>
     * Input Format: A single line containing a positive integer
     * Constraints: 1<= n <= 100
     * Output Format:  Print Weird if the number is weird; otherwise, print Not Weird.
     */
    public static void printCondition() {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        if (N % 2 == 1) {
            System.out.println("Weird");
        } else {
            if (N >= 2 && N <= 5) {
                System.out.println("Not Weird");
            } else if (N >= 6 && N <= 20) {
                System.out.println("Weird");
            } else if (N > 20) {
                System.out.println("Not Weird");
            }
        }
        scanner.close();
    }

    /**
     * In this challenge, you must read an integer, a double, and a String from stdin, then print the values
     *
     * Input Format
     * The first line contains an integer.
     * The second line contains a double.
     * The third line contains a String.
     *
     * Output Format
     * On the first line, print String: followed by the unaltered String read from stdin.
     * On the second line, print Double: followed by the unaltered double read from stdin.
     * On the third line, print Int: followed by the unaltered integer read from stdin.
     */
    public static void dataTypes() {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();

        // Write your code here.
        double d = scan.nextDouble();
        scan.nextLine();        // consume leftover newline
        String s = scan.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);

        scan.close();
    }
}
