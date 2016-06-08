package com.foo.equations;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Line {

	private static HashMap<Integer, TruthTableLine> lineMap;

	static {
		lineMap = new HashMap<>();
	}

	public static void registerLine(int lineNumber, TruthTableLine tableLine) {
		getLineMap().put(Integer.valueOf(lineNumber), tableLine);
	}

	public static TruthTableLine getLine(int lineNumber) {
		TruthTableLine truthTableLine = getLineMap().get(Integer.valueOf(lineNumber));
		return truthTableLine;
	}

	public static HashMap<Integer, TruthTableLine> getLineMap() {
		return lineMap;
	}

	public static List<TruthTableLine> getValueAtPosition(int lineNumber, String headerName) {
		TruthTableLine line = getLine(lineNumber);
		HeaderLine headerLine = line.getHeaderLine();
		List<String> headers = headerLine.getHeaders();
		int position = 0;
		for (; position < headers.size(); position++) {
			String headerNameOfList = headers.get(position);
			if (headerName.equals(headerNameOfList)) {
				break;
			}
		}

		String value = line.getValues().get(position);
		ArrayList<TruthTableLine> list = new ArrayList<>();
		list.add(line);
		return list;
	}

	public static ArrayList<TruthTableLine> getAllLinesWithTrue(String headerName) {
		ArrayList<TruthTableLine> allLinesWithTrue = new ArrayList<>();
		for (int i = 1; i < getLineMap().size(); i++) {
			List<TruthTableLine> valueAtPosition = getValueAtPosition(i, headerName);
			allLinesWithTrue.addAll(valueAtPosition);
		}
		return allLinesWithTrue;
	}

}
