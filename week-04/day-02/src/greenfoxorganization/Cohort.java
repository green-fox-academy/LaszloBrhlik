package greenfoxorganization;

import java.util.Collections;
import java.util.List;

public class Cohort {

  String name;
  List<Student> students;
  List<Mentor> mentors;

  public Cohort(String name) {
    this.name = name;
    this.students = Collections.emptyList();
    this.mentors = Collections.emptyList();
  }

  public void addStudent(Student student) {
    this.students.add(student);
  }

  public void addMentor(Mentor mentor) {
    this.mentors.add(mentor);
  }

  public void info() {
    System.out.println("The " + name + " cohort has " + students.size() + " students and " +
    mentors.size() + " mentors.");

  }
}
