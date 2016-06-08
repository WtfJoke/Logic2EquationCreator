package com.foo.equations;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public class TruthTableReader {

  public void read() throws IOException {
    Path sourceFile = Paths.get("C:\\Rework.csv");
    List<String> allLines = Files.readAllLines(sourceFile);
    boolean firstLine = true;
    HeaderLine headerLine = null;
    for (int i = 0; i < allLines.size(); i++) {
      String line = allLines.get(i);
      if (firstLine) {
        headerLine = new HeaderLine(line.split(";"));
        firstLine = false;
      } else {
        Line.registerLine(i, new TruthTableLine(headerLine, line.split(";")));
      }
    }

    HashMap<Integer, TruthTableLine> lineMap = Line.getLineMap();
    Set<Entry<Integer, TruthTableLine>> entrySet = lineMap.entrySet();
    for (Iterator<Entry<Integer, TruthTableLine>> iterator = entrySet.iterator(); iterator
        .hasNext();) {
      Entry<Integer, TruthTableLine> entry = iterator.next();
      TruthTableLine value = entry.getValue();
      HeaderLine newHeaderLine = value.getHeaderLine();
      value.getValues();


    }
  }

}
