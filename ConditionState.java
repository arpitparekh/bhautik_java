public class ConditionState {

  public static void main(String[] args) {

    // if else
    // if else if else
    // switch case

    int a = 21;
    int b = 20;

    if (a < b) {
      System.out.println("a is less than b");
    } else {
      System.out.println("a is greater than b");
    }

    int num = 10;   // if else ladder

    if (num > 0) {
      System.out.println("num is positive");
    } else if (num < 0) {
      System.out.println("num is negative");
    } else {
      System.out.println("num is zero");
    }

    // nested if else

    if (num > 0) {

      if (a < b) {
        System.out.println("Inner if");

      } else {

        System.out.println("Inner else");
      }


    } else {

      if (a < b) {
        System.out.println("Inner if");

      } else {

        System.out.println("Inner else");
      }

    }

    // switch case

    int  day = 3;

    switch (day) {

      case 1:
        System.out.println("Monday");
        break;
      case 2:
        System.out.println("Tuesday");
        break;
      case 3:
        System.out.println("Wednesday");
      case 4:
        System.out.println("Thursday");
        break;
      case 5:
        System.out.println("Friday");
        break;
      default:
        System.out.println("Saturday");

    }

    if (day == 1) {
      System.out.println("Monday");
    } else if (day == 2) {
      System.out.println("Tuesday");
    } else if (day == 3) {
      System.out.println("Wednesday");
    } else if (day == 4) {
      System.out.println("Thursday");
    } else if (day == 5) {
      System.out.println("Friday");
    } else {
      System.out.println("Saturday");
    }


  }

}
