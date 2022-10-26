package org.example.abstractfactory.classes;

import org.example.abstractfactory.interfaces.MobileDisplay;

public class MobileDisplayTFT implements MobileDisplay {

  @Override
  public void showSmallSizeImage() {
    System.out.println("Showing small image in bad quality:(");
  }

  @Override
  public void bringSmallPleasure() {
    System.out.println("Brings not a lot of small pleasure");
  }
  @Override
  public String getName() {
    return "Mobile tft display";
  }
}
