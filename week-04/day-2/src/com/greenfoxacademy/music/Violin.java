package com.greenfoxacademy.music;

public class Violin extends StringedInstrument{

  public Violin() {
    super(4, "Screech");
  }

  @Override
  public void sound() {
    System.out.println("Violin, a " + numberOfStrings + " stringed instrument that goes " + sound);
  }
}
