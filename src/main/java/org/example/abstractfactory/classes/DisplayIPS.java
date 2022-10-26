package org.example.abstractfactory.classes;

import org.example.abstractfactory.interfaces.Display;

public class DisplayIPS implements Display {

  @Override
  public void showMediumSizeImage() {
    System.out.println("Showing image in better than TFT display quality");
  }

  @Override
  public void bringMediumPleasure() {
    System.out.println("More pleasure incoming...");
  }

  @Override
  public String getName() {
    return "ips display";
  }
}
