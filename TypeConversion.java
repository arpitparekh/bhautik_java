public class TypeConversion {

  public static void main(String[] args) {

    // type conversion
    // convert one datatype into another

    // implicit type conversion
    // automatic type conversion

    // automatic type conversion
    // widening conversion
    // byte -> short -> char -> int -> long -> float -> double

    byte b = 127;
    short s = b;
    System.out.println(s);
    int i = s;
    System.out.println(i);
    long l = i;
    System.out.println(l);
    float f = l;
    System.out.println(f);
    double d = f;
    System.out.println(d);

    // implicit type conversion
    // widening conversion
    // double(64 bit) -> float(32 bit) -> long -> int -> (char) -> short -> byte

    int i1 = 129;
    byte b2 = (byte) i1;
    System.out.println(b2);

    double d1 = 123.454545;
    float f1 = (float) d1;
    System.out.println(f1);

    // int -> (char) -> short

    int i2 = 65;
    char c2 = (char) i2;
    System.out.println(c2);

    Integer i3 = 123;
    System.out.println(i3);

    // % operator // reminder
    System.out.println(123 % 10); // 3

  }

}
