package cloneable;

public class Main {

  public static void main(String[] args) throws CloneNotSupportedException {

    Student henry = new Student("Henry", 30, "Male", "Google");
    Student john = (Student) henry.clone();
    john.introduce();

  }
}
