import java.util.Scanner;

public class Objective3Lab5 {
  public static void main(String[] args) {

    double input1, input2, sum;

    Scanner input = new Scanner(System.in);

    System.out.println("Please enter a number:");
    input1 = input.nextDouble();

    System.out.println("Please enter another number:");
    input2 = input.nextDouble();

    sum = input1 + input2;

    System.out.println("The sum of " + input1 + " + " + input2 + " = " + sum);

    input.close();
  }
}
