import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner MyScan = new Scanner(System.in);
        int choise = 0;
        System.out.println("Введіть номер завдання: ");
        choise = MyScan.nextInt();

        switch (choise){
            case 1:
                zavd_1();
                break;
            case 2:
                zavd_2();
                break;
            default:
                break;
        }


    }
    // завдання 1
    public static void zavd_1()
    {
        int n = 10;
        int r = 8;
        BigInteger result = permutation(n, r);
        System.out.println("Число всіх розміщень без повторів з " + n + " по " + r + " елементів є " + result);
    }
    public static BigInteger factorial(int number) {
        BigInteger fact = BigInteger.ONE;
        for (int i = 2; i <= number; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        return fact;
    }

    public static BigInteger permutation(int n, int r) {
        return factorial(n).divide(factorial(n - r));
    }

    // завдання 2
    public static void zavd_2()
    {
        int i = 13;
        int n = i + 5;
        int[][] F = new int[n+1][n+1];
        int[] B = new int[n+1];

        // Step 4: Assign values to the first column and the main diagonal of the table
        for (int j = 1; j <= n; j++) {
            F[j][1] = 1;
            F[j][j] = 1;
        }

        // Step 5: Calculate the rest of the Stirling numbers of the second kind
        for (int j = 3; j <= n; j++) {
            for (int k = 2; k < j; k++) {
                F[j][k] = F[j - 1][k - 1] + k * F[j - 1][k];
            }
        }

        // Step 6: Assign initial values to Bell numbers
        for (int j = 1; j <= n; j++) {
            B[j] = 0;
        }

        // Step 7: Calculate Bell numbers
        for (int j = 1; j <= n; j++) {
            for (int k = 1; k <= j; k++) {
                B[j] += F[j][k];
            }
        }

        // Step 8: Print the result in the form of a table
        for (int j = 1; j <= n; j++) {
            for (int k = 1; k <= j; k++) {
                System.out.print(F[j][k] + " ");
            }
            System.out.println("... " + B[j]);
        }

    }
}