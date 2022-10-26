package org.example.abstractfactory.classes;

import org.example.abstractfactory.interfaces.Display;
import org.example.abstractfactory.interfaces.DisplayFactory;
import org.example.abstractfactory.interfaces.MobileDisplay;
import org.example.abstractfactory.interfaces.TvDisplay;

public class FactoryIPS implements DisplayFactory {

  @Override
  public Display createScreen() {
    return new DisplayIPS();
  }

  @Override
  public MobileDisplay createMobileScreen() {
    return new MobileDisplayIPS();
  }

  @Override
  public TvDisplay createTvScreen() {
    return new TvDisplayIPS();
  }
}
