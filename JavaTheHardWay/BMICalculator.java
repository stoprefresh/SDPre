import java.util.Scanner;

public class BMICalculator {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    double m, kg, bmi, heightInch, heightFeet, pounds;

    System.out.print("Your height (feet only): ");
    heightFeet = keyboard.nextDouble();

    System.out.print("Your height (inches only): ");
    heightInch = keyboard.nextDouble();

    System.out.print("Your weight in pounds: ");
    pounds = keyboard.nextDouble();

    kg = pounds * 0.45359237;
    m = 0.0254 * (heightInch + (heightFeet * 12));

    bmi = kg / (m*m);

    System.out.println("Your BMI is " + bmi);

  }
}
