package com.epam.mjc.collections.combined;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {

        Map<Integer, Set<String>> result = new HashMap<>();

        int length;
        for (String word : sourceMap.keySet()) {
            length = word.length();
            if (sourceMap.containsValue(length)) {
                Set<String> words = new HashSet<>();
                for (String innerWord : sourceMap.keySet()){
                    if (innerWord.length() == length) {
                        words.add(innerWord);
                    }
                }
                result.put(length, words);
            }
        }
        return result;
    }
}
