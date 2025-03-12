// A Java program to print all prime numbers from 1 to n

import java.util.*;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Input number of elements
        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int count = 0;

        for (int i = 2; i <= n; ++i) {
            boolean prime = true;
            for (int j = 2; j <= Math.sqrt(i); ++j) {
                if (i % j == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                count++;
                System.out.print(i + " ");
            }
        }

        System.out.println();
        System.out.println("Total Prime Numbers: " + count);
    }
}
