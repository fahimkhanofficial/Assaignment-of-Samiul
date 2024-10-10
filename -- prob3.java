package Javapp;

import java.util.Scanner;

public class pb5c {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value of n: ");
        printDiamond(scanner.nextInt());
        scanner.close();
    }

    public static void printDiamond(int n) {
        for (int i = 1; i <= n; i++) printLine(n, i);   // Upper half
        for (int i = n - 1; i > 0; i--) printLine(n, i); // Lower half
    }

    private static void printLine(int n, int i) {
        System.out.println(" ".repeat(n - i) + "*".repeat(2 * i - 1));
    }
}