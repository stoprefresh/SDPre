public class CreatingVariables {
  public static void main(String[] args) {
    int x, y, age, m;
    double seconds, e, checking, abv;
    String firstName, lastName, title, summerSport, winterSport;

    x = 10;
    y = 400;
    age = 39;
    m = 30;

    seconds = 4.71;
    e = 2.71828182845904523536;
    checking = 1.89;
    abv = 6.70;

    firstName = "Graham";
    lastName = "Mitchell";
    title = "Mr.";
    summerSport = "mountain biking";
    winterSport = "snowboarding";

    System.out.println("The variable x contains " + x);
    System.out.println("The value " + y + " is stored in the variable y.");
    System.out.println("The experiment took " +  seconds + " seconds.");
    System.out.println("A favorite irrational # is Euler's number: " + e);
    System.out.println("Hopefully you have more than $" + checking + "!");
    System.out.println("My name's " + title + " " + firstName + lastName);

    System.out.println();
    System.out.println("My current age is " + m);
    System.out.println("Juicy Bits from Weldwerks has an ABV of " + abv + "%");
    System.out.println("My favorite two seasonal sports are " + summerSport + " and " + winterSport);
  }
}
