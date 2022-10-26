package org.example.abstractfactory.classes;

import org.example.abstractfactory.interfaces.TvDisplay;

public class TvDisplayTFT implements TvDisplay {

  @Override
  public void showBigSizeImage() {
    System.out.println("Showing big image in bad quality:(");

  }

  @Override
  public void bringBigPleasure() {
    System.out.println("Showing big image in bad quality:(");
  }

  @Override
  public String getName() {
    return "Tv tft display";
  }
}
