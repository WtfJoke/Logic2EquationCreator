package com.foo.equations;

import java.util.Arrays;
import java.util.List;

public class HeaderLine {

  private final List<String> headers;

  public HeaderLine(String... split) {
    headers = Arrays.asList(split);
  }

  public int size() {
    return getHeaders().size();
  }

  public List<String> getHeaders() {
    return headers;
  }



}
