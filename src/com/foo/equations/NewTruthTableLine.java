package com.foo.equations;

import java.util.List;

public class NewTruthTableLine {

	private final List<TruthTableEntry> entries;

	public NewTruthTableLine(List<TruthTableEntry> entries) {
		this.entries = entries;
	}

	public List<TruthTableEntry> getEntries() {
		return entries;
	}
}
