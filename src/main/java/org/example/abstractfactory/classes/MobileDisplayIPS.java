package org.example.abstractfactory.classes;

import org.example.abstractfactory.interfaces.MobileDisplay;

public class MobileDisplayIPS implements MobileDisplay {

  @Override
  public void showSmallSizeImage() {
    System.out.println("Showing small image in better than TFT display quality");
  }

  @Override
  public void bringSmallPleasure() {
    System.out.println("More small pleasure incoming...");
  }

  @Override
  public String getName() {
    return "Mobile ips display";
  }
}
