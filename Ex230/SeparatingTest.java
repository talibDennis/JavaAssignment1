
import java.util.Scanner;

public class SeparatingTest {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter first number: ");
    int num1 = input.nextInt();

    System.out.print("Enter second number: ");
    int num2 = input.nextInt();

    System.out.print("Enter third number: ");
    int num3 = input.nextInt();

    System.out.print("Enter forth number: ");
    int num4 = input.nextInt();

    System.out.print("Enter fith number: ");
    int num5 = input.nextInt();

    System.out.printf("%d    %d    %d    %d    %d", num1, num2, num3, num4, num5);

    input.close();    
  }
}
