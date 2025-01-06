package oopc;

class Student {
  String name;
  int age;
  float height;

  Student() {
    System.out.println("Constructor called");
  }
  
}

public class ConstrcutorInClass {

  public static void main(String[] args) {

    // Constructor
    // constructor is a special function that calls automatically when we create an object of a class.
    // constructor and class name is similar
    // constructor does not have return type
    // constructor name is same as class name
    // used to create a object of a class

    Student s = new Student();


  }

}
