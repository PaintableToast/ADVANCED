package advanced.week4;

import java.util.Scanner;

public class A {
    public final static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int arraylength = scanner.nextInt(), functionlength = scanner.nextInt();
        scanner.nextLine();
        final int[] numbers = new int[10^7];
        for (int i = 0; i < arraylength; i++) numbers[i] = scanner.nextInt();
        scanner.nextLine();
        long calculation;
        int a, b, x, i,  r = 0;
        for (i = 0; i < functionlength; i++) {
            if (scanner.nextInt() == 'q') {
                calculation = 0;
                if (scanner.hasNext()) {
                    a = scanner.nextInt();
                    b = scanner.nextInt();
                    for (x = a + r - 1; x < b + r; x++) calculation += numbers[x];
                } else for (x = r; x < arraylength + r; x++) calculation += numbers[x];
                System.out.println(calculation);
            } else {
                numbers[r + arraylength] = numbers[r];
                numbers[r] = 0;
                r++;
            }
            scanner.nextLine();
        }
    }
}
