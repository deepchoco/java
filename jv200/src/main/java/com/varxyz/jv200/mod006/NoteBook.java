package com.varxyz.jv200.mod006;

public class NoteBook extends Product {
	public NoteBook(String name) {
		super(name);
	}
	@Override
	public double getPrice() {
		return 25000.0;
	}
}
