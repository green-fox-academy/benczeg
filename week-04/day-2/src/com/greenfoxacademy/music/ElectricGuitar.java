package com.greenfoxacademy.music;

public class ElectricGuitar extends StringedInstrument {

  public ElectricGuitar() {
    super(6, "Twang");
  }

  public ElectricGuitar(int strings) {
    super(strings, "Twang");
  }

  @Override
  public void sound() {
    System.out.println("Electric guitar, a " + numberOfStrings + " stringed instrument that goes " + sound);
  }
}
