package com.varxyz.jv200.mod009;

import java.util.*;

public class SetExample {
	public static void main(String[] srgs) {
		Set set = new HashSet();
		set.add("one");
		set.add("second");
		set.add("3rd");
		set.add(new Integer(4));
		set.add(new Float(5.0F));
		set.add("second");
		set.add(new Integer(4));
		System.out.println(set);
	}
}
