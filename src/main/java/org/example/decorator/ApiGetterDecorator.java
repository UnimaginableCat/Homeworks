package org.example.decorator;

/**
 * ApiGetter decorator
 */
public class ApiGetterDecorator implements ApiGetterInterface {


  private ApiGetter getter;

  public ApiGetterDecorator(ApiGetter apiGetter) {
    getter = apiGetter;
  }

  @Override
  public String get() throws Exception {
    return getter.get();
  }
}
