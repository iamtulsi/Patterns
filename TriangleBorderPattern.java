/*
This code prints the Rhombus Border Pattern,

Enter any number to generate Pattern.

*/
import java.util.*;

class TriangleBorderPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number for printing Triangle Border Pattern:");
        int s = sc.nextInt();
        int size = (s * 2) - 1;
        int k = (size) / 2;
        int r, c;

        for (r = 0; r < size; r++) {
            for (c = 0; c < size; c++) {
                if (r + c == k || c - r == k) {
                    System.out.print("*");
                } else if (r == size - k - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}