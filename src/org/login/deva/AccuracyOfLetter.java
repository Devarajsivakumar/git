package org.login.deva;

import java.util.LinkedHashMap;
import java.util.Map;

public class AccuracyOfLetter {

	public static void main(String[] args) {
		String s = "greeens";
		
		Map<Character, Integer>mp= newL inkedHashMap<character,Integer>();
		
		for (int i = 0; i < s.length(); i++) {
			char c =s.charAt(i);
			if (mp.containsKey(c)) {
				Integer count = mp.get(c);
				mp.put(c, count);
			}
			
			else {
				mp.put(c, 1);
				
			}
		}
		System.out.println(mp);
	}

}
