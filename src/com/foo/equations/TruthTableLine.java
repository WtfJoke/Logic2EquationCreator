package com.foo.equations;

import java.util.ArrayList;
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

	public int getHeaderIndex(String headerName) {
		return headerLine.getHeaders().indexOf(headerName);
	}

	public List<String> getPreceedingValues(int index) {
		List<String> preceedingValues = new ArrayList<>();
		for (int i = 0; i < index; i++) {
			String value = getValues().get(index);
			preceedingValues.add(value);
		}
		return preceedingValues;
	}

	public NewTruthTableLine asNewLine() {
		List<TruthTableEntry> entries = new ArrayList<>();
		for (int i = 0; i < getValues().size(); i++) {
			String headerName = getHeaderLine().getHeaders().get(i);
			String value = getValues().get(i);
			TruthTableEntry truthTableEntry = new TruthTableEntry(headerName, value);
			entries.add(truthTableEntry);
		}
		return new NewTruthTableLine(entries);

	}

}
