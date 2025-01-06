public class Functions {

  // user defined functions
  void enjoy() {    // function defination
    System.out.println("enjoying");
  }

  void greeting(String name) {
    System.out.println("Hello " + name);
  }

  void sum(int a, int b) {
    System.out.println(a + b);
  }

  int myfunction() {
    return 20;
  }

  int[] myArray() {

    int[] arr = { 1, 2, 3, 4, 5 };
    return arr;
  }

  float myFloat(float radius) {
    return 3.14f * radius * radius;
  }

  float div(int a, int b) {
    return (float)a / (float)b;
  }

  int mul(int a, int b) {
    return a * b;
  }


  public static void main(String[] args) {

    // functions // methods
    // function is a block of code that runs when we called it

    // functions

    // function name
    // function block
    // function parameters
    // function return type
    Functions f = new Functions();
    f.enjoy(); // function call
    f.greeting("Bhautik");
    f.greeting("Bascom");
    f.greeting("Suresh");

    f.sum(12, 13);
    f.sum(10, 30);

    // when function returns a value the whole functions becomes that value
    System.out.println(f.myfunction());

    int result = 10 +  f.myfunction();
    System.out.println(result);

    for (int i = 0; i < f.myArray().length; i++) {
      System.out.println(f.myArray()[i]);
    }

    float area = f.myFloat(5.5f);
    // System.out.println(f.myFloat(5.5f));
    System.out.println(area);

    System.out.println(f.div(f.mul(3, 4), f.mul(1, 2)));

    int a = 12;
    

  }

}
