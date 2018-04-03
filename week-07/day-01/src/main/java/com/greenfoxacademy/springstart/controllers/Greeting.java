package controllers;

public class Greeting {
  long id;

  public Greeting(long id, String content) {
    this.id = id;
    this.content = content;
  }

  String content;

  public void setId(long id) {
    this.id = id;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public long getId() {
    return id;
  }

  public String getContent() {
    return content;
  }
}
