package oopc;

class Student {
  // class propertoes (variables)
  // member functions (methods)
  String name;
  int age;
  float height;

}

public class ClassObject {

  public static void main(String[] args) {

    // class
    // dividing everything into small parts
    // class is a blueprint
    // code resuability

    // to acess class properties outside of class we use objects
    // objects are instances of class
    Student s = new Student();
    s.name = "Sumit";
    s.age = 12;
    s.height = 12.34f;
    Student s1 = new Student();
     s.name = "Mital";
    s.age = 12;
    s.height = 12.34f;

    


  }
}
