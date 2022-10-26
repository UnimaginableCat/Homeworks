package org.example.decorator;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

/**
 * Simple class that gets bitcoin price from public api
 */
public class ApiGetter implements ApiGetterInterface {

  private final String uri = "https://api.coindesk.com/v1/bpi/currentprice.json";

  @Override
  public String get() throws Exception {
    HttpClient client = HttpClient.newHttpClient();

    HttpRequest request = HttpRequest.newBuilder()
        .uri(URI.create(uri))
        .build();

    HttpResponse<String> response =
        client.send(request, BodyHandlers.ofString());

    return response.body();
  }

}
