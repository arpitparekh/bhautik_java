public class RecursiveFunction {


  void hello() {
    System.out.println("Hello");
    hello();
  }

  int facto(int n) {
    if (n == 1) {
      return 1;
    }
    return n * facto(n - 1);
  }

  static int reverse(int num, int rev) {
    if (num == 0) {
      return rev; // Base case: when the number becomes 0, return the reversed number
    }
    rev = (rev * 10) + (num % 10); // 4 // 43  // 432  // 4321
    return reverse(num / 10, rev); // reverse(123, 4) // reverse(12, 43) // reverse(1, 432)
    // reverse(0, 4321)
  }

  int power(int a, int b) { // a = 2 // b = 3
    if (b == 1) {
      return a;
    }
    return a * power(a, b - 1);
  }

  void myPrint(int start,int a) {

    if (start == a+1) {
      return;
    }

    System.out.println(start);
    myPrint(start+1 , a);

  }

  // power(2,3) => return 2 * 2 * 2

  // 5 * 24
  // 5 * 4 * 6
  // 5 * 4 * 3 * 2
  // 5 * 4 * 3 * 2 * 1


  public static void main(String[] args) {

    // when function calls itself
    RecursiveFunction r = new RecursiveFunction();
    // r.hello(); // infinite recursion

    // find factorial of a number using recursive function

    System.out.println(r.facto(5));

    reverse(1234, 0);


    // Write a C program to find power of any number using recursion.
    // 2^3

    r.myPrint(1,100);

  }

}
