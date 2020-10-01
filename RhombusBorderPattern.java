
/*
This code prints the Rhombus Border Pattern,

ENTER A ODD NUMBER AND A CHARACTER TO SEE THE RHOMBUS BORDER PATTERN

EXAMPLE-
  INPUT-1) 9 A
        2) 5 B

 
*/
import java.util.Scanner;

public class RhombusBorderPattern {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number and a character for printing Rhombus Border Pattern:");
    System.out.print("Enter a number:");
    int size = sc.nextInt();
    sc.nextLine();
    System.out.print("Enter a character:");
    String display = sc.nextLine();
    {
    size = 2 * size + 1;
    int j = (size) / 2;
    double k = j;
    double r, c;
    for (r = 0; r < size; r++) {
      for (c = 0; c < size; c++) {
        if (r + c == k || r - c == k || c - r == k || ((r + c) / 3 == k)) {
          System.out.print(display + " ");
        } else {
          System.out.print("  ");
        }
      }
      System.out.println();
    }
  }
    sc.close();
  }
}