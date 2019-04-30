import java.util.Scanner;

public class RudeQuestions {
  public static void main(String[] args) {
    String name, favoritePlace;
    int age;
    double weight, income;

    Scanner keyboard = new Scanner(System.in);

    System.out.print("Hello. What is your name? ");
    name = keyboard.next();

    System.out.print("Hi " + name + "! How old are you? ");
    age = keyboard.nextInt();

    System.out.println("So you're " + age + ", eh? That's not very old.");
    System.out.print("How much do you weigh, " + name + "? ");
    weight = keyboard.nextDouble();

    System.out.println(weight + "! Better keep that quiet!!");
    System.out.print("Finally, what's your income, " +  name + "? ");
    income = keyboard.nextDouble();

    System.out.print("Hopefully that is " + income + " per hour ");
    System.out.println(" and not per year!");
    System.out.print("Well thanks for answering my rude questions, ");
    System.out.println(name + ".");

    System.out.print("What is your favorite place to be in the world? ");
    favoritePlace = keyboard.next();
    System.out.println("Ah, so your favorite place to be is " + favoritePlace);


    // The program will still work with a int entered in place of a double. Java converts this automatically.
    // The program will error out if a int/double is entered in place of a String.
    // Typing something in that is outside of the defined parameters will cause the code to error out.
    
  }
}
