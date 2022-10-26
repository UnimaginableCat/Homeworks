package org.example.abstractfactory.classes;

import org.example.abstractfactory.interfaces.Display;
import org.example.abstractfactory.interfaces.DisplayFactory;
import org.example.abstractfactory.interfaces.MobileDisplay;
import org.example.abstractfactory.interfaces.TvDisplay;

public class FactoryOLED implements DisplayFactory {

  @Override
  public Display createScreen() {
    return new DisplayOLED();
  }

  @Override
  public MobileDisplay createMobileScreen() {
    return new MobileDisplayOLED();
  }

  @Override
  public TvDisplay createTvScreen() {
    return new TvDisplayOLED();
  }
}
