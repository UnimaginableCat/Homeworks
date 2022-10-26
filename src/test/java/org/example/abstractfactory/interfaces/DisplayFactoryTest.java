package org.example.abstractfactory.interfaces;

import org.example.abstractfactory.classes.FactoryIPS;
import org.example.abstractfactory.classes.FactoryOLED;
import org.example.abstractfactory.classes.FactoryTFT;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DisplayFactoryTest {

  DisplayFactory tftFactory;
  DisplayFactory ipsFactory;
  DisplayFactory oledFactory;

  @BeforeEach
  void setUp() {
    tftFactory = new FactoryTFT();
    ipsFactory = new FactoryIPS();
    oledFactory = new FactoryOLED();
  }

  @Test
  void createScreen() {
    Assertions.assertEquals("tft display", tftFactory.createScreen().getName());
    Assertions.assertEquals("ips display", ipsFactory.createScreen().getName());
    Assertions.assertEquals("oled display", oledFactory.createScreen().getName());
  }

  @Test
  void createMobileScreen() {
    Assertions.assertEquals("Mobile tft display", tftFactory.createMobileScreen().getName());
    Assertions.assertEquals("Mobile ips display", ipsFactory.createMobileScreen().getName());
    Assertions.assertEquals("Mobile oled display", oledFactory.createMobileScreen().getName());
  }

  @Test
  void createTvScreen() {
    Assertions.assertEquals("Tv tft display", tftFactory.createTvScreen().getName());
    Assertions.assertEquals("Tv ips display", ipsFactory.createTvScreen().getName());
    Assertions.assertEquals("Tv oled display", oledFactory.createTvScreen().getName());
  }
}