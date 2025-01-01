public class NoOfDigit {

  public static void main(String[] args) {

    int num = 12345; // 10

    // 12345 / 10 = 1234
    // 1234 / 10 = 123
    // 123 / 10 = 12
    // 12 / 10 = 1
    // 1 / 10 = 0

    int count = 0;

    while (num != 0) {
      num = num / 10;
      count++;
    }

    System.out.println("No of digit is " + count + " he");



  }

}
