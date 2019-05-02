import java.util.Scanner;

public class EnterPin {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int pin, entry;
    String password, passEntry;

    pin = 12345;
    password = "captain";

    System.out.println("WELCOME TO THE BANK OF JAVA");
    System.out.println("ENTER YOUR PASSWORD: ");
    passEntry = keyboard.next();

    while (! passEntry.equals(password)) {
      System.out.println("\nINCORRECT PASSWORD. TRY AGAIN.");
      System.out.println("ENTER YOUR PASSWORD: ");
      passEntry = keyboard.next();
    }

    System.out.print("ENTER YOUR PIN: ");
    entry = keyboard.nextInt();

    while (entry != pin) {
      System.out.println("\nINCORRECT PIN. TRY AGAIN.");
      System.out.print("ENTER YOU PIN: ");
      entry = keyboard.nextInt();
    }

    System.out.println("\nPIN ACCPETED. YOUR ACCOUNT BALANCE IS $425.17");
  }
}
