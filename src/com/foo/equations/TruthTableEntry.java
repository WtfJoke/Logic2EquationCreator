package com.foo.equations;

public class TruthTableEntry {

	private final String headerName;
	private final String tableEntry;

	public TruthTableEntry(String headerName, String tableEntry) {
		this.headerName = headerName;
		this.tableEntry = tableEntry;
	}

	public String getHeaderName() {
		return headerName;
	}

	public String getTableEntry() {
		return tableEntry;
	}
}
