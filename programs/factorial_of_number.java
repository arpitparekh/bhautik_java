public class factorial_of_number {
  public static void main(String[] args) {

    // 3! = 3 * 2 * 1 = 6
    // 4! = 4 * 3 * 2 * 1 = 24
    // 5! = 5 * 4 * 3 * 2 * 1 = 120

    int num = 5;

    int facto = 1; // 1 // 2 // 6 // 24  // 120

    for (int i = 1; i <= num; i++) { // 1 // 2 // 3 // 4 // 5
      facto *= i;
    }

    System.out.println(facto);
    
  }
}
