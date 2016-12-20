package com.tananaev.problems;

import java.util.LinkedHashMap;

public class LRUCache {

    private int limit;
    private LinkedHashMap<Integer, Integer> cache = new LinkedHashMap<>();

    public LRUCache(int capacity) {
        limit = capacity;
    }

    public int get(int key) {
        Integer value = cache.remove(key);
        if (value != null) {
            cache.put(key, value);
            return value;
        }
        return -1;
    }

    public void set(int key, int value) {
        cache.remove(key);
        cache.put(key, value);
        if (cache.size() > limit) {
            cache.remove(cache.keySet().iterator().next());
        }
    }

}
