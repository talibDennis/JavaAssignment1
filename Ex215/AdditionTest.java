
import java.util.Scanner;

public class AdditionTest {
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);

    System.out.print("Input a number: ");
    int num1 = input.nextInt();

    System.out.print("Input a number: ");
    int num2 = input.nextInt();

    int sum = num1 + num2;

    System.out.printf("Sum is %d%n", sum);

    input.close();
  }

}