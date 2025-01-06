package oopc;

class Employee{

  String name;
  int id;
  float salary;

  void assignValues(String n, int i, float s) {
    name = n;
    id = i;
    salary = s;

  }

  void display() {
    System.out.println("Name: " + name);
    System.out.println("ID: " + id);
    System.out.println("Salary: " + salary);
  }

}

public class AssginValueUsingFunction {

  public static void main(String[] args) {

    Employee e = new Employee();
    e.assignValues("Sumit", 1, 10000);
    e.display();
    Employee e1 = new Employee();
    e1.assignValues("Nikhil", 2, 20000);
    e1.display();

  }

}
