package com.greenfoxacademy.springstart.modell;

public class Greeting {
  Long id;
  String content;

  public Long getid() {
    return id;
  }

  public void setId() {
    this.id = id + 1;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public String getcontent() {
    return content;
  }

  public Greeting(Long id, String content) {
    this.id = id;
    this.content = content;
  }
}
