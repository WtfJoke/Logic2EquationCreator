package com.foo.equations;

import java.util.HashMap;

public class Line {

  private static HashMap<Integer, TruthTableLine> lineMap;

  static {
    lineMap = new HashMap<>();
  }

  public static void registerLine(int lineNumber, TruthTableLine tableLine) {
    getLineMap().put(new Integer(lineNumber), tableLine);
  }

  public static TruthTableLine getLine(int lineNumber) {
    TruthTableLine truthTableLine = getLineMap().get(new Integer(lineNumber));
    String header = truthTableLine.getHeaderLine().getHeaders().get(lineNumber);
    String value = truthTableLine.getValues().get(lineNumber);
    HashMap<Object, Object> map = new HashMap<>();
    return truthTableLine;
  }

  public static HashMap<Integer, TruthTableLine> getLineMap() {
    return lineMap;
  }

  public HashMap<String, Integer> getValueAtPosition(int lineNumber) {
    // getHeaderLine().
    return null;
  }



}
