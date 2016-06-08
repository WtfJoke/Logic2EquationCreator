package com.foo.equations;

import java.util.Arrays;
import java.util.List;

public class TruthTableLine {

  private final HeaderLine headerLine;
  private final List<String> values;

  public TruthTableLine(HeaderLine headerLine, String[] values) {
    this.headerLine = headerLine;
    this.values = Arrays.asList(values);
  }

  public HeaderLine getHeaderLine() {
    return headerLine;
  }

  public List<String> getValues() {
    return values;
  }

}
