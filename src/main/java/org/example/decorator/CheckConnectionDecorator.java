package org.example.decorator;

/**
 * Decorator that checks internet connection
 */
public class CheckConnectionDecorator extends ApiGetterDecorator {

  public CheckConnectionDecorator(ApiGetter apiGetter) {
    super(apiGetter);
  }

  @Override
  public String get() throws Exception {
    Process process = java.lang.Runtime.getRuntime().exec("ping www.geeksforgeeks.org");
    int x = process.waitFor();
    if (x == 0) {
      System.out.println("Connection Successful");
      return super.get();
    } else {
      return "Internet Not Connected";
    }
  }
}
