package org.example.abstractfactory.classes;

import org.example.abstractfactory.interfaces.TvDisplay;

public class TvDisplayIPS implements TvDisplay {

  @Override
  public void showBigSizeImage() {
    System.out.println("Showing small image in better than TFT display quality");
  }

  @Override
  public void bringBigPleasure() {
    System.out.println("More small pleasure incoming...");
  }

  @Override
  public String getName() {
    return "Tv ips display";
  }
}
