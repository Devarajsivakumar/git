package org.login.deva;

import java.util.LinkedHashMap;
import java.util.Map;

public class AccuracyOfWord {

	public static void main(String[] args) {
		
		String s = "java is simple java is empty";
		
		String[] sp = s.split(" ");
		Map<String, Integer>mp=new LinkedHashMap<String, Integer>();
		
		for (String c : sp) {
			if (mp.containsKey(c)) {
				
				Integer count = mp.get(c);
				mp.put(c, count+1);
			}
			
			else {
				mp.put(c, 1);
				
			}
		}
		
		System.out.println(mp);
				

	}

}
