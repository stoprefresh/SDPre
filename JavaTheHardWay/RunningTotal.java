import java.util.Scanner;

public class RunningTotal {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int current, total = 0;

    System.out.print("Type in a bunch of values and I'll add them up. ");
    System.out.println("I'll stop when you type a zero.");
    System.out.println("Value: ");
    current = keyboard.nextInt();
    total += current;
    System.out.println("The total so far is: " + total);

     while (current != 0) {
      System.out.println("Value: ");
      current = keyboard.nextInt();
      total += current;
      if (current != 0) {
        System.out.println("The total so far is: " + total);
      } else
        System.out.println("The final total is: " + total);
    }
    /*  do {
      System.out.print("Value: ");
      current = keyboard.nextInt();
      total += current;

    } while (current != 0); */
  }
}
