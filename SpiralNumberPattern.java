
/*
This code prints the Spiral Number Pattern,

Enter any number to generate Pattern.


*/
import java.util.*;

public class SpiralNumberPattern {
    public static void main(String[] args) {
        System.out.print("Enter a number for printing Spiral NumberPattern:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int r = 0;
        int c = 0;
        int n = 1;
        int s = num * num;
        int a[][] = new int[num][num];
        int min = 0;
        int max = num - 1;
        while (n <= s) {
            if (r == min && c == min) {
                for (; c <= max; c++) {
                    a[r][c] = n;
                    n++;
                }
                c--;
            }
            if (r == min && c == max) {
                for (r += 1; r <= max; r++) {
                    a[r][c] = n;
                    n++;
                }
                r--;
            }
            if (r == max && c == max) {
                for (c -= 1; c >= min; c--) {
                    a[r][c] = n;
                    n++;
                }
                c++;
            }
            if (r == max && c == min) {
                for (r -= 1; r > min; r--) {
                    a[r][c] = n;
                    n++;
                }
                r++;
                c++;
            }
            min++;
            max--;
        }
        for (r = 0; r < num; r++) {
            for (c = 0; c < num; c++) {
                System.out.print(" " + a[r][c] + " ");
            }
            System.out.println();
        }

    }
}