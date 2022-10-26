package org.example.abstractfactory.classes;

import org.example.abstractfactory.interfaces.Display;

public class DisplayTFT implements Display {

  @Override
  public void showMediumSizeImage() {
    System.out.println("Showing image in bad quality:(");
  }

  @Override
  public void bringMediumPleasure() {
    System.out.println("Brings not a lot of pleasure");
  }

  @Override
  public String getName() {
    return "tft display";
  }
}
