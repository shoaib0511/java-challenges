package com.javachallenges;

import java.util.HashMap;
import java.util.Map;

/** Soon you will see the answers on 
     nobugsproject.com */
public class PutMapChallenge {
	public static void main(String... doYourBest) {
		Map<Map<String,String>, String> mainMap = new HashMap<>();
		
		Map<String, String> subMap1 = new HashMap<>();
		subMap1.put("A", "A");
		Map<String, String> subMap2 = new HashMap<>();
		subMap2.put("A", "A");
		Map<String, String> subMap3 = new HashMap<>();
		subMap3.put("A", "A");

		mainMap.put(subMap1, "crazyMap1");
		mainMap.put(subMap2, "crazyMap2");
		mainMap.put(subMap3, "crazyMap3");
		System.out.println(mainMap.size());
	}
    //// 1
    ///  1
    ///y
}
