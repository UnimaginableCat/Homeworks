package org.example.abstractfactory.classes;

import org.example.abstractfactory.interfaces.Display;

public class DisplayOLED implements Display {

  @Override
  public void showMediumSizeImage() {
    System.out.println("Showing best quality image:))))");
  }

  @Override
  public void bringMediumPleasure() {
    System.out.println("Brings a lot of pleasureeee....");
  }


  @Override
  public String getName() {
    return "oled display";
  }
}
