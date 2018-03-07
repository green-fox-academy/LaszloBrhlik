package cloneable;

public class Main {

  public static void main(String[] args) throws CloneNotSupportedException {

    Student henry = new Student();
    Student john = (Student) henry.clone();


  }
}
