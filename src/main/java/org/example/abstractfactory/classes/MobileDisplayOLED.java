package org.example.abstractfactory.classes;

import org.example.abstractfactory.interfaces.MobileDisplay;

public class MobileDisplayOLED implements MobileDisplay {

  @Override
  public void showSmallSizeImage() {
    System.out.println("Showing best quality small image:))))");

  }

  @Override
  public void bringSmallPleasure() {
    System.out.println("Brings a lot of small pleasureeee....");
  }
  @Override
  public String getName() {
    return "Mobile oled display";
  }
}
