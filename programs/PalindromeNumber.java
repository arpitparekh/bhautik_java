public class PalindromeNumber {
  public static void main(String[] args) {

    int num = 123454321; // 121 // 12321 // 1234321
    int duplicate = num;

    // find reverse of number

    // 12345 % 10 = 5          // get the last digit
    // 12345 / 10 = 1234       // removes the last digit

    // 1234 % 10 = 4
    // 1234 / 10 = 123

    // 123 % 10 = 3
    // 123 / 10 = 12

    // 12 % 10 = 2
    // 12 / 10 = 1

    // 1 % 10 = 1
    // 1 / 10 = 0

    int rev = 0;  // 4  // 43 // 432  // 4321

    while (num != 0) { // 1234  // 123  // 12  // 1

      int last = num % 10; // 4 // 3  // 2  // 1

      rev = rev * 10 + last;

      num /= 10;
    }

    System.out.println("Reverse of " + duplicate + " is " + rev);

    if (rev == duplicate) {
      System.out.println(duplicate + " is palindrome number");
    } else {
      System.out.println(duplicate + " is not palindrome number");
    }


    }
}
