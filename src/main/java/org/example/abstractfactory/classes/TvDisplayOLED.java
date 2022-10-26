package org.example.abstractfactory.classes;

import org.example.abstractfactory.interfaces.TvDisplay;

public class TvDisplayOLED implements TvDisplay {

  @Override
  public void showBigSizeImage() {
    System.out.println("Showing best quality big image:))))");

  }

  @Override
  public void bringBigPleasure() {
    System.out.println("Brings a lot of big pleasureeee....");

  }

  @Override
  public String getName() {
    return "Tv oled display";
  }
}
