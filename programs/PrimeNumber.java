public class PrimeNumber {

  public static void main(String[] args) {


    // 2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97
    // check if number is prime or not

    int num = 99; // 2..100

    boolean flag = true;

    for (int i = 2; i < num; i++) { // 2..100
      if (num % i == 0) {
        flag = false;
        break;
      }
    }

    if (flag) {
      System.out.println(num + " is prime number");
    } else {
      System.out.println(num + " is not prime number");
    }


  }

}
