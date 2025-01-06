public class MaxThree {

  public static void main(String[] args) {

    // Write a program to find a maximum between three numbers.
    int a = 50, b = 70, c = 30;

    if (a > b && a > c) { // a<b a<c
      System.out.println("a is greater");
    } else if (b > c) {
      System.out.println("b is greater");
    } else {
      System.out.println("c is greater");
    }

    int x = 10, y = 20, z = 30, p = 40;

    if (x > y && x > z && x > p) {
      System.out.println("x is greater");
    } else if (y > z && y > p) {
      System.out.println("y is greater");
    } else if (z > p) {
      System.out.println("z is greater");
    } else {
      System.out.println("p is greater");
    }

    // Write a program to check whether a number is divisible by 5 and 11 or not.

    int g = 55;

    if (g % 5 == 0 && g % 11 == 0) {
      System.out.println("divisible by 5 and 11");
    } else {
      System.out.println("not divisible by 5 and 11");
    }

    // Write a program to check whether a number is even or odd.

    int k = 5;

    if (k % 2 == 0) {
      System.out.println("even");
    } else {
      System.out.println("odd");
    }

    // Write a program to check whether a year is a leap year or not.

    int year = 2000;
    if (year % 4 == 0) {
      System.out.println("leap year");
    } else {
      System.out.println("not leap year");
    }

    // Write a program to check whether a character is in the alphabet or not.

    char ch = ' ';

    if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
      System.out.println("in the alphabet");
    } else {
      System.out.println("not in the alphabet");
    }

    // Write a program to input any alphabet and check whether it is vowel or
    // consonant

    char vowel = 'a';

    if (vowel == 'a' || vowel == 'e' || vowel == 'i' || vowel == 'o' || vowel == 'u') {
      System.out.println("vowel");
    } else {
      System.out.println("consonant");
    }

    /*
     * Write a program to input electricity unit charges and calculate total
     * electricity bill according to the given condition
     * For first 50 units Rs. 0.50/unit
     * For next 100 units Rs. 0.75/unit
     * For next 150 units Rs. 1.20/unit
     * For unit above 250 Rs. 1.50/unit
     * An additional surcharge of 20% is added to the bill
     *
     */

    double amount = 0;

    int unit = 100;

    if (unit <= 50) {
      amount = amount + (unit * 0.50);
    }

    // ternary operator
    // ? :

    int f = 40;

    int result = f < 30 ? 11 : f;

    System.out.println(result);

  }

}
