package org.example.decorator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ApiGetterTest {

  /**
   * Не знал как протестировать декоратор, так что просто показываю что он делает(проверяет соединение)
   * @throws Exception
   */
  @Test
  void get() throws Exception {

    String res = "";
    ApiGetter getter = new ApiGetter();
    System.out.println("Without decorator");
    res = getter.get();
    System.out.println(res);



    System.out.println("With decorator");
    CheckConnectionDecorator decorator = new CheckConnectionDecorator(getter);
    res = decorator.get();
    System.out.println(res);
  }
}