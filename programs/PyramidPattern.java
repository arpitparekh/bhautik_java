public class PyramidPattern {

  public static void main(String[] args) {

    /*
     *     *
     *    ***
     *   *****
     *  *******
     * *********
     */
     /*
      *  1 1
      *  2 3
      *  3 5
      *  4 7
      *  5 9
      */

     for (int i = 1; i <= 5; i++) {
       // i = 1 ? 4
       for (int j = 1; j <= 5 - i; j++) {
         System.out.print(" ");
       }

       for (int j = 1; j <= 2 * i - 1; j++) {
         System.out.print("*");
       }

       System.out.println();

     }

     System.out.println("    |\n -------\nMera Yashu");

  }

}
