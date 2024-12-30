class Operators{

  public static void main(String[] args) {

    // operators
    // are the symnol which perform some operation on operands(variables)

    // 1. Arithmetic operators
    // + - * / %

    System.out.println(12 % 13);
    System.out.println((float) 12 / (float) 13);

    System.out.println(12 % 10); // last digit is 2
    System.out.println(12 / 10); // remove the last digit (int)

    // 2. Relational operators
    // < > <= >= == !=  // boolean

    System.out.println(12<13);

    boolean b = 12 > 13;

    System.out.println(b);

    // 3. Logical operators
    // && || !
    // between 2 conditional operaotors

    boolean b3 = 12 < 13 || 14 > 15;
    System.out.println(!b3);

    // increment and decrement operators
    // ++ --
    int i = 10;
    i++;
    System.out.println(i);

  }

}
