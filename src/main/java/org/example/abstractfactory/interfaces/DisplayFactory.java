package org.example.abstractfactory.interfaces;

/**
 * Abstract screen factory
 */
public interface DisplayFactory {

  Display createScreen();

  MobileDisplay createMobileScreen();

  TvDisplay createTvScreen();
}
