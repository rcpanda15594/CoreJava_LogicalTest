package com.logical;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class ComparessionString_Write_Count_Of_Value {

	public static void main(String[] args) {

		String s = "INDIA";

		Map<Character, Integer> m = new LinkedHashMap<>();
		for (int i = 0; i < s.length(); i++) {
			if (m.get(s.charAt(i)) != null) {
				m.put(s.charAt(i), m.get(s.charAt(i)) + 1);
			} else {
				m.put(s.charAt(i), 1);
			}
		}
		StringBuilder b = new StringBuilder();
		Set<Character> set = m.keySet();

		for (Character c : set) {
			b.append(c);
			b.append(m.get(c));
		}
		System.out.println(b);
	}

}
