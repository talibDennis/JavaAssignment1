
import java.util.Scanner;

public class ValueSpacedTest {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Input first number: ");
    int num1 = input.nextInt();

    System.out.print("Input second number: ");
    int num2 = input.nextInt();

    System.out.print("Input third number: ");
    int num3 = input.nextInt();

    System.out.print("Input forth number: ");
    int num4 = input.nextInt();

    System.out.printf("%d %d %d %d %d", num1, num2, num3, num4);

    input.close();
  }

}
