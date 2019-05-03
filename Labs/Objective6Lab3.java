public class Objective6Lab3 {
  public static void main(String[] args) {
    int counter = 1;
    boolean even;
    do {
      even = (counter % 2 == 0);
      if (even == true) {
        System.out.println(counter + " is even");
        counter = counter + 1;
      }
      else {
          System.out.println(counter + " is odd");
          counter = counter + 1;
        }
    } while (counter <= 20);
  }
}
