class Teacher {
  public void answer() {
    System.out.println("answer");
  }
  public void teach(){
    new Student().learn();
  }
}

class Student {
  public void learn() {
    System.out.println("learn");
  }
  public void question() {
    new Teacher().answer();
  }
}

public class TeachersAndStudents {
  public static void main(String[] args) {

    Teacher one = new Teacher();
    one.teach();

    Student two = new Student();
    two.question();

  }
}
