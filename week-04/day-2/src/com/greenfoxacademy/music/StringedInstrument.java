package com.greenfoxacademy.music;

public abstract class StringedInstrument extends Instrument {
  int numberOfStrings;
  String sound;

  public StringedInstrument(int numberOfStrings, String sound) {
    this.numberOfStrings = numberOfStrings;
    this.sound = sound;
  }

  @Override
  public void play() {
    sound();
  }

  public abstract void sound();

}
