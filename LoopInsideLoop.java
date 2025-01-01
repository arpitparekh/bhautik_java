public class LoopInsideLoop {

  public static void main(String[] args) {

    /*
    *****
    *****
    *****
    *****
    *****
     */
    for (int i = 1; i <= 6; i++) {

      for (int j = 1; j <= 6; j++) {
        System.out.print("*");
      }

      System.out.println();

    }

    /*
     * left aligned output
     *
     **
     ***
     ****
     *****
     */

    for (int i = 1; i <= 5; i++) {

      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }

      System.out.println();
    }

    /*
     * right aligned output
     *
     **
     ***
     ****
     *****
     */

    for (int i = 1; i <= 5; i++) {

      // i = 1 ? 4
      // for (int j = 1; j <= 5-i; j++) {
      // System.out.print(" ");
      // }

      for (int j = 5 - i; j >= 1; j--) {
        System.out.print(" ");
      }

      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }

      System.out.println();
    }


    System.out.println();
    /*
     * left aligned inverted triangle
     *****
     ****
     ***
     **
     *
     */

    for (int i = 1; i <= 5; i++) {

      for (int j = 6 - i; j >= 1; j--) {
        System.out.print("*");
      }

      System.out.println();
    }


    /*
     * right aligned inverted triangle
     *****
      ****
       ***
        **
         *
     */

    for (int i = 1; i <= 5; i++) {

      // i = 1 ? 4
      // for (int j = 1; j <= 5-i; j++) {
      // System.out.print(" ");
      // }

      for (int j = 1; j <= i-1; j++) {
        System.out.print(" ");
      }

      for (int j = 6 - i; j >= 1; j--) {
        System.out.print("*");
      }

      System.out.println();
    }

  }

}
