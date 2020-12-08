package com.greenfoxacademy.music;

public class BassGuitar extends StringedInstrument{

  public BassGuitar() {
    super(4, "Duum-duum-duum");
  }
  public BassGuitar(int strings) {
    super(strings, "Duum-duum-duum");
  }

  @Override
  public void sound() {
    System.out.println("Bass guitar, a " + numberOfStrings + " stringed instrument that goes " + sound);

  }
}
