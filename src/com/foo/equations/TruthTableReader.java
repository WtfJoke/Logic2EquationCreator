package com.foo.equations;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class TruthTableReader {

	private static final String HEADER_NAME = "B";

	public void read() throws IOException {
		Path sourceFile = Paths.get("C:\\BCD.csv");
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

		ArrayList<TruthTableLine> allLinesWithTrue = Line.getAllLinesWithTrue(HEADER_NAME);
		for (TruthTableLine truthTableLine : allLinesWithTrue) {
			int headerIndex = truthTableLine.getHeaderIndex(HEADER_NAME);
			String valueFromHeader = truthTableLine.getValues().get(headerIndex);

		}
	}

}
