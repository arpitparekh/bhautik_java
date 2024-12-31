public class Loops {
  public static void main(String[] args) {

    // while
    // for
    // do..while

    // intial value
    // condition
    // increment/decrement

    int a = 10;

    while (a <= 20) {
      System.out.println(a);
      a++;
    }

    // do while loop

    // intial value
    // increment/decrement
    // condition

    int b = 10;

    do {
      System.out.println(b);
      b++;
    } while (b < 20);

    System.out.println();

    for (int i = 1, j = 10; i <= 10 && j <= 20; i++,j++) {
      System.out.println(i);
      System.out.println(j);
    }


  }
}
