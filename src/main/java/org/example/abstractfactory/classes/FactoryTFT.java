package org.example.abstractfactory.classes;

import org.example.abstractfactory.interfaces.Display;
import org.example.abstractfactory.interfaces.DisplayFactory;
import org.example.abstractfactory.interfaces.MobileDisplay;
import org.example.abstractfactory.interfaces.TvDisplay;

public class FactoryTFT implements DisplayFactory {

  @Override
  public Display createScreen() {
    return new DisplayTFT();
  }

  @Override
  public MobileDisplay createMobileScreen() {
    return new MobileDisplayTFT();
  }

  @Override
  public TvDisplay createTvScreen() {
    return new TvDisplayTFT();
  }
}
